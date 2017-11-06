
package monopoly;


public class GoToJailTile extends Tile
    {

        
        public GoToJailTile(String name)
        {
            super(name);
            
        }
        
        public void doAction(Player player, Board board)
        {
            System.out.println(player.getName() + " must go to Jail.");
            //move player to jail here and set jailStatus to True
            board.moveToJail(player);
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
