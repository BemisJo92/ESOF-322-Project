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
public class CommunityChestCardTest {
    
    public CommunityChestCardTest() {
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
    public void testGetMoneyAdjust()    //Test getMoneyAdjust method for Community Chest
    {
        CommunityChestCard c = new CommunityChestCard("TestCommunityChest1", -1, 300);
        int actual = c.getMoneyAdjust();
        int expected = 300;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetName()       //Test for correct name return from Community Chest Card
    {
        CommunityChestCard c = new CommunityChestCard("TestCommunityChest1", -1, 200);
        String actual = c.getName();
        String expected = "TestCommunityChest1";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetToTileNum()     //Test for correct name return from Community Chest
    {
        CommunityChestCard c = new CommunityChestCard("TestCommunityChest", -1, 200);
        int expected = c.getToTileNum();
        int actual = -1;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetCardID()     //Test for correct ID return from Communnity Chest
    {
        CommunityChestCard c = new CommunityChestCard("TestCommunityChest", -1, 200);
        int actual = c.getCardID();
        int expected = 0;
        assertEquals(expected,actual);
    }
}
