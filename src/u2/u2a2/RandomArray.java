package u2.u2a2;

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
		return null;
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
    }

    /**
     * sort the array in descending order in place.
     */
    public void sort()
    {
    	recursiveSort(numbers.length);        
    }
}
