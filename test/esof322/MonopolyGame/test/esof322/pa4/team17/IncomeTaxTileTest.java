/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

import esof322.pa4.team17.IncomeTaxTile;
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
public class IncomeTaxTileTest {
    
    public IncomeTaxTileTest() {
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
        IncomeTaxTile t = new IncomeTaxTile("Income Tax TEST TILE",280,440);
        int expected = -1;
        int actual = t.getMortgage();
        assertEquals(expected,actual);
    }
    @Test
    public void testSetMortgage()
    {
        IncomeTaxTile t = new IncomeTaxTile("Income Tax TEST TILE",280,440);
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
