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
public class ChanceCardTest {
    
    public ChanceCardTest() {
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
    public void testGetMoneyAdjust()
    {
        GUI g = new GUI();
        Player p = new Player(0, "Player 1");
        int previousMoney = p.getMoney();
        ChanceCard c = new ChanceCard("testcard", -1, 100);
        int actual =  c.getMoneyAdjust();
        int expected = 100;
        assertEquals(expected,actual);        
    }
    
    @Test
    public void testGetMoneyAdjustNeg()
    {
        GUI g = new GUI();
        Player p = new Player(0, "Player 1");
        int previousMoney = p.getMoney();
        ChanceCard c = new ChanceCard("testcard", -1, -100);
        int actual = c.getMoneyAdjust();
        int expected = -100;
        assertEquals(expected,actual);   
    }
    
    @Test
    public void testGetCardID()
    {
        ChanceCard c = new ChanceCard("testCard", -1, 100);
        int actual = c.getCardID();
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetName()
    {
        ChanceCard c = new ChanceCard("testCard3", -1, 100);
        String actual = c.getName();
        String expected = "testCard3";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetToTileIDNumvoid()
    {
        ChanceCard c = new ChanceCard("testCard4", -1, 100);
        int actual = c.getToTileNum();
        int expected = -1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetToTileIDNumpos()
    {
        ChanceCard c = new ChanceCard("testCard5", 30, 100);
        int actual = c.getToTileNum();
        int expected = 30;
        assertEquals(expected,actual);
    }
}
