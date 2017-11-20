
package monopoly;


public class CommunityChestTile extends Tile {
    GUI gui;
    public CommunityChestTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
    }

    @Override
    public void doAction(Player player, Board board) {
        gui = board.getGui(); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        gui.display("Landed on community chest tile");
    }

    @Override
    public int getMortgage() {
       //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
