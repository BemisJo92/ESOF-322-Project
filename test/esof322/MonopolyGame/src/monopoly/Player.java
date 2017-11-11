package monopoly;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Player 
{
    int tilePosition;               //position on the board 0-3
    int id, die, money;
    final String name;
    boolean jailStatus = false;
    int jailStayLength = 0;
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
    
    public boolean getJailStatus()
        {return jailStatus;}
    
    public void setJailStatus(Boolean newStatus)
        {jailStatus = newStatus;}
    
    public int getJailStayLength()
        {return jailStayLength;}
    
    public void resetJailStayLength()
        {jailStayLength = 0;}
    
    public void incrementJailStay()
        {jailStayLength++;}
    
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
    
    public ArrayList getProperties()
        {return properties;}
    
    public void addProperty(PropertyTile property)
        {properties.add(property);}
    
    public void addProperty(RailroadTile property)
        {properties.add(property);}
    
    public void addProperty(UtilityTile property)
        {properties.add(property);}
    
    public void mortgage(Board board)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Here are the properties you can mortgage");
        //display player's properties 

        for(Tile property: properties)
        {
            if(property.getMortgageStatus() == false) // if property is not already mortgaged 
            {
                System.out.println(property.getName() + " mortgage Value: $" + property.getMortgage() + " ID NUM: " + property.getTileID());
            }
        }
       
        System.out.println("What property would you like to mortgage? Please enter the ID number");
        
         //user input for choice
        int choice = scanner.nextInt();
        
        Boolean valid = false;
        while(!valid)                   //check if player actually owns property
        {         
            
            for(Tile property:properties)  
            {
                if (choice == property.getTileID())
                {   
                    valid = true;
                    //break;              //dont waste time searching the rest of properties if you found it
                }
                
            }
            if(!valid)
            {
                System.out.println("That is an invalid choice, please choose a property you own:");
                choice = scanner.nextInt();
            }
        }
        
        board.getTile(choice);
        Tile currentProperty = board.getTile(choice);
        
        //set mortgage boolean on property to true.
        currentProperty.setMortgageStatus(true);
        
        //give player the mortgage money
        addMoney(currentProperty.getMortgage());
        System.out.println(name + " now has $" +getMoney());

    }
}
