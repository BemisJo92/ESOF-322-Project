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
        GUI g = new GUI(1);
        ThemeFactory factory = null;

        Game instance = new Game(2);
        instance.theme =1;
        instance.gui = g;
        instance.factory = new ConcreteOG();
        Boolean actual = instance.getGameStatus();
        Boolean expected = true;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetGameStatusFalse()
    {
        GUI g = new GUI(1);
        Game instance = new Game(2);
        instance.theme = 2;
        instance.factory = new ConcreteNP();

        instance.gameStatus = false;
        Boolean actual = instance.getGameStatus();
        Boolean expected = false;
        assertEquals(expected, actual);  
    }
}
    