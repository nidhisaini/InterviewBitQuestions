package binary1;

public class BSTDemo {

	public static void main(String[] args) {
		
		BST tree = new BST();
		
		int[] num = {11, 2,5,21, 3, 1};
		
		for(int i:num){
			tree.addElement(i);
			System.out.println("\nAdding element :" + i);
			System.out.println("Printing inorder : ");
			tree.inorder(tree.root);
			
		}

	}

}
