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
    public void testGetMortgage()
    {
        FreeParkingTile t= new FreeParkingTile("FreeparkingTEST",40,40);
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testSetMortgageStatus()
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
    public void testDoAction()
    {
        FreeParkingTile t= new FreeParkingTile("FreeparkingTEST",40,40);
        int actual = 0;
        int expected = 0;
        assertEquals(expected, actual);
        
    }
        
}
