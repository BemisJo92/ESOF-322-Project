
package monopoly;


public class IncomeTaxTile extends Tile{
    private final int incomeTaxAmount = 200;
    public IncomeTaxTile(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on Income Tax tile");       
        player.removeMoney(incomeTaxAmount);
    }
    
}
