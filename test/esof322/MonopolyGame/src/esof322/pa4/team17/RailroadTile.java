
package esof322.pa4.team17;

import java.util.Scanner;



public class RailroadTile extends Tile
{
    GUI gui;
    final private int[] rent = {25,50,100,200}; // 25,50,100,200
    
    int owner = -1; //the number of the player who owns the property (-1 means no-one owns the property)
    final private int purchasePrice = 200; //all railroads have a purchase amount of $200
    final private int mortgageValue = 100; //all railroads have a mortgage of $100
    Boolean mortgageStatus = false;
    
    public RailroadTile(String name, int xCoord, int yCoord)
        {super(name, xCoord, yCoord);}
    
    public int getRent(int i)           //return approperate value of rent
        {return rent[i-1];}
    
    public int getMortgage()
        {return mortgageValue;}
    
    
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
                int taxes = 0;
                
                //determine number of railroads player has\
                Player[] players = board.getPlayers();
                int railroadsOwned = players[owner].numRailroadsOwned;
                if(railroadsOwned == 1)
                {
                    taxes = getRent(1);
                }
                else if(railroadsOwned == 2)
                {
                    taxes = getRent(2);
                }
                else if(railroadsOwned == 3)
                {
                    taxes = getRent(3);
                }
                else if(railroadsOwned == 4)
                {
                    taxes = getRent(4);
                }
                
                if(super.getMortgageStatus()==true)
                {
                    taxes = 0;
                    gui.display("This property is currently mortgaged, no taxes will be paid");
                }
                else
                {
                    String playerName = players[owner].getName();
                    gui.display(player.getName() + " pays $" + taxes + " to " + playerName);
                    player.removeMoney(taxes);
                    players[owner].addMoney(taxes);
                }
            }
        }
    }
}