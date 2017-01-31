package linkedlist1;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.print();
		ll.insertAtBeginning(4);
		ll.print();
		ll.insertAtBeginning(9);
		ll.print();
		
		/*int r = ll.deleteFromBeginning();
		System.out.println("The deleted node is " + r);*/
		ll.print();
		ll.insertAtEnd(10);
		ll.print();
		ll.insertAtEnd(14);
		ll.print();
		ll.insertAtEnd(18);
		ll.print();
		int r = ll.deleteFromEnd();
		System.out.println("The deleted node from the end is " + r);
		ll.print();
		
		ll.insertAtIndex(5, 9);
		ll.print();
		
	}

}
