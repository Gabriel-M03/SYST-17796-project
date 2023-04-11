package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sookraja
 */
public class BlackjackPlayerTest {
    
    public BlackjackPlayerTest() {
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

    /**
     * Test of Stand method, of class BlackjackPlayer.
     */
    @Test
    public void testStand() {
        System.out.println("Stand");
        BlackjackPlayer instance = null;
        instance.Stand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class BlackjackPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        BlackjackPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ask method, of class BlackjackPlayer.
     */
    @Test
    public void testAsk() {
        System.out.println("ask");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        int choice = 1;
        boolean expResult = true;
        boolean result = instance.ask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
