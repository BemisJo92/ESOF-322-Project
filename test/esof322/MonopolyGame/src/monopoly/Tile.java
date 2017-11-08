package monopoly;

import java.util.*;

public abstract class Tile 
{
    private final String name;
    private final int tileID;
    private Boolean mortgageStatus = false;
    
    public Tile(String name)
    {
        this.name = name;
        
        tileID = Game.tileIDTotal;
        Game.tileIDTotal++;
    }
    
    public String getName()
    {
        return name;
    }
    public Boolean getMortgageStatus()
    {
        return mortgageStatus;
    }
    public void setMortgageStatus(Boolean b)
    {
        mortgageStatus = b;
    }
    
   
    public abstract int getMortgage();
        
    public int getTileID()
    {
        return tileID;
    }
    
    public abstract void doAction(Player player, Board board);  //keep me abstract call to other classes extending tile??
 
}
