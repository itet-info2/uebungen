package u2a2;

import org.junit.Test;
import org.junit.Assert;

public class Tests {
	static final String open = "\\[";
	static final String close = "\\]";
	static final String number = "[0-9]{1,3}";
	static final String delim = ", ";
		
	@Test
	public void create_empty()
	{
		RandomArray a = new RandomArray(0);
		String s = a.toString();
		Assert.assertEquals("[]", s);
	}
	
	@Test
	public void create_one()
	{	
		RandomArray a = new RandomArray(1);
		String s = a.toString();
		final String pattern = open + number + close;
		Assert.assertTrue("string '" + s + "' is not well formed", s.matches(pattern));
	}

	@Test
	public void create23()
	{	
		final int size = 23;
		RandomArray a = new RandomArray(size);
		String s = a.toString();
		final String pattern = open + "(" + number + delim + "){22}" + number + close;
		Assert.assertTrue("string '" + s + "' is not well formed", s.matches(pattern));
	}

	@Test
	public void sortEmpty()
	{
		RandomArray a = new RandomArray(0);
		a.sort();
		String s = a.toString();
		Assert.assertEquals("[]", s);
	}

	@Test
	public void sortOne()
	{
		RandomArray a = new RandomArray(1);
		a.sort();
		String s = a.toString();
		final String pattern = open + number + close;
		Assert.assertTrue("string '" + s + "' is not well formed", s.matches(pattern));
	}

	@Test
	public void generic()
	{
		RandomArray a = new RandomArray(42);
		a.sort();
		String s = a.toString();
		System.out.println(s);
		
		final String pattern = open + "(" + number + delim + "){41}" + number + close;
		Assert.assertTrue("string '" + s + "' is not well formed", s.matches(pattern));
		
		String numbers[] = s.substring(1, s.length()-1).split(delim);
		int max = Integer.MAX_VALUE;
		for (int i=0; i<numbers.length; i++) {
			int current = Integer.parseInt(numbers[i]);
			Assert.assertTrue("value " + current + " is out of the valid interval", current >= 0 && current < 1000);
			Assert.assertTrue("wrong order at position " + i + " of array " + s, max >= current);
			max = current;
		}
	}
	
}
