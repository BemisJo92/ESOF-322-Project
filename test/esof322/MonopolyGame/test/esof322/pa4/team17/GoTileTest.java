/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

import esof322.pa4.team17.GoTile;
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
public class GoTileTest {
    
    public GoTileTest() {
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

//    @Test
//    public void testDoAction()
//    {
//        GUI g = new GUI();
//        Board b = new Board(1,g);
//        Player[] players = b.getPlayers();
//        Player p = players[0];
//        int startingMoney = p.getMoney();
//        GoTile gt = new GoTile("TestGo Tile", 10,10);
//        gt.doAction(p, b);
//        int actual = p.getMoney();
//        int expected = startingMoney + 200;
//        assertEquals(expected,actual);
//    }
    @Test
    public void testGetMortgage()
    {
        GoTile t = new GoTile("TestGo Tile", 10,10);
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    public void testSetMortgageStatus()
    {
        GoTile t = new GoTile("TestGo Tile", 10,10);
        Boolean status = false;
        try{
        t.setMortgageStatus(true); 
        }catch(UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected, actual);
    }
}
