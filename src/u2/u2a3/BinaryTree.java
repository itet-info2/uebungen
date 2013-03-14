package u2a3;

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
		if (node != 0)
		{
		if(node%2==0)
			return (node-2)/2;
		else 
			return node/2; 
		} else return 0;
	}
	
	/**
	 * Determines the index of the left child.
	 * 
	 * @param node index of the father
	 * @return index of the left child
	 */
	public static int leftChild(int node)
	{
		return 2*node+1;
	}
	
	/**
	 * Determines the index of the right child.
	 * 
	 * @param node index of the father
	 * @return index of the right child
	 */
	public static int rightChild(int node)
	{
		return 2*(node+1);
	}
	
	/**
	 * Check if the given array represents a valid binary tree.
	 * 
	 * @param array a binary tree encoded as char array
	 * @throws IllegalArgumentException if check fails
	 */
	private static void checkTree(char[] array)
	{		
		if (array.length == 0)
			throw new IllegalArgumentException();
		else
		{
			for (int i = 1; i < array.length; i++){
				if (array[i] != ' ' && array[father(i)] == ' ')
					throw new IllegalArgumentException();
	    	}
		}
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
		return this.nodeToString(0, 0);
	}
	
	//Gibt den Knoten "node" aus, fährt anschliessend mit dem linken und rechten Teilbaum weiter
	private String nodeToString(int node, int tiefe)
	{
	  String s = "";
	  if (this.tree != null && node < this.tree.length && this.tree[node] != ' ')
	  {
		  //Tiefe ausgeben
		  for (int i = 0; i < tiefe; i++)
			  s += " ";
		  //Wert ausgeben
		  s += String.valueOf(this.tree[node]) + "\n";
		  s += this.nodeToString(leftChild(node), tiefe + 1);
		  s += this.nodeToString(rightChild(node), tiefe + 1);
	  }
	  return s;	  
	}
}
