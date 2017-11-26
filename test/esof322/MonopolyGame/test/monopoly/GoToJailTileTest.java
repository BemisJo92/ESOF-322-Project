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
public class GoToJailTileTest {
    
    public GoToJailTileTest() {
       
    }
    @Test
    //testing for when a player lands on the go to jail tile but they do have a 'get out of jail free card' so they are NOT sent to jail.
    public void testFreeCard()
    {
        GUI g = new GUI();
        g.setup();
        Board b = new Board(1,g);
        Player p = new Player(0, "Test Player 1");
        p.addJailFreeCard();
        Tile t = b.getTile(30);
        t.doAction(p,b);
        int expected = 0;
        int actual = p.getCurrentTile();
        assertEquals(expected, actual);
    }
    @Test
    //testing for when a player lands on the go to jail tile and does NOT have a 'get out of jail free card' so they are sent to jail.
    public void testNoCard()
    {
        GUI g = new GUI();
        g.setup();
        Board b = new Board(1,g);
        Player p = new Player(0, "Test Player 1");
        Tile t = b.getTile(30);
        t.doAction(p,b);
        int expected = 10;
        int actual = p.getCurrentTile();
        assertEquals(expected, actual);
    }
}
