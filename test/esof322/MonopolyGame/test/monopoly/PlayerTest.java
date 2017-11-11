
package monopoly;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest
{
    
    public PlayerTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Player instance = new Player(1, "Player1");
        String expResult = "Player1";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJailStatus method, of class Player.
     */
    @Test
    public void testGetJailStatus()
    {
        System.out.println("getJailStatus");
        Player instance = new Player(1, "Player1");
        instance.setJailStatus(false);
        boolean expResult = false;
        boolean result = instance.getJailStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJailStayLength method, of class Player.
     */
    @Test
    public void testGetJailStayLength()
    {
        System.out.println("getJailStayLength");
        Player instance = new Player(1, "Player1");
        instance.resetJailStayLength();
        int expResult = 0;
        int result = instance.getJailStayLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of incrementJailStay method, of class Player.
     */
    @Test
    public void testIncrementJailStay()
    {
        System.out.println("incrementJailStay");
        Player instance = new Player(1, "Player1");
        instance.resetJailStayLength();
        instance.incrementJailStay();
        int expResult = 1;
        int result = instance.getJailStayLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdNum method, of class Player.
     */
    @Test
    public void testGetIdNum()
    {
        System.out.println("getIdNum");
        Player instance = new Player(1, "Player1");
        int expResult = 1;
        int result = instance.getIdNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentTile method, of class Player.
     */
    @Test
    public void testGetCurrentTile()
    {
        System.out.println("getCurrentTile");
        Player instance = new Player(1, "Player1");
        instance.tilePosition = 1;
        int expResult = 1;
        int result = instance.getCurrentTile();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTile method, of class Player.
     */
    @Test
    public void testSetTile()
    {
        System.out.println("setTile");
        int tile = 0;
        Player instance = null;
        instance.setTile(tile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney()
    {
        System.out.println("getMoney");
        Player instance = null;
        int expResult = 0;
        int result = instance.getMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMoney method, of class Player.
     */
    @Test
    public void testAddMoney()
    {
        System.out.println("addMoney");
        int amount = 0;
        Player instance = null;
        instance.addMoney(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMoney method, of class Player.
     */
    @Test
    public void testRemoveMoney()
    {
        System.out.println("removeMoney");
        int amount = 0;
        Player instance = null;
        instance.removeMoney(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBroke method, of class Player.
     */
    @Test
    public void testIsBroke()
    {
        System.out.println("isBroke");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isBroke();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class Player.
     */
    @Test
    public void testGetProperties()
    {
        System.out.println("getProperties");
        Player instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_PropertyTile()
    {
        System.out.println("addProperty");
        PropertyTile property = null;
        Player instance = null;
        instance.addProperty(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_RailroadTile()
    {
        System.out.println("addProperty");
        RailroadTile property = null;
        Player instance = null;
        instance.addProperty(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_UtilityTile()
    {
        System.out.println("addProperty");
        UtilityTile property = null;
        Player instance = null;
        instance.addProperty(property);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mortgage method, of class Player.
     */
    @Test
    public void testMortgage()
    {
        System.out.println("mortgage");
        Board board = null;
        Player instance = null;
        instance.mortgage(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
