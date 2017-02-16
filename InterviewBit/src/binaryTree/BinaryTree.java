package binaryTree;

public class BinaryTree {

	TreeNode root;

	void addElement(int x) {

		TreeNode n = new TreeNode(x);
		// tree is empty
		if (root == null) {
			root = n;
		} else {
			TreeNode curr = root;
			TreeNode prev = null;

			while (curr != null) {
				prev = curr;

				if (curr.val > x) {
					curr = curr.leftChild;
				} else {
					curr = curr.rightChild;
				}

			}

			if (prev.val > x)
				prev.setLeft(n);
			else
				prev.setRight(n);
		}

	}

	void inOrder(TreeNode n) {
		if (n == null)
			return;
		else {
			inOrder(n.leftChild);
			System.out.print(n.val + "  ");
			inOrder(n.rightChild);
		}
	}

	int isValidBST(TreeNode n) {

		return BSTUtil(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	int BSTUtil(TreeNode n, int min, int max) {
		if (n == null)
			return 1;
		else {
			if ((root.val > min && root.val < max) && BSTUtil(root.leftChild, min, root.val) == 1
					&& BSTUtil(root.rightChild, root.val, max) == 1)
				return 1;
			else
				return 0;
		}

	}
	
	

}
