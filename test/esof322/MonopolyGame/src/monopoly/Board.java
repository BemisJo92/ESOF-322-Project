import java.util.Random;

public class Board 
{
    int whosTurn = 0;
    int totalPlayers = 0;
    Player[] players;
    Tile[] tiles = new Tile[40];
    
    
    
    public Board(int totalPlayers)
    {
        players = new Player[totalPlayers];         //array of # of players
        for(int i = 0; i < players.length; i++)     //create 'totalPlayers' new players
        {
            players[i] = new Player(i , "Player " + (i + 1));
        }
        
        for(int tilePos = 0; tilePos < tiles.length; tilePos++)
        {
            switch(tilePos)
            {
                case 0: // GO tile
                    tiles[tilePos] = new GoTile("GO");  //make sure correct format with tile class
                    break;
                case 1:
                    break;
                case 2: //first community chest
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:     //first chance
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:    //jail
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break; 
                case 15:
                    break;
                case 16:
                    break;
                case 17:    //2nd community chest
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:    //free parking
                    break;
                case 21:
                    break;
                case 22:       //2nd chance
                    break;
                case 23:
                    break; 
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;
                case 27:
                    break;
                case 28:
                    break;
                case 29:
                    break;
                case 30:    //go to jail
                    break;
                case 31:
                    break;
                case 32:
                    break;
                case 33:   //3rd community chest
                    break;
                case 34:
                    break;
                case 35:
                    break;
                case 36:    //3rd chance
                    break;
                case 37:
                    break;
                case 38:
                    break;
                case 39:
                    break;
                    
            }
    }
    public Tile movePlayer(Player player, int rollValue)    //???
    {
        return movePlayer(player,rollValue, true);
    }
    
    public Tile movePlayer(Player player, int rollValue, boolean count)  //finish
    {
        
        
    }

    public Player[] getPlayers()
    {
        return players;
    }

    public Player getRichestPlayer()
    {
        Player richest = null;
        for(Player player:players)
        {
            if(richest == null || richest.getMoney() < player.getMoney().getMoney())
            {
                richest = player;
            }
        }
        return richest;
    }
    
    public void nextTurn()
    {
        if(++whosTurn >= players.length)
        {
            currentTurn = 0;
        }
    }

    public Player getPlayer(int num)
    {
        return players[num];
    }

    public int getTotalTiles()
    {
        return tiles.length;
    }

}
