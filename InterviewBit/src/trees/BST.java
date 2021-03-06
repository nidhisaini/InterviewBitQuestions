package trees;
import java.util.ArrayList;
/*http://www.geeksforgeeks.org/iterative-function-check-two-trees-identical*/
import java.util.LinkedList;
import java.util.Queue;

public class BST {
	Node root;

	void addElement(int x) {
		Node n = new Node(x);

		if (root == null) {
			root = n;
		} 
		else {
			Node curr, prev;
			curr = root;
			prev = root;

			while (curr != null) {
				prev = curr;
				if (x < curr.data)
					curr = curr.leftChild;
				else
					curr = curr.rightChild;
			}

			if (x < prev.data)
				prev.setLeft(n);
			else
				prev.setRight(n);
		}

	}

	void inorder(Node n) {
		if (n == null)
			return;
		else {
			inorder(n.leftChild);
			System.out.println(" " + n.data);
			inorder(n.rightChild);

		}
	}
	
	void preorder(Node n) {
		if (n == null)
			return;
		else {
			System.out.println(" " + n.data);
			preorder(n.leftChild);		
			preorder(n.rightChild);

		}
	}
	
	
	void postorder(Node n) {
		if (n == null)
			return;
		else {
			postorder(n.leftChild);		
			postorder(n.rightChild);
			System.out.println(" " + n.data);

		}
	}
	
	void levelOrderTraversal(Node root){
		if(root == null)
			return;
		else{
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			
			while(!q.isEmpty()){
				root = q.poll();
				System.out.print(" "+ root.data);
				if(root.leftChild != null){
					q.add(root.leftChild);
				}
				if(root.rightChild != null){
					q.add(root.rightChild);
				}
				
					
			}
			
		}
	}
	
	
	public int isSameTree(Node a, Node b) {
	    //if both empty
	    if(a == null && b == null){
	    return 1;}
	    //both non empty, compare trees 
	    else if(a != null && b != null){
	    
	    int leftTree = isSameTree(a.leftChild, b.leftChild);
	    int rightTree = isSameTree(a.rightChild, b.rightChild);
	    
	    if((a.data == b.data  & leftTree == 1 & rightTree ==1 ) )
	      return 1;
	    else return 0;
	        
	    }
	    
	    //else return false
	    else{
	    return 0;}
	}
	
	
	public ArrayList<Integer> preorderTraversal(Node a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        printPreOrder(a, result);
   
    return result;
	}

	public void printPreOrder(Node a, ArrayList<Integer> result){
   
    
    if(a == null)
        return;
    else{
        result.add(a.data);
        printPreOrder(a.leftChild, result);
        printPreOrder(a.rightChild, result); 
    }
}
	
/*	Max Depth of Binary 
	Given a binary tree, find its maximum depth.

	The maximum depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.

	 NOTE : The path has to end on a leaf node. 
	Example :

	         1
	        /
	       2
	max depth = 2.*/
	public int maxDepth(Node a) {
	    if(a == null)
	       return 0;
	       
	    int leftDepth = maxDepth(a.leftChild);  
	    int rightDepth = maxDepth(a.rightChild);
	    
	    int max_depth = Math.max(leftDepth,rightDepth);
	    return max_depth +1;
	}
	

/*	Invert the Binary Tree
	Given a binary tree, invert the binary tree and return it. 
	Look at the example for more details.

	Example : 
	Given binary tree

	     1
	   /   \
	  2     3
	 / \   / \
	4   5 6   7
	invert and return

	     1
	   /   \
	  3     2
	 / \   / \
	7   6 5   4*/
	public Node invertTree(Node root) {
        
        if(root == null)
          return null;
        
        Node left =  invertTree(root.leftChild);   
        Node right =  invertTree(root.rightChild);
       
        root.leftChild = right;
        root.rightChild = left;
        return root;
    }


}
