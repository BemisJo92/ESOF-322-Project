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
public class ConcreteNPTest {
    
    public ConcreteNPTest() {
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
    //Tests createOGBoard in class ConcereteNP class, the method is unsupported in the class but is inherited fromt the ThemeFactory
    public void testCreateOGBoard()
    {
        GUI g = new GUI(1);
        ConcreteNP instance = new ConcreteNP();
        Boolean status = false;
        try{
            instance.createOGBoard(2,g);
        }catch(UnsupportedOperationException e)
        {
            status = true;
        }
        Boolean actual = status;
        Boolean expected = true;
        assertEquals(expected,actual);
    }
}

