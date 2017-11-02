package monopoly;

import java.util.*;

public abstract class Tile 
{
    String name;
    private GoTile go = new GoTile("Go");
    private JailTile jail = new JailTile("Jail");
    private GoToJailTile goToJail = new GoToJailTile("Go To Jail");
    private HouseTile house = new HouseTile("House");
    
    public Tile(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void doAction(Player player, Board board)
    {
        if(name == "Go")
        {
            go.doAction(player, board);
        }
        else if(name == "Jail")
        {
            jail.doAction(player, board);
        }
        else if(name == "Go To Jail")
        {
            goToJail.doAction(player, board);
        }
        else if(name == "House")
        {
            house.doAction(player, board);
        }
    }
    
    class GoTile
    {   
        public GoTile(String name)
        {
            Tile.this.name = name;
        }
        
        public void doAction(Player player, Board board)
        {
            System.out.println(player.getName() + " is at Go." + player.getName() + " is receiving $200.");
            player.addMoney(200);
        }
    }
    
    class JailTile
    {
        boolean inJail = false;
        
        public JailTile(String name)
        {
            Tile.this.name = name;
        }
        
        public void doAction(Player player, Board board)
        {
            if(inJail)
            {
                //player is in jail. need to finish
                System.out.println(player.getName() + " is in Jail.");
            }
            else
            {
                //player is not in jail. need to finish
                System.out.println(player.getName() + " is not in jail.");
            }
        }
    }
    
    class GoToJailTile
    {
        public GoToJailTile(String name)
        {
            Tile.this.name = name;
        }
        
        public void doAction(Player player, Board board)
        {
            System.out.println(player.getName() + " must go to Jail.");
            //move player to jail here
        }
    }
    
    class HouseTile
    {
        int price;
        int owner = -1;
        Scanner sc = new Scanner(System.in);
        
        public HouseTile(String name, int price)
        {
            Tile.this.name = name;
            this.price = price;
        }
        
        public void doAction(Player player, Board board)
        {
            if(owner < 0)
            {
                System.out.println(player.getName() + ", would you like to purchase " + getName() + "?");
                System.out.println("Press 1 for Yes and 0 for No");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 0:
                        System.out.println(player.getName() + " declines to buy " + getName());
                        //will be put up for auction here
                        break;
                        
                    case 1:
                        System.out.println(player.getName() + " chooses to buy " + getName());
                        owner = player.getIdNum();
                        player.removeMoney(price);
                        break;
                        
                    default:
                        System.out.println("This is an invalid option. Please try again.");
                        break;
                }
            }
            else
            {
                if(owner != player.getIdNum())
                {
                    int taxes = price * (70/100);
                    System.out.println(player.getName() + " pays $" + taxes + " to " + owner);
                    //owner will later change to return the actual name of the player instead
                    //of just the ID number of the player
                    player.removeMoney(taxes);
                    //add money to owner here. will be implemented in board
                }
            }
        }
        
        class ChanceTile
        {
            //will be implemented later
        }
        
        class CommunityChest
        {
            //will be implemented later
        }
        
        class FreeParking
        {
            //will be implemented later
        }
    }
}
