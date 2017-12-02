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
    //Tests getMoneyAdjust method in class ChanceCard. Just checks to see if method returns the correct value
    public void testGetMoneyAdjust()
    {
        GUI g = new GUI(1);
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
        GUI g = new GUI(1);
        Player p = new Player(0, "Player 1");
        int previousMoney = p.getMoney();
        ChanceCard c = new ChanceCard("testcard", -1, -100);
        int actual = c.getMoneyAdjust();
        int expected = -100;
        assertEquals(expected,actual);   
    }
    
    @Test
    //Tests the getCardID method in class ChanceCard Note: card ID is just the card's number out of the total amount of chanceCards
    public void testGetCardID()
    {
        ChanceCard c = new ChanceCard("testCard", -1, 100);
        int actual = c.getCardID();
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    //Tests simple getName method in class ChanceCard
    public void testGetName()
    {
        ChanceCard c = new ChanceCard("testCard3", -1, 100);
        String actual = c.getName();
        String expected = "testCard3";
        assertEquals(expected, actual);
    }
    
    @Test
    //Tests getToTileIDNum in class ChanceCard when the chanceCard has a totileid of -1 meaning it does not affect the player's position
    public void testGetToTileIDNumvoid()
    {
        ChanceCard c = new ChanceCard("testCard4", -1, 100);
        int actual = c.getToTileNum();
        int expected = -1;
        assertEquals(expected,actual);
    }
    
    @Test
    //Tests getToTileIDNum in class ChanceCard whe the chanceCard moves a player to a new position/tile on the board (ex go to jail)
    public void testGetToTileIDNumpos()
    {
        ChanceCard c = new ChanceCard("testCard5", 30, 100);
        int actual = c.getToTileNum();
        int expected = 30;
        assertEquals(expected,actual);
    }
}
