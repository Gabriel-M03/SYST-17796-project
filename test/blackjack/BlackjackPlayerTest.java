package blackjack;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
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
public class BlackjackPlayerTest 
{    
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
    public void testStand() 
    {
        System.out.println("Stand");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        instance.Stand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testStandBad()
    {
        System.out.println("Stand");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        instance.Stand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of play method, of class BlackjackPlayer.
     */
    @Test
    public void testPlay() 
    {
        System.out.println("play");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPlayBad()
    {
        System.out.println("play");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ask method, of class BlackjackPlayer.
     */
    @Test
    public void testAskGood() {
        System.out.println("ask");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean result = instance.ask();
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expected = InputMismatchException.class)
    public void testAskBad() {
        System.out.println("ask");
        BlackjackPlayer instance = new BlackjackPlayer("test");
        String input = "g";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean result = instance.ask();
        assertEquals(input, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
