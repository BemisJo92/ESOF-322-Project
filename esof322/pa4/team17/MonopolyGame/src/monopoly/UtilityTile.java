package monopoly;

import java.util.Scanner;

public class UtilityTile extends Tile
{    
    GUI gui;
    private int owner = -1;                //# of player who owns this property
    
    //rent is 4x the amount shown on dice if 1 utility owned. and 10x if both utilities owned
    //need to implement the rent based off the dice rolls
    
    private int purchasePrice = 150; //all utility tiles have a purchase price of $150
    private int mortgageValue = 75; //all utility tiles have a mortgage of $75
    //private Boolean mortgageStatus = false;
    
    public UtilityTile(String name,int xCoord, int yCoord)
        {super(name, xCoord, yCoord);}
    
    public int getMortgage()
        {return mortgageValue;}

    @Override
    public void doAction(Player player, Board board)
    {
        gui = board.getGui();
        Scanner scanner = new Scanner(System.in);
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

    @Override
    public void setMortgageStatus(Boolean status)
        {super.setMortgageStatus(status);}
    
}
