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
public class ChanceTileTest {
    
    public ChanceTileTest() {
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
    //Tests adjusting player's money when the chance card is awarding money to the player
    public void testAdjMoney()
    {
        Player p = new Player(0,"TestPlayer");
        int oldMoney = p.getMoney();
        ChanceCard c = new ChanceCard("TestChanceCard", -1,100);
        ChanceTile t = new ChanceTile("Chance 3",440,280);
        t.adjMoney(p,c.getMoneyAdjust());
        int actual = p.getMoney();
        int expected = oldMoney + 100;
        
    }
    @Test
    //Tests adjusting players money when the chance card does not have a money adjustment value
    public void testAdjMoneyZero()
    {
        Player p = new Player(0,"TestPlayer");
        int oldMoney = p.getMoney();
        ChanceCard c = new ChanceCard("TestChanceCard", -1,0);
        ChanceTile t = new ChanceTile("Chance 3",440,280);
        t.adjMoney(p,c.getMoneyAdjust());
        int actual = p.getMoney();
        int expected = oldMoney;    //shouldnt change
        assertEquals(expected, actual);
    }
    @Test
     //Tests adjusting players money when the chance card removes money from the player
    public void testAdjMoneyLessThanZero()
    {
        Player p = new Player(0,"TestPlayer");
        int oldMoney = p.getMoney();
        ChanceCard c = new ChanceCard("TestChanceCard", -1,-100);
        ChanceTile t = new ChanceTile("Chance 3",440,280);
        t.adjMoney(p,c.getMoneyAdjust());
        int actual = p.getMoney();
        int expected = oldMoney;
    }
    @Test
    public void testGetCard()
    {
        GUI g = new GUI(1);
        OGBoard b = new OGBoard(2,g);
        ChanceTile t = new ChanceTile("Chance 3",440,280);
        ChanceCard c = t.getCard(b);
        int actual = c.getCardID();
        int max =b.numChanceCards;
        int min = 0;
        assertTrue(min <= actual && actual <= max);
    }
    @Test
    //Tests set mortgage status in class ChanceTile (chance tiles have no mortgage values but inheret this method from TILE
    //Therefore the method throws an unsupportedOperationExceptionError) 
    public void testSetMortgageStatus()
    {
        Boolean status= false;
        ChanceTile t = new ChanceTile("Chance 3",440,280);
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
    @Test
    //Tests getMortgage method in class ChanceTile (chance tiles have no mortgage values so expected = -1)
    public void testGetMortgage()
    {
        ChanceTile t = new ChanceTile("Get out of jail free card!", 0, 0);
        int actual = t.getMortgage();
        int expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    //test getCard for OG board
    public void testGetCardOG()
    {
        GUI g = new GUI(1);
        Board b = new OGBoard(1,g);
        ChanceTile t = new ChanceTile("TEST CHANCE TILE", 0, 0);
        ChanceCard actual = t.getCard(b);
        ChanceCard[] cards = b.getChanceCards();
        
        ChanceCard expected0 = cards[0];
        ChanceCard expected1 = cards[1];
        ChanceCard expected2 = cards[2];
        ChanceCard expected3 = cards[3];
        ChanceCard expected4 = cards[4];
        assertTrue(actual == expected0 || actual == expected1 || actual == expected2|| actual == expected3 || actual == expected4);       
        
    }
    
    @Test
    //test getCard for NP board
    public void testGetCardNP()
    {
        GUI g = new GUI(1);
        Board b = new NPBoard(1,g);
        ChanceTile t = new ChanceTile("TEST CHANCE TILE", 0, 0);
        ChanceCard actual = t.getCard(b);
        ChanceCard[] cards = b.getChanceCards();
        
        ChanceCard expected0 = cards[0];
        ChanceCard expected1 = cards[1];
        ChanceCard expected2 = cards[2];
        ChanceCard expected3 = cards[3];
        ChanceCard expected4 = cards[4];
        assertTrue(actual == expected0 || actual == expected1 || actual == expected2|| actual == expected3 || actual == expected4);       
        
    }
}
