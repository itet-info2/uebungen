package u1a3;

import org.junit.Test;
import junit.framework.Assert;
import java.util.Random;
/**
 * Unit tests for Mult class
 * 
 * @author Alexander Bernauer (bernauer@inf.ethz.ch)
 * @version 1.0
 * @see Mult
 */
public class Tests {

	/**
	 * Tests negative values for a.
	 */
	@Test(expected = IllegalArgumentException.class)
    public void negative_a() {
        Mult.mult(-1, 1);
    }

	/**
	 * Test negative values for b.
	 */
    @Test(expected = IllegalArgumentException.class)
    public void negative_b() {
        Mult.mult(1, -1);
    }

    /**
	 * Tests zero for a.
	 */
	@Test(expected = IllegalArgumentException.class)
    public void zero_a() {
        Mult.mult(0, 1);
    }

	/**
	 * Test zero for b.
	 */
    @Test(expected = IllegalArgumentException.class)
    public void zero_b() {
        Mult.mult(1, 0);
    }

    
    /**
     * Test Egyptian multiplication with two random numbers
     * between 1 and 100.
     */
    @Test 
    public void mult() {
        Random rand = new Random();
        int a = rand.nextInt(100) + 1;
        int b = rand.nextInt(100) + 1;
        Assert.assertEquals(a*b, Mult.mult(a,b));
    }
}
