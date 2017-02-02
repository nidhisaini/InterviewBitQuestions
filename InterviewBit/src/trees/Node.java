package trees;

public class Node {
	
	int data;
	Node leftChild;
	Node rightChild;
	Node parents;

	Node() {
	}

	Node(int x) {
		data = x;
	}

	void setLeft(Node n) {
		this.leftChild = n;
		if (n != null) {
			n.parents = this;
		}

	}

	void setRight(Node n) {
		this.rightChild = n;
		if (n != null) {
			n.parents = this;
		}
	}

}
