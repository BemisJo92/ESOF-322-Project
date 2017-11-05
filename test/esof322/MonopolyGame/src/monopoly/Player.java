package monopoly;

import java.lang.*;

public class Player 
{
    int tilePosition = 0;               //position on the board 0-3
    int id;
    String name;
    boolean broke = false;
    Money money = new Money();  //do we really need a class for money or can it be handled in player?
    int die;
    int numRailroadsOwned = 0;
    int numBrownOwned = 0;
    int numLightBlueOwned = 0;
    int numPinkOwned = 0; 
    int numOrangeOwned = 0;
    int numRedOwned = 0;
    int numYellowOwned = 0;
    int numGreenOwned = 0;
    int numDarkBlueOwned = 0;
    
    public Player(int idNum, String name)
    {
        this.id = idNum;
        this.name = name;
        money.addMoney(1500);
    }
    public void addMoney(int amount)
    {
        money.addMoney(amount);
    }
    
    public void subtractMoney(int amount)
    {
        money.removeMoney(amount);
    }
    public String getName()
    {
        return name;
    }
    
    public int getIdNum()
    {
        return id;
    }
    
    public int getMoney()
    {
        return money.getMoney();
    }
    
    public boolean isBroke()
    {
        return broke;
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
