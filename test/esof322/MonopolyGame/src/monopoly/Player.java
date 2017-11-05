package monopoly;

import java.lang.*;
import java.util.ArrayList;

public class Player 
{
    int tilePosition;               //position on the board 0-3
    int id, die, money;
    String name;
    ArrayList<Tile> properties = new ArrayList<Tile>();
    boolean broke = false;
    boolean mortagageStatus = false;
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
        broke = false;
        tilePosition = 0;
        addMoney(1500);
    }
    
    public int rollDie()
    {
        die = (int) (Math.random() * 6) + 1;
        return die;
    }
    
    public String getName()   
        {return name;}
    
    
    public int getIdNum()    
        {return id;}
  
    public int getCurrentTile()
        {return tilePosition;}
    
    public void setTile(int tile)
        {this.tilePosition = tile;}
    
    public int getMoney()
        {return money;}
    
    public void addMoney(int amount)
        {money += amount;}
    
    public void removeMoney(int amount)
        {money -= amount;}
    
    public boolean isBroke()
        {return money <= 0;}
    
    public void addProperty(Tile property)
    {}
    
    public void mortgage()
    {
        System.out.println("Here are the properties you can mortgage");
        //display player's properties 
        
        
        //user input for choice
        System.out.println("");
        
        //set mortgage boolean on property to true.
       //property.setMortgageStatus(true);
       
        //get mortgage value mValue
        
        //give player mortgageValue money
        addMoney(mValue);
       
    }
}
