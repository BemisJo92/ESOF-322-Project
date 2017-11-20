/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;


public class ChanceTile extends Tile{
    GUI gui;
    public ChanceTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
    }    

    @Override
    public void doAction(Player player, Board board) {
        gui = board.getGui();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        gui.display("Landed on chance tile");
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
