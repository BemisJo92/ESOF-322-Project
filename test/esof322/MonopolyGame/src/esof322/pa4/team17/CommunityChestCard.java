/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

/**
 *
 * @author Hedwigg
 */
public class CommunityChestCard {
    
    private final String cardName;
    private final int cardID;
    private final int toTileNum;
    private final int moneyAdjust;
    
    public CommunityChestCard(String name, int toTileNumber, int moneyAdjustAmount)
    {
        this.cardName = name;
        cardID = Game.tileIDTotal;      //same ID system for TILE
        Game.cardIDTotal++;
        toTileNum = toTileNumber;
        moneyAdjust = moneyAdjustAmount;
        
    }
    
    public int getMoneyAdjust()        
    {
        return moneyAdjust;
    }
    
    public String getName()
    {
        return cardName;    
    }
    
    public int getToTileNum()
    {
        return toTileNum;
    }
    
    public int getCardID()
    {
        return cardID;
    }
}
