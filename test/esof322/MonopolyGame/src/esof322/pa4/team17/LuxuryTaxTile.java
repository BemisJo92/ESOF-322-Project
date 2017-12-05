
package esof322.pa4.team17;

public class LuxuryTaxTile extends Tile {
    private final int luxuryTaxAmount = 100;
    GUI gui;
    public LuxuryTaxTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
    }

    @Override
    public void doAction(Player player, Board board) {
        gui = board.getGui();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        gui.display("Landed on Luxury Tile");
        player.removeMoney(luxuryTaxAmount);
    }

    @Override
    public int getMortgage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
