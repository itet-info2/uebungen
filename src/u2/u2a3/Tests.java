package u2a3;

import org.junit.Test;
import org.junit.Assert;

public class Tests {
	@Test public void father() 
	{ 
		Assert.assertEquals(0, BinaryTree.father(0));
		Assert.assertEquals(0, BinaryTree.father(1));
		Assert.assertEquals(0, BinaryTree.father(2));
		Assert.assertEquals(1, BinaryTree.father(3));
		Assert.assertEquals(1, BinaryTree.father(4));
		Assert.assertEquals(2, BinaryTree.father(5));
		Assert.assertEquals(2, BinaryTree.father(6));
	}
	
	@Test public void leftChild()
	{
		Assert.assertEquals(1, BinaryTree.leftChild(0));
		Assert.assertEquals(3, BinaryTree.leftChild(1));
		Assert.assertEquals(5, BinaryTree.leftChild(2));
		Assert.assertEquals(7, BinaryTree.leftChild(3));
		Assert.assertEquals(9, BinaryTree.leftChild(4));
		Assert.assertEquals(11, BinaryTree.leftChild(5));
		Assert.assertEquals(13, BinaryTree.leftChild(6));
	}

	@Test public void rightChild()
	{
		Assert.assertEquals(2, BinaryTree.rightChild(0));
		Assert.assertEquals(4, BinaryTree.rightChild(1));
		Assert.assertEquals(6, BinaryTree.rightChild(2));
		Assert.assertEquals(8, BinaryTree.rightChild(3));
		Assert.assertEquals(10, BinaryTree.rightChild(4));
		Assert.assertEquals(12, BinaryTree.rightChild(5));
		Assert.assertEquals(14, BinaryTree.rightChild(6));
	}

	private static void testCase(String in, String out)
	{
		BinaryTree bt = new BinaryTree(in.toCharArray());
		Assert.assertEquals(out, bt.toString());
	}
	
	private static void failCase(String in)
	{
		new BinaryTree(in.toCharArray());
	}

	@Test public void noRoot() 	{ testCase(" ", ""); }
	
	@Test public void oneNode()	{ testCase("a", "a\n");	}

	@Test public void balancedTree() { testCase("012", "0\n 1\n 2\n"); }
	
	@Test public void leftList() { testCase("01 3   7", "0\n 1\n  3\n   7\n"); }

	@Test public void rightList() { testCase("0 2   6       e", "0\n 2\n  6\n   e\n");	}

	@Test public void generalTree() { testCase("ABCD FE", "A\n B\n  D\n C\n  F\n  E\n");        }

	@Test(expected = IllegalArgumentException.class) 
	public void emptyArray() { testCase("", "");}
	
	@Test(expected = IllegalArgumentException.class)
	public void firstChildNoFather() { failCase(" 1"); }

	@Test(expected = IllegalArgumentException.class)
	public void secondChildNoFather() { failCase("  2"); }

	@Test(expected = IllegalArgumentException.class)
	public void noFatherLeftLeft() { failCase("0 23"); }

	@Test(expected = IllegalArgumentException.class)
	public void noFatherLeftRight() { failCase("0 2 4"); }
	
	@Test(expected = IllegalArgumentException.class)
	public void noFatherRightLeft() { failCase("01 345"); }

	@Test(expected = IllegalArgumentException.class)
	public void noFatherRightRight() { failCase("01 34 6"); }

	@Test(expected = IllegalArgumentException.class)
	public void noLastLeaf() { failCase("01 34 6"); }

	@Test(expected = IllegalArgumentException.class)
	public void noFatherLeftLeftLeft() { failCase("0 23   7"); }

	@Test public void noLastLeafOk() { failCase("0123456 "); }
}
