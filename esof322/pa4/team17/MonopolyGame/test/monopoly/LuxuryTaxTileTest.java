
package monopoly;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LuxuryTaxTileTest {
    
    public LuxuryTaxTileTest() {
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
        LuxuryTaxTile instance = new LuxuryTaxTile("Test luxury tax tile",440,360);
        int actual = instance.getMortgage();
        int expected = -1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSetMortgageStatus()
    {
        LuxuryTaxTile instance = new LuxuryTaxTile("Test luxury tax tile",440,360);
        Boolean status = false;
        try{
            instance.setMortgageStatus(true);
        }catch (UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }   
}
