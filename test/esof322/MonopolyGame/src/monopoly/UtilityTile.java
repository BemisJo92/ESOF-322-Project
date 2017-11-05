
package monopoly;

public class UtilityTile extends Tile{
    private int owner = -1;                //# of player who owns this property
    //rent is 4x the amount shown on dice if 1 utility owned. and 10x if both utilities owned
    private int purchasePrice;
    private int mortgageValue;
    
    public UtilityTile(String name, int purchasePrice, int mortgageValue) {
        super(name);
        this.purchasePrice = purchasePrice;
        this.mortgageValue = mortgageValue;
    }

    @Override
    public void doAction(Player player, Board board) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on Utility Tile");
        //player option to sell or pass
        
        //auction to next player
        
        //already owned, 
    }
    
}
