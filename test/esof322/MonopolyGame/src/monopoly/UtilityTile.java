package monopoly;

import java.util.Scanner;

public class UtilityTile extends Tile
{    
    private int owner = -1;                //# of player who owns this property
    
    //rent is 4x the amount shown on dice if 1 utility owned. and 10x if both utilities owned
    //need to implement the rent based off the dice rolls
    
    private int purchasePrice = 150; //all utility tiles have a purchase price of $150
    private int mortgageValue = 75; //all utility tiles have a mortgage of $75
    private Boolean mortgageStatus = false;
    
    public UtilityTile(String name,int xCoord, int yCoord)
        {super(name, xCoord, yCoord);}
    
    public int getMortgage()
        {return mortgageValue;}

    @Override
    public void doAction(Player player, Board board)
    {
        Scanner scanner = new Scanner(System.in);
        if(owner == -1)   //if no one owns the house
        {
            int choice = 0;
            
            if(player.getMoney() < purchasePrice)
            {
                System.out.println(player.getName() + " does not have enough money to purchase this property.");
                System.out.println("You need $" + (purchasePrice - player.getMoney()) + " more dollars.");
                System.out.println("Do you want to mortgage a property"
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
            while(player.getMoney() < purchasePrice)
            {
                System.out.println("Sorry! You are broke! Please pick a property to mortgage.");            //bug: stuck mortgaging even with enough money to buy property
                
                
                player.mortgage(board);                
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

    @Override
    public void setMortgageStatus(Boolean status)
        {mortgageStatus = status;}
    
}
