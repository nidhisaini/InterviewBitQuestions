package linkedlist1;

public class LinkedList {
	Node first;
	
	LinkedList(){
		first = null;
	}
	
	LinkedList(Node n){
		first = n;
	}
	
	public boolean isEmpty(){
		if(first == null)
			return true;
		else return false;
	}
	
	void insertAtBeginning(int x){
		Node n = new Node(x);
		n.next = first;
		first = n; 
		
	}
	
	public void print(){
		Node p = first;
		while(p != null){
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println("NULL");
	}
	
	
	
	void insertAtEnd(int x){
		if(isEmpty()){
			insertAtBeginning(x);
		}	
		Node n = new Node(x);
		Node p = first;
		while(p.next != null){
			p = p.next;
		}
		p.next = n;
				
	}
	void insertAtIndex(int x, int index){
		if(index == 0){
			insertAtBeginning(x);
		}
		else{
		int count =0;
		Node p = first;
		Node n = new Node(x);
		while(count < index-1 && p!= null){
			p = p.next;
			count++;
		}
		if(p!= null){
			n.next = p.next;
			p.next = n;
		}
		else{
			System.out.println("The index exceeds the list length.");
		}
		
		}
	}
	
	public int deleteFromBeginning(){
		if(isEmpty()){
			System.out.println("the list is empty");
			return -1;
		}
		else{
			int deletedItem = first.data;
			first = first.next;
			return deletedItem;
		}
		
	}
	public int deleteFromEnd(){
		Node p = first, q = null;
		while(p.next!= null){
			    q = p;
			    p = p.next; 	
		}
		
		if(q != null){
			q.next = null;
		}
		else{// for single item
			first = null;
		}
		
		return p.data;
	}
	//int deleteFromIndex();
	
	
	
	
	

}
