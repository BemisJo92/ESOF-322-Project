
package monopoly;

public class FreeParkingTile extends Tile {

    public FreeParkingTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
    }

    @Override
    public void doAction(Player player, Board board) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on free parking! Too bad there are no house rules for free parking!");
    }

    @Override
    public int getMortgage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
