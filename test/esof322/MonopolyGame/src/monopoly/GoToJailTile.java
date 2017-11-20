
package monopoly;


public class GoToJailTile extends Tile
    {

        GUI gui;
        public GoToJailTile(String name, int xCoord, int yCoord)
        {
            super(name, xCoord, yCoord);
            
        }
        
        public void doAction(Player player, Board board)
        {
            gui = board.getGui();
            gui.display(player.getName() + " must go to Jail.");
            //move player to jail here and set jailStatus to True
            player.setJailStatus(true);
            board.moveToJail(player);
        }

    @Override
    public int getMortgage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
