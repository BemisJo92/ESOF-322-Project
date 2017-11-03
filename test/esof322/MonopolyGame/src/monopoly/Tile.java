package monopoly;

import java.util.*;

public abstract class Tile 
{
    private final String name;
    //dont think we need these instances here
//    private GoTile go = new GoTile("Go");
//    private JailTile jail = new JailTile("Jail");
//    private GoToJailTile goToJail = new GoToJailTile("Go To Jail");
//    private PropertyTile property = new PropertyTile("Property");
    
    public Tile(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract void doAction(Player player, Board board);  //keep me abstract call to other classes extending tile??
    
//    public void doAction(Player player, Board board)
//    {
//        if(name == "Go")
//        {
//            go.doAction(player, board);
//        }
//        else if(name == "Jail")
//        {
//            jail.doAction(player, board);
//        }
//        else if(name == "Go To Jail")
//        {
//            goToJail.doAction(player, board);
//        }
//        else if(name == "Property")
//        {
//            PropertyTile.doAction(player, board);
//        }
//    }
    
   
    
    
    
    
        
        
        class ChanceTile
        {
            //will be implemented later
        }
        
        class CommunityChestTile
        {
            //will be implemented later
        }
        
        class FreeParkingTile
        {
            //nothing happens, its the next players turn
        }
    }
}
