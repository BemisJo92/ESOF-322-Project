package monopoly;

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
        public JailTile(String name)
        {
            Tile.this.name = name;
        }
        
        public void doAction(Player player, Board board)
        {
            System.out.println(player.getName() + " is in Jail." + player.getName() + " loses $500.");
            player.removeMoney(500);
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
        boolean owner = false;
        
        public HouseTile(String name)
        {
            Tile.this.name = name;
        }
        
        public void doAction(Player player, Board board)
        {
            if(owner = false)
            {
                System.out.println(player.getName() + ", would you like to purchase " + getName() + "?");
            }
            else if(owner = true)
            {
                
            }
        }
    }
}
