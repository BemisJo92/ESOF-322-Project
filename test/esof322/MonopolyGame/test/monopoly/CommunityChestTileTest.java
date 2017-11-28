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
public class CommunityChestTileTest {
    
    public CommunityChestTileTest() {
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
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getMoneyAdjust();
        int expected = 100;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName()
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        String actual = c.getName();
        String expected = "Test CommunityChest Card";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetToTileNum()
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getToTileNum();
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetCardID()
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getCardID();
        int expected = 0;
        assertEquals(expected,actual);
    }
}