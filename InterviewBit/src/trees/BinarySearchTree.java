package trees;

import java.util.ArrayList;

public class BinarySearchTree {
	Node root;
	
	
	public static void main(String[] args){
		BST tree = new BST();
		
		BST tree1 = new BST();
		
		int[]  number = {11,2,5,21,3,1};
		
		for(int i:number){
			tree.addElement(i);
			System.out.println("Adding element :" + i);
			System.out.println("Printing preorder :");
			tree.preorder(tree.root);
			
		}
		
		int[]  number1 = {11,2,5,21,3,1};
		
		for(int i:number1){
			tree1.addElement(i);
			System.out.println("Adding element :" + i);
			System.out.println("Printing preorder :");
			tree.preorder(tree1.root);
			
		}
		/*System.out.println("The Level order traversal");
		tree.levelOrderTraversal(tree.root);
		
		int r = findClosestNodeToTargetValue(tree.root, 3);
		System.out.println("The Closest Node is :" +r);
		
		Node result = LowestCommonAncestor(tree.root, 1,3);
		System.out.println("The Lowest Common Ancestor is :" +result.data);*/
		
		
		int result = tree.isSameTree(tree.root, tree1.root);
		System.out.println("The trees are same:" + result);
		
		ArrayList<Integer> list  = tree.preorderTraversal(tree.root);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("The preorder traversal:" + list.get(i));
		}
		
		
		
		} 
		
		
	
	
	public static Node LowestCommonAncestor(Node root, int n1, int n2){
		
		if(root == null)
			return null;
		
		 // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
		if(root.data == n1 || root.data == n2 )
			return root;
		
		Node left_lca = LowestCommonAncestor(root.leftChild, n1, n2);
		Node right_lca = LowestCommonAncestor(root.rightChild, n1,n2);
		
		// If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
		if(left_lca != null && right_lca != null)
			return root;
		
		 // Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca:right_lca;
		
	}
	
	public static int findClosestNodeToTargetValue(Node root, int target){
		Node closestNode =root;
		
		if(root == null)
			return 0;
		
		int closestDiff = Integer.MAX_VALUE;
		
		while(root != null){
			if(root.data  == target)
				return root.data;
			
			int diff = Math.abs(target - root.data);
			if(diff< closestDiff){
				closestDiff = diff;
				closestNode = root;
			}
			
			if(target > root.data)
				root = root.rightChild;
			else
				root = root.leftChild;
		}
			
		return closestNode.data;
		
	}


	

}
