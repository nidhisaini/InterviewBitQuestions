package linkedlist1;

public class Stack {
	LinkedList ll;
	
	Stack(){
		ll = new LinkedList();
	}
	
	void push(int x){
		ll.insertAtBeginning(x);
	}
	
	void pop(){
		ll.deleteFromBeginning();
	}

}
