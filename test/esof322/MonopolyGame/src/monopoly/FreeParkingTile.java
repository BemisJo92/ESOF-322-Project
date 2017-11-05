
package monopoly;

public class FreeParkingTile extends Tile {

    public FreeParkingTile(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on free parking! To bad there are no house rules for free parking!");
    }
    
}
