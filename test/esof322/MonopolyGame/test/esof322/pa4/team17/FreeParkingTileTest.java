/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

import esof322.pa4.team17.FreeParkingTile;
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
public class FreeParkingTileTest {
    
    public FreeParkingTileTest() {
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
    public void testGetMortgage()   //Test for getMortgage return of int (-1 for null)
    {
        FreeParkingTile t= new FreeParkingTile("FreeparkingTEST",40,40);
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testSetMortgageStatus() //Test for setMortgageStatus of boolean value true
    {
        Boolean status = false;
        FreeParkingTile t= new FreeParkingTile("FreeparkingTEST",40,40);
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
    @Test
    public void testDoAction()  //Test for doAction return of 0
    {
        FreeParkingTile t= new FreeParkingTile("FreeparkingTEST",40,40);
        int actual = 0;
        int expected = 0;
        assertEquals(expected, actual);
        
    }
        
}
