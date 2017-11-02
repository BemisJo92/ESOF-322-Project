package monopoly;

import java.lang.*;

public class Player 
{
    int totalTilesTraveled = 0;
    int tilePosition = 0;
    int id;
    String name;
    boolean broke = false;
    Money money = new Money();
    int die;
    
    public Player(int idNum, String name)
    {
        this.id = idNum;
        this.name = name;
        money.addMoney(1500);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Money getMoney()
    {
        return money;
    }
    
    public boolean isBroke()
    {
        return broke;
    }
    
    public int getTotalTilesTraveled()
    {
        return totalTilesTraveled;
    }
    
    public int getCurrentTile()
    {
        return tilePosition;
    }
    
    public int rollDie()
    {
        die = (int) (Math.random() * 6) + 1;
        return die;
    }
    
    public void setTile(int tile)
    {
        this.tilePosition = tile;
    }
    
    public void setBroke(boolean broke)
    {
        this.broke = broke;
    }
}
