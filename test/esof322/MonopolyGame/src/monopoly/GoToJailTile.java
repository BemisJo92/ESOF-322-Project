
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
        }
    }
