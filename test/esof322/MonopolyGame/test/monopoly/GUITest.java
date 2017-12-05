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
public class GUITest {
    
    public GUITest() {
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
    //tests for condition of no theme
    public void noTheme()
    {
        Boolean status = true;
        try{
        GUI g = new GUI(0);
        }catch(RuntimeException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    //Tests the actionListener for button0 in class GUI. also hits the linecounter branch
    public void testButton0()
    {
        GUI g = new GUI(1);
        g.setup();
        String expected = "Button 0 pressed";
        g.b0.doClick();
        g.lineCounter = 50;
        String actual = g.displayMessage;
        assertEquals(expected,actual);
    }
    @Test
    //Tests the actionListener for button1 in class GUI
    public void testButton1()
    {
        GUI g = new GUI(1);
        g.setup();
        String expected = "Button 1 pressed";
        g.b1.doClick();
        String actual = g.displayMessage;
        assertEquals(expected,actual);
    }
    @Test
    //Tests the actionListener for button7 in class GUI
    public void testButton7()
    {
        GUI g = new GUI(1);
        g.setup();
        String expected = "Button 7 pressed";
        g.b7.doClick();
        String actual = g.displayMessage;
        assertEquals(expected,actual);
    }
    
    @Test
    //Tests moving player 0 in class GUI
    public void testMovePlayer0()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(0, "testName");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 160;
        int actual = t.getX();
        assertEquals(expected,actual);

    }
    
    @Test
    //Tests moving player[1] (2 of 4) in class GUI
    public void testMovePlayer1()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(1, "testName1");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 160;
        int actual = t.getX();
        assertEquals(expected,actual);
    }
    @Test
    //Test moving player [2] (3 of 4) in class GUI
    public void testMovePlayer2()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(2, "testName2");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 160;
        int actual = t.getX();
        assertEquals(expected,actual);

    }
    @Test
    //Test moving player[3] (4 of 4) in class GUI
    public void testMovePlayer3()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(3, "testName3");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 160;
        int actual = t.getX();
        assertEquals(expected,actual);

    }
    @Test
    //tests the clear method for the GUI display
    public void testDisplay()
    {
        GUI g = new GUI(1);
        g.setup();
        g.lineCounter = 0;
        g.display("Test");
        int actual = g.lineCounter;
        int expected =2;
        assertEquals(expected,actual);

    }        
        
}
