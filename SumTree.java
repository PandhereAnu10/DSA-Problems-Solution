class Node
{
	int key;
	Node left = null, right = null;

	Node(int key) {
		this.key = key;
	}
}

class Solution
{
	// Recursive function to check if a given binary tree is a sum tree or not
	public static int isSumTree(Node root)
	{
		// base case: empty tree
		if (root == null) {
			return 0;
		}

		// special case: leaf node
		if (root.left == null && root.right == null) {
			return root.key;
		}

		int left = isSumTree(root.left);
		int right = isSumTree(root.right);

		// if the root's value is equal to the sum of all elements present in its
		// left and right subtree
		if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE &&
				root.key == left + right) {
			return 2 * root.key;
		}

		return Integer.MIN_VALUE;
	}


        //the above if condition will comes in main class
                if (isSumTree(root) != Integer.MIN_VALUE) {
			System.out.println("Binary tree is a sum tree");
		}
		else {
			System.out.println("Binary tree is not a sum tree");
		} 
}