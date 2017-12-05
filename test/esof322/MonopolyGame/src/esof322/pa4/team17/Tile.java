package esof322.pa4.team17;

import java.util.*;

public abstract class Tile 
{
    private final String name;
    private final int tileID;
    private Boolean mortgageStatus = false;
    private final int xCoord;
    private final int yCoord;
    
    public Tile(String name, int xCoord, int yCoord)
    {
        this.name = name;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        
        tileID = Game.tileIDTotal;
        Game.tileIDTotal++;
    }
    
    public String getName()
        {return name;}
    
    public Boolean getMortgageStatus()
        {return mortgageStatus;}
    
    public void setMortgageStatus(Boolean b)
        {mortgageStatus = b;}
    
    public abstract int getMortgage();
        
    public int getTileID()
        {return tileID;}
    public int getX()
    {   
        return xCoord;
    }
    public int getY()
    {
        return yCoord;
    }
    public abstract void doAction(Player player, Board board);  //keep me abstract call to other classes extending tile??
 
}
