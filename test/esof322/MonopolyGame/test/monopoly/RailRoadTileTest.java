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
public class RailRoadTileTest {
    
    public RailRoadTileTest() {
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
    public void testGetMortgage()
    {
        RailroadTile t = new RailroadTile("TEST RAILROAD TILE",40,240);
        int actual = t.getMortgage();
        int expected = 100; //all railroads have a mortgage value of 100
        assertEquals(expected, actual);
    }
    @Test
    public void testGetRent1()
    {
        RailroadTile t = new RailroadTile("TEST RAILROAD TILE",40,240);
        int actual = t.getRent(1);
        int expected = 25;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent2()
    {
        RailroadTile t = new RailroadTile("TEST RAILROAD TILE",40,240);
        int actual = t.getRent(2);
        int expected = 50;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent3()
    {
        RailroadTile t = new RailroadTile("TEST RAILROAD TILE",40,240);
        int actual = t.getRent(3);
        int expected = 100;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent4()
    {
        RailroadTile t = new RailroadTile("TEST RAILROAD TILE",40,240);
        int actual = t.getRent(4);
        int expected = 200;
        assertEquals(expected,actual);
    }
}
