
package monopoly;

public class JailTile extends Tile
    {
                
        public JailTile(String name, int xCoord, int yCoord)
        {
            super(name, xCoord, yCoord);
        }
        
        public void doAction(Player player, Board board)
        {
            if(player.getJailStatus())
            {
                System.out.println("**Player is in jail**");
            }else
            {
                System.out.println("Player is just visiting jail");
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
