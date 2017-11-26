
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
            if(player.getOutOfJailCards > 0)    //if a player has a get out of jail free card. dont move player to jail and decrement their # of said cards
            {
                gui.display(player.getName() + " has a 'Get out of jail free card' and does not have to go to jail");
                player.useGetOutOfJailFreeCard();
                
            }else
            {
                gui.display(player.getName() + " must go to Jail.");
                //move player to jail here and set jailStatus to True
                player.setJailStatus(true);
                board.moveToJail(player);  
            }
            
        }

    @Override
    public int getMortgage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
