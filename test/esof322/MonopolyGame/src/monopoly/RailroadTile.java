
package monopoly;



public class RailroadTile extends Tile{
    
    final private int[] rent = {25,50,100,200}; // 25,50,100,200
    public int owner = -1; //the number of the player who owns the property (-1 means no-one owns the property)
    final private int mortgageValue;

    
    public RailroadTile(String name, int mortgageValue) {
        super(name);
        this.mortgageValue = mortgageValue;
    }
    
    public int getRent(int i)
    {
        return rent[i];
    }
    
    public int getMortgage()
    {
        return mortgageValue;
    }

    @Override
    public void doAction(Player player, Board board) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Landed on chance tile.");
    }
    
}
