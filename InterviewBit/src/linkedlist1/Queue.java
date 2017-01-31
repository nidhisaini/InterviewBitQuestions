package linkedlist1;

public class Queue {
	
	LinkedList ll;
	
	Queue(){
		ll = new LinkedList();
	}
	
	void enqueue(int x){
		ll.insertAtEnd(x);
		
	}
	
	int dequeue(){
		int r = ll.deleteFromBeginning();
		return r;
	}

}
