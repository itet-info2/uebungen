package u2.u2a3;

public class BinaryTree {
	private char[] tree;
	
	/**
	 * Determines the index of the father.
	 * 
	 * The root is its own father.
	 * 
	 * @param node index of the children
	 * @return index of the father
	 */
	public static int father(int node)
	{
		return node;
	}
	
	/**
	 * Determines the index of the left child.
	 * 
	 * @param node index of the father
	 * @return index of the left child
	 */
	public static int leftChild(int node)
	{
		return node;
	}
	
	/**
	 * Determines the index of the right child.
	 * 
	 * @param node index of the father
	 * @return index of the right child
	 */
	public static int rightChild(int node)
	{
		return node;
	}
	
	/**
	 * Check if the given array represents a valid binary tree.
	 * 
	 * @param array a binary tree encoded as char array
	 * @throws IllegalArgumentException if check fails
	 */
	private static void checkTree(char[] array)
	{
	}
	
	/**
	 * Create a new binary tree from the given array representation.
	 * 
	 * The array stores the values of the binary tree in breadth-first order. 
	 * A space encodes a missing node. 
	 * 
	 * @param array the new tree
	 * @throws IllegalArgumentException if array does not represent a valid binary tree.
	 */
	public BinaryTree(char[] array)
	{
		checkTree(array);
		this.tree = array;
	}
	
	/**
	 * convert {@link BinaryTree#tree} into indented form.
	 * 
	 * One line per node, depth-first. One space of indentation per depth.
	 */
	public String toString()
	{
		return null;
	}
}
