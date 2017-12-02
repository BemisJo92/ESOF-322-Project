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
    public void testGetMoneyAdjust()    //Test for getMoneyAdjust  return of int
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getMoneyAdjust();
        int expected = 100;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName()       //Test for getName return of string
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        String actual = c.getName();
        String expected = "Test CommunityChest Card";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetToTileNum()      //Test for getToTileNum return of int
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getToTileNum();
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetCardID()     //Test for testGetCardID return of ID int
    {
        CommunityChestCard c = new CommunityChestCard("Test CommunityChest Card", -1, 100);
        int actual = c.getCardID();
        int expected = 1; //first
        assertEquals(expected,actual);
    }
    @Test
    public void testAdjMoney()      //Test for adjMoney adjustment amount of player money 
    {
        int adjAmount = 100;
        Player p = new Player(1, "testPlayer");
        CommunityChestTile t = new CommunityChestTile("Test community chest",40,160);
        int startingMoney = p.getMoney();
        t.adjMoney(p,adjAmount);
        int actual = p.getMoney();
        int expected = startingMoney + adjAmount;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetMortgage()   //Test for getMortgage return of int 
    {
        CommunityChestTile t = new CommunityChestTile("Test community chest",40,160);
        int expected = -1;
        int actual = t.getMortgage();
        assertEquals(expected,actual);
    }
    @Test
    public void testSetMortgageStatus()     //Test for setMortgageStatus return of boolean of true
    {
        CommunityChestTile t = new CommunityChestTile("Test community chest",40,160);
        Boolean status = false;
        try{
            t.setMortgageStatus(true);
        }catch(UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }
}
