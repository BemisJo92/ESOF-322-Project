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

    
    @Test
    public void testGetGameStatusTrue()
    {
        GUI g = new GUI();
        Game instance = new Game(1);
        Boolean actual = instance.getGameStatus();
        Boolean expected = true;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetGameStatusFalse()
    {
        GUI g = new GUI();
        Game instance = new Game(1);
        instance.gameStatus = false;
        Boolean actual = instance.getGameStatus();
        Boolean expected = false;
        assertEquals(expected, actual);  
    }
    @Test
    public void testGetBoard()
    {
        Game g = new Game(1);
        Board actual = g.getBoard();
        Board expected = g.getBoard();
        assertEquals(expected,actual);
    }
}
    