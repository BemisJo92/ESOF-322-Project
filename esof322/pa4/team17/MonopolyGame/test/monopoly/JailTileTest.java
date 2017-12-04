package monopoly;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JailTileTest {
    
    public JailTileTest() {
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
    //Tests get mortgage for class jail tile, method is not used in jailTile but is inherited from tile.
    public void testGetMortgage()
    {
        JailTile t = new JailTile("Test Jail Tile",40,440);
        
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected,actual);
           
    }
    @Test
    //Tests setMortgageStatus for class jail tile, method is not used in jailTile but is inherited from tile.
    public void testSetMortgageStatus()
    {
        JailTile t = new JailTile("Test Jail Tile",40,440);
        Boolean status = false;
        try
        {
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
