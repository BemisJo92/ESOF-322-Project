
package monopoly;


public class CommunityChestTile extends Tile {

    public CommunityChestTile(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on community chest tile");
    }
    
}
