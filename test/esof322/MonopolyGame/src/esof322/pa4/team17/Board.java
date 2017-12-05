package esof322.pa4.team17;

public abstract class Board 
{
    int whosTurn = 0;
    int totalPlayers = 0;
    Player[] players;
    Tile[] tiles = new Tile[40];

    int jailTile = 10;
    int passGoMoney = 200;
    int numChanceCards = 5;
    int numCommunityChestCards = 5;
    ChanceCard[] chanceCards = new ChanceCard[numChanceCards];
    CommunityChestCard[] communityChestCards = new CommunityChestCard[numCommunityChestCards];
    GUI gui;
    
    
    public Board(int totalPlayers,GUI g)
    {
        this.gui = g;
        players = new Player[totalPlayers];         //array of # of players
        for(int i = 0; i < players.length; i++)     //create 'totalPlayers' new players
        {
            players[i] = new Player(i , "Player " + (i + 1));
        }
       
        createCards(numChanceCards, numCommunityChestCards);
        createTiles();
        
    }
    public abstract void createTiles();
    {}
    
    public void moveToJail(Player player)
    {
        player.setTile(jailTile);
        Tile t = tiles[10];
        t.doAction(player, this);

    }
        
    public void movePlayer(Player player, int rollValue, GUI g)
    {
        int currentTile = player.getCurrentTile();
        if(currentTile + rollValue >= 39)
        {
            g.display(player.getName() + " passed Go");
            //pass or land on Go
            int remainingTiles = (currentTile + rollValue) - 39;
            player.setTile(remainingTiles);
            player.addMoney(passGoMoney);
            
        }
        else
        {
            int nextTile = currentTile + rollValue;
            player.setTile(nextTile);
        }
        g.display(player.getName() + " is on tile " + player.getCurrentTile());
        g.display(player.getName() + "'s money is " + player.getMoney());
        Tile t = tiles[player.getCurrentTile()];
        
        g.movePlayer(player.getIdNum(), t.getX(), t.getY());
        
        t.doAction(player, this);
        
    }
    

    public Player[] getPlayers()
        {return players;}

    // returns the instance of player that has the most 
    public Player getRichestPlayer()
    {
        Player richest = null;
        
        for(Player player:players)
            
            {if(richest == null || richest.getMoney() < player.getMoney())
                {richest = player;}}
        
        return richest;
    }
    
    //changes the counter of whos turn it is, resets it back to 0 if over the total # of players
    public void nextTurn()
    {
        if(++whosTurn >= players.length)
            {whosTurn = 0;}
    }
    
    public Player getPlayer()    //get the player based on who's turn it is
        {return players[whosTurn];}

    //returns total number of tiles
    public int getTotalTiles()
        {return tiles.length;}
    
    //returns instance of tile based off of TileNumber
    public Tile getTile(int i)
        {return tiles[i];}
    
    //returns instance of GUI
    public GUI getGui()
    {
        return gui;
    }
    
    //returns # of chance cards
    public int getNumChanceCards()
    {
        return numChanceCards;
    }
    
    //returns array of chanceCard objects
    public ChanceCard[] getChanceCards()
    {
        return chanceCards;
    }
    
    //returns number of community chest cards
    public int getNumCommunityChestCards()
    {
        return numCommunityChestCards;
    }
    
    //returns array of communitychest card objects
    public CommunityChestCard[] getCommunityChestCards()
    {
        return communityChestCards;
    }
    //creates instances of chance and community chest cards
    private void createCards(int numChance, int numCChest)
        {
            for(int i = 0; i <= numChance; i++)
            {
                switch(i)
                {
                    case 0:
                        chanceCards[i] = new ChanceCard("GO TO JAIL", 10, 0);
                        break;
                    case 1:
                        chanceCards[i] = new ChanceCard("Tax Rebate: Collect $100", -1, 100);
                        break;
                    case 2:
                        chanceCards[i] = new ChanceCard("Get out of jail free card!", -1, 0);
                        break;
                    case 3:
                        chanceCards[i] = new ChanceCard("Win the lottery: Collect $500", -1, 500);
                        break;
                    case 4:
                        chanceCards[i] = new ChanceCard("Proceed to 'GO' and collect $200", 0, 0);
                        break;

                }
            }
            for(int i = 0; i <= numCChest; i++)
            {
                switch(i)
                {
                    case 0:
                        communityChestCards[i] = new CommunityChestCard("Winner winner chicken dinner: Collect $100", -1, 100);
                        break;
                    case 1:
                        communityChestCards[i] = new CommunityChestCard("Lotto Winner: Collect $200", -1, 200);
                        break;
                    case 2:
                        communityChestCards[i] = new CommunityChestCard("Workers compensation: Collect $300", -1, 300);
                        break;
                    case 3:
                        communityChestCards[i] = new CommunityChestCard("Christmas bonus at work! : Collect $400", -1, 400);
                        break;
                    case 4:
                        communityChestCards[i] = new CommunityChestCard("Won a law suit!: Collect $500", -1, 500);
                        break;

                }
            }
        }
}
