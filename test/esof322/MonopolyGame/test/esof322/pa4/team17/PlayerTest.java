
package esof322.pa4.team17;

import esof322.pa4.team17.Player;
import esof322.pa4.team17.PropertyTile;
import esof322.pa4.team17.UtilityTile;
import esof322.pa4.team17.RailroadTile;
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
        int tile = 1;
        Player instance = new Player(1, "Player1");
        instance.setTile(tile);
        assertEquals(tile, instance.getCurrentTile());
    }

    /**
     * Test of getMoney method, of class Player.
     */
    @Test
    public void testGetMoney()
    {
        System.out.println("getMoney");
        Player instance = new Player(1, "Player1");
        int expResult = 1500;
        int result = instance.getMoney();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMoney method, of class Player.
     */
    @Test
    public void testAddMoney()
    {
        System.out.println("addMoney");
        int amount = 100;
        Player instance = new Player(1, "Player1");
        instance.addMoney(amount);
        int result = instance.getMoney();
        int expResult = 1600;
        assertEquals(expResult, result);
    }

    /**
     * Test of removeMoney method, of class Player.
     */
    @Test
    public void testRemoveMoney()
    {
        System.out.println("removeMoney");
        int amount = 100;
        Player instance = new Player(1, "Player1");
        instance.removeMoney(amount);
        int result = instance.getMoney();
        int expResult = 1400;
        assertEquals(expResult, result);
    }

    /**
     * Test of isBroke method, of class Player.
     */
    @Test
    public void testIsBroke()
    {
        System.out.println("isBroke");
        Player instance = new Player(1, "Player1");
        instance.removeMoney(1500);
        boolean expResult = true;
        boolean result = instance.isBroke();
        assertEquals(expResult, result);
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_PropertyTile()
    {
        System.out.println("addProperty");
        PropertyTile property = new PropertyTile("Marvin Gardens",400,40, 280,24,130,360,850,1025,1200,150,150,140);
        Player instance = new Player(1, "Player1");
        instance.addProperty(property);
        int expResult = 1;
        int result = instance.getProperties().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_RailroadTile()
    {
        System.out.println("addProperty");
        RailroadTile property = new RailroadTile("B & O Railroad",240,40);
        Player instance = new Player(1, "Player1");
        instance.addProperty(property);
        int expResult = 1;
        int result = instance.getProperties().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of addProperty method, of class Player.
     */
    @Test
    public void testAddProperty_UtilityTile()
    {
        System.out.println("addProperty");
        UtilityTile property = new UtilityTile("Waterworks",360,40);
        Player instance = new Player(1, "Player1");
        instance.addProperty(property);
        int expResult = 1;
        int result = instance.getProperties().size();
        assertEquals(expResult, result);
    }
    /**
     * Test of rollDie method, of class Player.
     * Test to make sure roll die provides a value that is between 1 and 6 inclusive like a real life die.
     */
    @Test
    public void testRollDice()
    {
        Player instance = new Player(1, "Test Player Roll dice");
        int actual = instance.rollDie();
        assertTrue(actual <= 6 && actual >=1);
    }
    @Test
    //tests isBroke() method in player class when player DOES NOT have money
    public void testIsBrokeTrue()
    {
        Player instance = new Player(1, "Test Player");
        instance.money=0;
        Boolean actual = instance.isBroke();
        Boolean expected = true;
        assertEquals(expected,actual);
    }
    
    @Test
    //tests isBroke() method in class player when the player does have money
    public void testIsBrokeFalse()
    {
        Player instance = new Player(1, "Test Player");
        instance.money=100;
        Boolean actual = instance.isBroke();
        Boolean expected = false;
        assertEquals(expected,actual);
    }
}
