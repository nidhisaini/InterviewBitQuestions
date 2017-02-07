package binary1;

public class Node {
	
	int data;
	Node leftChild;
	Node rightChild;
	Node parent;
	
	//empty constructor
	Node(){
		
	}
	// paramerized constructor
	Node(int x){
	  data = x;
	}
	
	//make a node left child
	void setLeft(Node n){
		this.leftChild = n;
		if(n != null){
			n.parent = this;
		}
	}
	
	//make a node right child
	void setRight(Node n){
		this.rightChild = n;
		if(n!= null){
			n.parent = this;
		}
	}

}
