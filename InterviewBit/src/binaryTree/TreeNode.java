package binaryTree;

public class TreeNode {
	
	int val;
	TreeNode leftChild;
	TreeNode rightChild;
	TreeNode parent;
	
	TreeNode(){}
	
	TreeNode(int x){
		this.val = x;
	}
	
	 void setLeft(TreeNode n){
		 this.leftChild = n;
		 if(n!=null){
		  n.parent = this;
		 }
		
	}
	
	void setRight(TreeNode n){
		this.rightChild = n;
		if(n!= null){
		n.parent= this;
		}	
	}

}
