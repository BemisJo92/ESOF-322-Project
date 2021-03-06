package esof322.pa4.team17;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import esof322.pa4.team17.Board;
import esof322.pa4.team17.ConcreteOG;
import esof322.pa4.team17.GUI;
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
public class ConcreteOGTest {
    
    public ConcreteOGTest() {
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
    //Tests createOGBoard in class ConcreteOP class, the method is unsupported in the class but is inherited from the ThemeFactory
    public void testCreateNPBoard()
    {
        GUI g = new GUI(2);
        ConcreteOG instance = new ConcreteOG();
        Boolean status = false;
        try{
            instance.createNPBoard(2,g);
        }catch(UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }

    
}
