/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322.pa4.team17;

import esof322.pa4.team17.Tile;
import esof322.pa4.team17.Player;
import esof322.pa4.team17.GoToJailTile;
import esof322.pa4.team17.GUI;
import esof322.pa4.team17.OGBoard;
import esof322.pa4.team17.Board;
import esof322.pa4.team17.NPBoard;
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
    public void testFreeCardNP()
    {
        GUI g = new GUI(2);
        g.setup();
        Board b = new NPBoard(1,g);
        Player p = new Player(0, "Test Player 1");
        p.addJailFreeCard();
        Tile t = b.getTile(30);
        t.doAction(p,b);
        int expected = 0;
        int actual = p.getCurrentTile();
        assertEquals(expected, actual);
    }
    
    @Test
    //testing for when a player lands on the go to jail tile but they do have a 'get out of jail free card' so they are NOT sent to jail.
    public void testFreeCardOG()
    {
        GUI g = new GUI(1);
        g.setup();
        Board b = new OGBoard(1,g);
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
        GUI g = new GUI(1);
        g.setup();
        Board b = new OGBoard(1,g);
        Player p = new Player(0, "Test Player 1");
        Tile t = b.getTile(30);
        t.doAction(p,b);
        int expected = 10;
        int actual = p.getCurrentTile();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMortgage()
    {
        GoToJailTile t = new GoToJailTile("Test Jail tile",40,440);
        Boolean status = false;
        try
        {
            t.getMortgage();
        }catch(UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }
}
