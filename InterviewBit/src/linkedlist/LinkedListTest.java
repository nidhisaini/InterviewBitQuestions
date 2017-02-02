package linkedlist;
import java.util.HashSet;
import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
				
		ll.printLinkedList();
		ll.insertAtBeginning(1);
		ll.insertAtBeginning(1);
		ll.printLinkedList();
		ll.printLinkedList();
		ll.printLinkedList();
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(3);
		ll.printLinkedList();
		
		
		/*ll.insertAt("2",1);
		System.out.println("Inserted 2");
		ll.printLinkedList();*/
		
		System.out.println("Now remove duplicates from unsorted LinkedList :");
		ll.deleteDuplicates();
		ll.printLinkedList();
		
		/*System.out.println("Now remove duplicates from unsorted LinkedList :");
		ll.removeDuplicatesFromUnsortedLL();
		ll.printLinkedList();*/
		
		/*System.out.println("Now remove duplicates from unsorted LinkedList with buffer:");
		
		HashSet<Object> set = new HashSet<Object>();
		set = ll.removeDupFromUnsortedLinkedList();
		System.out.println(set);*/
		
		/*Implement an algorithm to find the nth to last element of a singly linked list.*/
		
		   
		/*System.out.println("Enter the index of nth item ");
		Scanner item = new Scanner(System.in);
		int nthitem = item.nextInt();*/
		
		/*Object nthNode = ll.printNthFromLast(2);
		System.out.println("The value of nth from last item is :" + nthNode);*/
		
		/*Object nthNode = ll.printNthFromLastIterative(4);
		System.out.println("The value of nth from last item is :" + nthNode);*/
		
		/*ll.deleteFromMiddle(4);
		System.out.println("the new linked list is :");
		ll.printLinkedList();*/
		
//		Write code to partition a linked list around a value x, such that all nodes 
//		less than x come before all nodes greater than or equal to x. 
//		
		/*ll.partition(7);
		System.out.println("partitioned list :");
		ll.printLinkedList();*/
	
	
	/*Node rs = ll.addNumbers(ll.first, ll2.first);
	System.out.print("Resultant List is ");
	ll.printLinkedList();*/
		
	  /* Node middle =	ll.isPalindrom(2);
	   System.out.print("The middle is : "+ middle.data);
	   ll.printLinkedList();*/
	
	}

}
