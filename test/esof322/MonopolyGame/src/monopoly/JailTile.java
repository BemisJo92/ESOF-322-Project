
package monopoly;

public class JailTile extends Tile
    {
        boolean inJail = false;
                
        public JailTile(String name)
        {
            super(name);
        }
        
        public void doAction(Player player, Board board)
        {
            if(inJail)
            {
                //player is in jail. need to finish
                System.out.println(player.getName() + " is in Jail.");
            }
            else
            {
                //player is not in jail. need to finish
                System.out.println(player.getName() + " is not in jail.");
            }
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
