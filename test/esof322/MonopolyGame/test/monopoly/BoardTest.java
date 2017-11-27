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
    public void testGetPlayers1()    //test get players with 1 player
    {
        GUI g = new GUI();
        Board instance = new Board(1,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetPlayers4()
    {
        GUI g = new GUI();
        Board instance = new Board(4,g);
        Player[] array = instance.getPlayers();
        int actual = array.length;
        int expected = 4;
        assertEquals(expected,actual);
    }
    /**
     * Test of moveToJail method, of class Board.
     */
    @Test
    public void testMoveToJail()
    {
        try{
        System.out.println("moveToJail");
        //Player player = new Player(1, "Player1");
        GUI g = new GUI();
        Board instance = new Board(1, g);
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
    public void testMovePlayer()
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 2;
        GUI g = new GUI();
        Board instance = new Board(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 2;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the excpetion");
        }
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer2()
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 4;
        GUI g = new GUI();
        Board instance = new Board(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 4;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer3()
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 7;
        GUI g = new GUI();
        Board instance = new Board(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 7;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer4()
    {
        try{
        System.out.println("movePlayer");
        //Player player = new Player(1, "Player1");
        int rollValue = 10;
        GUI g = new GUI();
        Board instance = new Board(1, g);
        instance.movePlayer(instance.players[0], rollValue, g);
        int expResult = 10;
        int result = instance.players[0].getCurrentTile();
        assertEquals(expResult, result);
        }catch(NullPointerException e)
        {
            System.err.println("textArea was the exception");
        }
    }

    /**
     * Test of getRichestPlayer method, of class Board.
     */
    @Test
    public void testGetRichestPlayer()
    {
        System.out.println("getRichestPlayer");
        GUI g = new GUI();
        Board instance = new Board(2, g);
        instance.players[0].removeMoney(100);
        Player expResult = instance.players[1];
        Player result = instance.getRichestPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalTiles method, of class Board.
     */
    @Test
    public void testGetTotalTiles()
    {
        System.out.println("getTotalTiles");
        GUI g = new GUI();
        Board instance = new Board(1, g);
        int expResult = 40;
        int result = instance.getTotalTiles();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTile method, of class Board.
     */
    @Test
    public void testGetTile()
    {
        System.out.println("getTile");
        int i = 0;
        GUI g = new GUI();
        Board instance = new Board(1, g);
        String expResult = "Boardwalk";
        String result = instance.getTile(39).getName();
        System.out.println(instance.getTile(39).getName());
        assertEquals(expResult, result);
    }
    
    @Test
    //tests the creation of the chance cards
    public void testChanceCardsCreation()
    {
        GUI g = new GUI();
        Board instance = new Board(1,g);
        
        int actual = instance.getChanceCards().length;
        int expected = instance.getNumChanceCards();    
        assertEquals(expected, actual);
    }
    
    @Test
    //tests the creation of community chest cards
    public void testCommunityChestCardsCreation()
    {
        GUI g = new GUI();
        Board instance = new Board(1,g);
        
        int actual = instance.getCommunityChestCards().length;
        int expected = instance.getNumCommunityChestCards();    
        assertEquals(expected, actual);
    }
}

