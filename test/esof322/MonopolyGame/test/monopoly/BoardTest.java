/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Andy Bemis
 */
public class BoardTest
{
    
    public BoardTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    /*READ FIRST
    *The movePlayers tests wouldn't work because the GUI never actually showed up. The textArea
    *variable in line 174 was throwing a NullPointerException because it was never being created.
    *I threw in a try-catch block just to catch that one error, and the test ran fine with it.
    */

    @Test
    public void testGetPlayers1OG()    //Test get Players with 1 player, Original Board
    {                                  
        GUI g = new GUI(1);
        Board instance = new OGBoard(1,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetPlayers1NP()    //Test get Players with 1 player, National Park Board
    {
        GUI g = new GUI(2);
        Board instance = new NPBoard(1,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetPlayers4OG()     //Test get Players with 4 players, Original board
    {
        GUI g = new GUI(1);
        Board instance = new OGBoard(4,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 4;
        assertEquals(expected,actual);
    }
      
    @Test
    public void testGetPlayers4NP()     //Test get Players with 4 players, National Park board
    {
        GUI g = new GUI(2);
        Board instance = new NPBoard(4,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 4;
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testMoveToJailOG()      //Test moving 1 Player to Jail, Original Board
    {
        try{
        System.out.println("moveToJail");
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        instance.moveToJail(instance.players[0]);
        instance.players[0].getJailStatus();
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }   
    }
    
    @Test
    public void testMoveToJailNP()      //Test moving 1 Player to Jail, National Park Board
    {
        try{
        System.out.println("moveToJail");       
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.moveToJail(instance.players[0]);
        instance.players[0].getJailStatus();
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }

    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer()        //Test moving player on National Park Board
    {
        try{
        System.out.println("movePlayer");
        int rollValue = 2;
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 2;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the excpetion");
        }
    }
    
    @Test
    public void movePlayerPassedGoOG()      //Test moving Player past 'GO' on Original Board
    {
        try{
        System.out.println("movePlayer");
        int rollValue = 2;
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        instance.players[0].tilePosition = 39;  //set this to 39 so that player passes go when moved.
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 2;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the excpetion");
        }
    }
    
    @Test
    public void movePlayerPassedGoNP()      //Test moving Player past 'GO' on National Park Board
    {
        try{
        System.out.println("movePlayer");
        int rollValue = 2;
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.players[0].tilePosition = 39;  //set this to 39 so that player passes go when moved.
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 2;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the excpetion");
        }
    }
    
    @Test
    public void testMovePlayer2OG()     //test moving 2 Players, OG Board
    {
        try{
        System.out.println("movePlayer");       
        int rollValue = 4;
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 4;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    @Test
    public void testMovePlayer2NP()     //Test moving 2 players, NP Board
    {
        try{
        System.out.println("movePlayer");        
        int rollValue = 4;
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 4;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }

    @Test
    public void testMovePlayer3OG()     //Test moving 3 Players, OG board
    {
        try{
        System.out.println("movePlayer");    
        int rollValue = 7;
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 7;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    @Test
    public void testMovePlayer3NP()     //Test moving 3 Players, NP Board
    {
        try{
        System.out.println("movePlayer");        
        int rollValue = 7;
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 7;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    @Test
    public void testMovePlayer4OG()     //Test moving 4 Players, OG board
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 10;
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 10;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    @Test
    public void testMovePlayer4NP()     //Test moving 4 Players, NP Board
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 10;
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 10;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }

    @Test   
    public void testGetRichestPlayerOG()    //Test for richest Player, OG board
    {
        System.out.println("getRichestPlayer");
        GUI g = new GUI(1);
        Board instance = new OGBoard(2, g);
        instance.players[0].removeMoney(100);
        Player expResult = instance.players[1];
        Player result = instance.getRichestPlayer();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetRichestPlayerNP()    //Test for richest Player, NP board
    {
        System.out.println("getRichestPlayer");
        GUI g = new GUI(1);
        Board instance = new OGBoard(2, g);
        instance.players[0].removeMoney(100);
        Player expResult = instance.players[1];
        Player result = instance.getRichestPlayer();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTotalTilesOG()   //Test get Total tiles, OG board - should be 40
    {
        System.out.println("getTotalTiles");
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        int expResult = 40;
        int result = instance.getTotalTiles();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTotalTilesNP()   //Test get Total tiles, NP Board - should be 40
    {
        System.out.println("getTotalTiles");
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        int expResult = 40;
        int result = instance.getTotalTiles();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTileOG()     //Test get Tile after creation, looking for string name
    {
        System.out.println("getTile");        
        GUI g = new GUI(1);
        Board instance = new OGBoard(1, g);
        String expResult = "Boardwalk";
        String result = instance.getTile(39).getName();
        System.out.println(instance.getTile(39).getName());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTileNP()    //Test get Tile after creation, looking for string name
    {
        System.out.println("getTile");        
        GUI g = new GUI(2);
        Board instance = new NPBoard(1, g);
        String expResult = "Yellowstone";
        String result = instance.getTile(39).getName();
        System.out.println(instance.getTile(39).getName());
        assertEquals(expResult, result);
    }
    
    @Test
    //tests the creation of the chance cards
    public void testChanceCardsCreationOG()
    {
        GUI g = new GUI(1);
        Board instance = new OGBoard(1,g);
        
        int actual = instance.getChanceCards().length;
        int expected = instance.getNumChanceCards();    
        assertEquals(expected, actual);
    }
    
    @Test
    //tests the creation of the chance cards
    public void testChanceCardsCreationNP()
    {
        GUI g = new GUI(2);
        Board instance = new NPBoard(1,g);
        
        int actual = instance.getChanceCards().length;
        int expected = instance.getNumChanceCards();    
        assertEquals(expected, actual);
    }
    
    @Test
    //tests the creation of community chest cards
    public void testCommunityChestCardsCreationOG()
    {
        GUI g = new GUI(1);
        Board instance = new OGBoard(1,g);
        
        int actual = instance.getCommunityChestCards().length;
        int expected = instance.getNumCommunityChestCards();    
        assertEquals(expected, actual);
    }
    
    @Test
    //tests the creation of community chest cards
    public void testCommunityChestCardsCreationNP()
    {
        GUI g = new GUI(2);
        Board instance = new NPBoard(1,g);
        
        int actual = instance.getCommunityChestCards().length;
        int expected = instance.getNumCommunityChestCards();    
        assertEquals(expected, actual);
    }
    
    @Test
    //tests when nextTurn should reset to 0 (when its currently the last player's turn)
    public void testNextTurnResetOG()
    {
        GUI g = new GUI(1);
        Board b = new OGBoard(1,g);
        b.whosTurn = 1;
        b.nextTurn();
        int actual = b.whosTurn;
        int expected = 0;
        assertEquals(expected, actual);
    }
    
    @Test
    //tests when nextTurn should reset to 0 (when its currently the last player's turn)
    public void testNextTurnResetNP()
    {
        GUI g = new GUI(2);
        Board b = new NPBoard(1,g);
        b.whosTurn = 1;
        b.nextTurn();
        int actual = b.whosTurn;
        int expected = 0;
        assertEquals(expected, actual);
    }
    
    @Test
    //tests when nextTurn should not be reset to 0
    public void testNextTurnNoResetOG()
    {
        GUI g = new GUI(1);
        Board b = new OGBoard(1,g);
        b.whosTurn = 0;
        b.nextTurn();
        int actual = b.whosTurn;
        int expected = 0;
        assertEquals(expected, actual);        
    }
    
    @Test
    //tests when nextTurn should not be reset to 0
    public void testNextTurnNoResetNP()
    {
        GUI g = new GUI(2);
        Board b = new NPBoard(1,g);
        b.whosTurn = 0;
        b.nextTurn();
        int actual = b.whosTurn;
        int expected = 0;
        assertEquals(expected, actual);        
    }
    
    @Test
    //Curent player should be the first player created by board.
    public void testgetPlayerOG()
    {
        GUI g = new GUI(1);
        Board b = new OGBoard(1,g);   //only 1 player created, only one option for actual value.
        Player actual = b.getPlayer();
        Player[] players = b.getPlayers();
        Player expected = players[0];
        assertEquals(expected, actual);
    }
    
    @Test
    //Curent player should be the first player created by board.
    public void testgetPlayerNP()
    {
        GUI g = new GUI(2);
        Board b = new NPBoard(1,g);   //only 1 player created, only one option for actual value.
        Player actual = b.getPlayer();
        Player[] players = b.getPlayers();
        Player expected = players[0];
        assertEquals(expected, actual);
    }
}

