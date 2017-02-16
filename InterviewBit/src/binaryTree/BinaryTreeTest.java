package binaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree BT = new BinaryTree();
		int[] a = {11,2,5,4,17, 8};
		
		for(int i: a){
			BT.addElement(i);
			System.out.print("\nAdding item :" + i );
			System.out.print("\nThe indorder is :" );
			BT.inOrder(BT.root);
			
			int r = BT.isValidBST(BT.root);
			System.out.println("The tree is a valid BST "+ r);
		}
		
		
		

	}

}
