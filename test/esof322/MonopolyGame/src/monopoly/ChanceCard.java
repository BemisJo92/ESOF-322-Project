
package monopoly;


public class ChanceCard {
    private final String cardName;
    private final int cardID;
    private final int toTileNum;
    private final int moneyAdjust;
    
    public ChanceCard(String name, int toTileNumber, int moneyAdjustAmount)
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
