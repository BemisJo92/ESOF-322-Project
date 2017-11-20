
package monopoly;

public class JailTile extends Tile
    {
        GUI gui;
        public JailTile(String name, int xCoord, int yCoord)
        {
            super(name, xCoord, yCoord);
        }
        
        public void doAction(Player player, Board board)
        {
            gui = board.getGui();
            if(player.getJailStatus())
            {
                gui.display("**Player is in jail**");
            }else
            {
                gui.display("Player is just visiting jail");
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
