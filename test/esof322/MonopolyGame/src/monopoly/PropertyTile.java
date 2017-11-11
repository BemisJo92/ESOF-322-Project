package monopoly;

import java.util.Scanner;

class PropertyTile extends Tile {
    private final String name;
    private final int purchasePrice;
    private final int[] rents = new int[6]; //rent,rent1h,rent2h,rent3h,rent4h,rentHotel
    private final int houseCost, hotelCost, mortgageValue;
    
    int owner = -1; //the number of the player who owns the property (-1 means no one owns the property)
    int numHouses, numhotels = 0;  //number of houses and hotels on the property is initially 0
        
    
    //constructor
    public PropertyTile(String name, int purchasePrice, int rent, int rent1h, int rent2h, int rent3h, int rent4h, int rentHotel, int houseCost, int hotelCost, int mortgageValue) 
    {
        super(name);
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.rents[0] = rent;
        this.rents[1] = rent1h;
        this.rents[2] = rent2h;
        this.rents[3] = rent3h;
        this.rents[4] = rent4h;
        this.rents[5] = rentHotel;
        this.houseCost = houseCost;
        this.hotelCost = hotelCost;
        this.mortgageValue = mortgageValue;
    }
    
    public void setOwner(int owner)
    {
        this.owner = owner;
    }

    public int getPrice()
    {
        return purchasePrice;
    }
    
    public int getRent(int i) //return rent
    {
        return rents[i];
    }
    
    public int getHouseCost()
    {
        return houseCost;
    }
    
    public int getHotelCost()
    {
        return hotelCost;
    }
    
    public int getMortgage()
    {
        return mortgageValue;
    }
   
    public int getTileID()
    {
        return super.getTileID();
    }        
    
    @Override
    public void doAction(Player player, Board board)
    {
        Scanner scanner = new Scanner(System.in);
        if(owner == -1)   //if no one owns the house
        {
            int choice = 0;
            int remainingMoney = player.getMoney();
            if(remainingMoney < purchasePrice)
            {
                System.out.println(player.getName() + " does not have enought money to purchase this property.");
                System.out.println("Do you want to mortgage a property2"
                        + "? Enter 1 for yes and 0 for no.");
                choice = 0;
                choice = scanner.nextInt();
                switch(choice)
                {
                    case 0:
                        System.out.println("Player elects not to mortgage their properties.");
                        break;
                        
                    case 1:
                        System.out.println("Player elects to mortgage a property.");
                        player.mortgage(board);
                        break;
                        
                    default:
                        System.out.println("Invalid response. Please choose either 1 or 0");
                        break;
                }
            }
            choice = 0;
            System.out.println(player.getName() + ", would you like to purchase " + getName() + "?");
            System.out.println("Press 1 for Yes and 0 for No");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 0:
                    System.out.println(player.getName() + " declines to buy " + getName());
                    //will be put up for auction here
                    break;

                case 1:                                 
                    System.out.println(player.getName() + " chooses to buy " + getName());
                    owner = player.getIdNum();
                    player.removeMoney(purchasePrice);
                    player.addProperty(this);
                    System.out.println(player.getName() + " has " + player.getMoney() + " dollars remaining.");
                    break;

                default:
                    System.out.println("This is an invalid option. Please try again.");
                    break;
            }
        }
        else
        {
            int moneyRemaining = player.getMoney();
            while(moneyRemaining < purchasePrice)
            {
                System.out.println("Sorry! You are broke! Please pick a property to mortgage.");            //bug: stuck mortgaging even with enough money to buy property
                
                
                player.mortgage(board);
                
                //Update money of player after mortgaging
                moneyRemaining = player.getMoney();
            }
            if(owner != player.getIdNum())
            {
                int taxes = purchasePrice;
                if(super.getMortgageStatus()==true)
                {
                    taxes = 0;
                    System.out.println("This property is currently mortgaged, no taxes will be paid");
                }
                else
                {
                    Player[] players = board.getPlayers();
                    String playerName = players[owner].getName();
                    System.out.println(player.getName() + " pays $" + taxes + " to " + playerName);
                    player.removeMoney(taxes);
                    players[owner].addMoney(taxes);
                }
            }
        }
    }
}