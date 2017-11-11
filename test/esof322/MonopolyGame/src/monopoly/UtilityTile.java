
package monopoly;

public class UtilityTile extends Tile{
    private int owner = -1;                //# of player who owns this property
    //rent is 4x the amount shown on dice if 1 utility owned. and 10x if both utilities owned
    private int purchasePrice = 150; //all utility tiles have a purchase price of $150
    private int mortgageValue = 75; //all utility tiles have a mortgage of $75
    private Boolean mortgageStatus = false;
    
    public UtilityTile(String name, int xCoord, int yCoord)
        {super(name, xCoord, yCoord);}
    
    public int getMortgage()
        {return mortgageValue;}

    @Override
    public void doAction(Player player, Board board) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on Utility Tile");
        //player option to sell or pass
        
        //auction to next player
        
        //already owned, 
    }

    @Override
    public void setMortgageStatus(Boolean status)
        {mortgageStatus = status;}
    
}
