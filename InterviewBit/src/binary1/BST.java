package binary1;

public class BST {
	Node root;
	
	void addElement(int x){
		//1. create a node
		Node n = new Node(x);
		
		//2. initially root is empty
		if(root == null){
			root = n;
			}
		else{
			Node curr = root;
			Node prev = root;
			
			while(curr != null){
				//assign value of curr to prev
				prev = curr;
				if(x < curr.data)
					//go to left
					curr = curr.leftChild;
				else
					//go to right
					curr = curr.rightChild;				
			}
			
			if(x< prev.data)
				prev.setLeft(n); 
			else prev.setRight(n);
					
				
			}
			
	}	
			
		
	//traversal
		void inorder(Node n){
			if(n == null){
				return;
			}
			
			inorder(n.leftChild);
			System.out.print(" "+ n.data);
			inorder(n.rightChild);
		}	
	
	/*void deleteElement(int x);
	
	
	void preorder(Node n);
	void postorder(Node n);*/
}
