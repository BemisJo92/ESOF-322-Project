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

    /**
     * Test of moveToJail method, of class Board.
     */
    @Test
    public void testMoveToJail()
    {
        System.out.println("moveToJail");
        Player player = new Player(1, "Player1");
        Board instance = new Board(1);
        instance.moveToJail(player);
        player.getJailStatus();
    }

    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer()
    {
        System.out.println("movePlayer");
        Player player = new Player(1, "Player1");
        int rollValue = 2;
        GUI g = new GUI();
        Board instance = new Board(1);
        instance.movePlayer(player, rollValue, g);
        int expResult = 2;
        int result = player.getCurrentTile();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer2()
    {
        System.out.println("movePlayer");
        Player player = new Player(1, "Player1");
        int rollValue = 4;
        GUI g = new GUI();
        Board instance = new Board(1);
        instance.movePlayer(player, rollValue, g);
        int expResult = 4;
        int result = player.getCurrentTile();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer3()
    {
        System.out.println("movePlayer");
        Player player = new Player(1, "Player1");
        int rollValue = 7;
        GUI g = new GUI();
        Board instance = new Board(1);
        instance.movePlayer(player, rollValue, g);
        int expResult = 7;
        int result = player.getCurrentTile();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of movePlayer method, of class Board.
     */
    @Test
    public void testMovePlayer4()
    {
        System.out.println("movePlayer");
        Player player = new Player(1, "Player1");
        int rollValue = 10;
        GUI g = new GUI();
        Board instance = new Board(1);
        instance.movePlayer(player, rollValue, g);
        int expResult = 10;
        int result = player.getCurrentTile();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRichestPlayer method, of class Board.
     */
    @Test
    public void testGetRichestPlayer()
    {
        System.out.println("getRichestPlayer");
        Board instance = new Board(2);
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
        Board instance = new Board(1);
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
        Board instance = new Board(1);
        String expResult = "Boardwalk";
        String result = instance.getTile(39).getName();
        System.out.println(instance.getTile(39).getName());
        assertEquals(expResult, result);
    }
    
}