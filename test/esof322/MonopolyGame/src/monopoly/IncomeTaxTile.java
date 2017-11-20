
package monopoly;


public class IncomeTaxTile extends Tile{
    private final int incomeTaxAmount = 200;
    GUI gui;
    public IncomeTaxTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
    }

    @Override
    public void doAction(Player player, Board board) {
        gui = board.getGui();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        gui.display("Landed on Income Tax tile");       
        player.removeMoney(incomeTaxAmount);
    }

    @Override
    public int getMortgage() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
