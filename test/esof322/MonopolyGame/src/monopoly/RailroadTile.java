
package monopoly;



public class RailroadTile extends Tile{
    
    final private int[] rent = {25,50,100,200}; // 25,50,100,200
    
    int owner = -1; //the number of the player who owns the property (-1 means no-one owns the property)
    final private int purchaseAmount = 200; //all railroads have a purchase amount of $200

    
    public RailroadTile(String name) {
        super(name);
    }
    
    public int getRent(int i)           //return approperate value of rent
    {
        return rent[i];
    }

    @Override
    public void doAction(Player player, Board board) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on chance tile.");
    }
    
}
