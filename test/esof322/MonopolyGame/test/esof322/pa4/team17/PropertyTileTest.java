/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

import esof322.pa4.team17.PropertyTile;
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
public class PropertyTileTest {
    
    public PropertyTileTest() {
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
    public void testGetTileID()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getTileID();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void testSetOwner()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        t.setOwner(1);
        int actual = t.owner;
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetPrice()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getPrice();
        int expected = 60;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetRent0()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getRent(0);
        int expected = 4;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent1()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getRent(1);
        int expected = 20;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent2()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getRent(2);
        int expected = 60;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent3()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getRent(3);
        int expected = 180;
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRent4()
    {
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,30);
        int actual = t.getRent(4);
        int expected = 320;
        assertEquals(expected,actual);
    }
    @Test
    public void getHouseCost()
    {
        int hc = 50;
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,hc,50,30);
        int actual = t.getHouseCost();
        int expected = hc;
        assertEquals(expected, actual);
    }
    @Test
    public void getHotelCost()
    {
        int hc = 100;
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,hc,30);
        int actual = t.getHotelCost();
        int expected = hc;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMortgage()
    {
        int mortgage = 30;
        PropertyTile t = new PropertyTile("Baltic Ave",320,440,60,4,20,60,180,320,450,50,50,mortgage);
        int actual = t.getMortgage();
        int expected = mortgage;
        assertEquals(expected, actual);

    }
    
    
}
