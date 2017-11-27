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
public class ChanceTileTest {
    
    public ChanceTileTest() {
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
    public void testAdjMoney()
    {
        Player p = new Player(0,"TestPlayer");
        int oldMoney = p.getMoney();
        ChanceCard c = new ChanceCard("TestChanceCard", -1,100);
        ChanceTile t = new ChanceTile("Chance 3",440,280);
        t.adjMoney(p,c.getMoneyAdjust());
        int actual = p.getMoney();
        int expected = oldMoney + 100;
        
    }
    @Test
    public void testGetMortgage()
    {
        ChanceTile t = new ChanceTile("Get out of jail free card!", 0, 0);
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected, actual);
    }
}
