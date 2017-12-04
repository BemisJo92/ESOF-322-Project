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
public class UtilityTileTest {
    
    public UtilityTileTest() {
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
        UtilityTile t = new UtilityTile("TEST UTILITY",40,360);
        int actual = t.getMortgage();
        int expected = 75; //all utility tiles have a mortgage value of 75
        assertEquals(expected,actual);
    }
    @Test
    public void testSetMortgageStatus()
    {
        UtilityTile t = new UtilityTile("TEST UTILITY",40,360);
        t.setMortgageStatus(true);
        Boolean actual = t.getMortgageStatus();
        Boolean expected = true;
        assertEquals(expected, actual);
    }
}
