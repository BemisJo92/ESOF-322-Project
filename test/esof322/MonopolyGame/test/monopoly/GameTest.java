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
 * @author Hedwigg
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of TimedExit method, of class Game.
     */
    @Test
    public void testTimedExit() {
        System.out.println("TimedExit");
        Game instance = null;
        instance.TimedExit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class Game.
     */
    @Test
    public void testStartGame() throws Exception {
        System.out.println("startGame");
        Game instance = new Game(1);
        Player player = new Player(0, "TestPlayer");
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        
        
    }

    /**
     * Test of gameOver method, of class Game.
     */
    @Test
    public void testGameOver() throws Exception {
        System.out.println("gameOver");
        Game instance = new Game(1);
        instance.gameOver();
        //when the game is over, the status should be set to false.
        Boolean expected = false;
        Boolean actual = instance.getGameStatus();
        assertEquals(expected, actual);
    }

    /**
     * Test of getBoard method, of class Game.
     */
    @Test
    public void testGetBoard() {
        System.out.println("getBoard");
        Game instance = null;
        Board expResult = null;
        Board result = instance.getBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetGameStatus()
    {
        System.out.println("getGameStatus");
        Game instance = new Game(1);
        Boolean expected = true;
        Boolean actual = instance.getGameStatus();
        assertEquals(expected, actual);
    }
}
