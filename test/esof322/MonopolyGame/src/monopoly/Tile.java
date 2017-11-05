package monopoly;

import java.util.*;

public abstract class Tile 
{
    private final String name;
    
    public Tile(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract void doAction(Player player, Board board);  //keep me abstract call to other classes extending tile??
 
}
