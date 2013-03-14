package u2a2;

import java.util.Random;

/**
 * An array with random values.
 */
public class RandomArray {
	/**
	 * internal storage of the numbers
	 */
    private  int numbers[];

    /**
     * Create a new array with random values between 0 (inclusive) and 1000 (exclusive).
     * 
     * @param length the length of the new array.
     */
    public RandomArray(int length)
    {
    	this.numbers = new int[length];
    	Random random = new Random();
    	for (int i=0; i<length; i++)
    	{
    		this.numbers[i]=random.nextInt(1000);
    	}
    }

    /**
     * Return string-representation of array.
     * 
     * Example: the string-representation of int array[] = {1,2,3} is '[1, 2, 3]'
     * 
     * @return a list of the values, separated by a comma and a space, and enclosed in squared brackets.
     */
    public String toString()
    {
    	String s = "[";
    	for (int i=0; i<this.numbers.length; i++){    		
    		s += this.numbers[i];
    		if (i<this.numbers.length-1)
    		    s += ", ";	
    	}
    	s += "]";
    	return s;
    }

    /**
     * recursive sort of the array in descending order in place.
     * 
     * @param until value between 0 and length (inclusive) of {@link RandomArray#numbers}. <br>
     * When the function returns the <em>until</em> largest values of {@link RandomArray#numbers} 
     * are placed in the first <em>until</em> positions of the array and sorted in descending order.
     */
    private void recursiveSort(int until)
    {    	
    	if (until>0)
    	{
    		this.recursiveSort(until-1);
    		int posMax = until-1;
    		for (int i=until; i<this.numbers.length; i++)
    		{
    			if (this.numbers[posMax]<this.numbers[i])
    			{
    				posMax=i;
    			}
    		}
    		if (until-1 != posMax)
    		{
    			int temp = this.numbers[until-1];
    			this.numbers[until-1]=this.numbers[posMax];
    			this.numbers[posMax]=temp;  			
    		}
    	}
    
    }
    	

    /**
     * sort the array in descending order in place.
     */
    public void sort()
    {
    	recursiveSort(numbers.length);        
    }
}
