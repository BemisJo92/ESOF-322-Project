package esof322.pa4.team17;

import java.util.Scanner;

class PropertyTile extends Tile {
    private final String name;
    private final int purchasePrice;
    private final int[] rents = new int[6]; //rent,rent1h,rent2h,rent3h,rent4h,rentHotel
    private final int houseCost, hotelCost, mortgageValue;
    GUI gui;
    
    int owner = -1; //the number of the player who owns the property (-1 means no one owns the property)
    int numHouses, numhotels = 0;  //number of houses and hotels on the property is initially 0
        
    
    //constructor
    public PropertyTile(String name,int xCoord, int yCoord, 
                        int purchasePrice, 
                        int rent, 
                        int rent1h, 
                        int rent2h, 
                        int rent3h, 
                        int rent4h, 
                        int rentHotel, 
                        int houseCost, 
                        int hotelCost, 
                        int mortgageValue) 
    {
        super(name, xCoord, yCoord);
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
        {this.owner = owner;}

    public int getPrice()
        {return purchasePrice;}
    
    public int getRent(int i) //return rent
        {return rents[i];}
    
    public int getHouseCost()
        {return houseCost;}
    
    public int getHotelCost()
        {return hotelCost;}
    
    public int getMortgage()
        {return mortgageValue;}
   
    public int getTileID()
        {return super.getTileID();}        
    
    @Override
    public void doAction(Player player, Board board)
    {
        Scanner scanner = new Scanner(System.in);
        gui = board.getGui();
        if(owner == -1)   //if no one owns the house
        {
            int choice = 0;
            
            if(player.getMoney() < purchasePrice)
            {
                gui.display(player.getName() + " does not have enough money to purchase this property.");
                gui.display("You need $" + (purchasePrice - player.getMoney()) + " more dollars.");
                gui.display("Do you want to mortgage a property"
                        + "? Enter 1 for yes and 0 for no.");
                choice = 0;
                choice = scanner.nextInt();
                switch(choice)
                {
                    case 0:
                        gui.display("Player elects not to mortgage their properties.");
                        break;
                        
                    case 1:
                        gui.display("Player elects to mortgage a property.");
                        player.mortgage(board);
                        break;
                        
                    default:
                        gui.display("Invalid response. Please choose either 1 or 0");
                        break;
                }
            }
            choice = 0;
            gui.display(player.getName() + ", would you like to purchase " + getName() + "?");
            gui.display("Press 1 for Yes and 0 for No");
            choice = scanner.nextInt();
            
            switch(choice)
            {
                case 0:
                    gui.display(player.getName() + " declines to buy " + getName());
                    //will be put up for auction here
                    break;

                case 1:                                 
                    gui.display(player.getName() + " chooses to buy " + getName());
                    owner = player.getIdNum();
                    player.removeMoney(purchasePrice);
                    player.addProperty(this);
                    gui.display(player.getName() + " has " + player.getMoney() + " dollars remaining.");
                    break;

                default:
                    gui.display("This is an invalid option. Please try again.");
                    break;
            }
        }
        else
        {          
            while(player.getMoney() < purchasePrice)
            {
                gui.display("Sorry! You are broke! Please pick a property to mortgage.");            //bug: stuck mortgaging even with enough money to buy property
                
                
                player.mortgage(board);                
            }
            if(owner != player.getIdNum())
            {
                int taxes = purchasePrice;
                if(super.getMortgageStatus()==true)
                {
                    taxes = 0;
                    gui.display("This property is currently mortgaged, no taxes will be paid");
                }
                else
                {
                    Player[] players = board.getPlayers();
                    String playerName = players[owner].getName();
                    gui.display(player.getName() + " pays $" + taxes + " to " + playerName);
                    player.removeMoney(taxes);
                    players[owner].addMoney(taxes);
                }
            }
        }
    }
}