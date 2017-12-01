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
    public void testMovePlayer0()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(0, "testName");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 40;
        int actual = t.getX();
    }
    
    @Test
    public void testMovePlayer1()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(1, "testName1");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 40;
        int actual = t.getX();
    }
    @Test
    public void testMovePlayer2()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(2, "testName2");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 40;
        int actual = t.getX();
    }
    @Test
    public void testMovePlayer3()
    {
        GUI g = new GUI(1);
        g.setup();
        Player p = new Player(3, "testName3");
        PropertyTile t = new PropertyTile("Indiana Ave",160,40, 220, 18,90,250,700,875,1050,150,150,110);
        g.movePlayer(p.getIdNum(), t.getX(), t.getY());
        int expected = 40;
        int actual = t.getX();
    }
}
