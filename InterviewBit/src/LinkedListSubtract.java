/*Given a singly linked list, modify the value of first half nodes such that :

1st node’s new value = the last node’s value - first node’s current value
2nd node’s new value = the second last node’s value - 2nd node’s current value,
and so on …

 NOTE : 
* If the length L of linked list is odd, then the first half implies at first floor(L/2) nodes. So, if L = 5, the first half refers to first 2 nodes. 
* If the length L of linked list is even, then the first half implies at first L/2 nodes. So, if L = 4, the first half refers to first 2 nodes. 
Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5,

You should return 4 -> 2 -> 3 -> 4 -> 5
as

for first node, 5 - 1 = 4
for second node, 4 - 2 = 2
Try to solve the problem using constant extra space.*/
public class LinkedListSubtract {

	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.insertAtBeginning(1);
	ll.insertAtEnd(2);
	ll.insertAtEnd(3);
	ll.insertAtEnd(4);
	ll.insertAtEnd(5);
	ll.printLinkedList();
	int head =1;
	int a = ll.reverse(head);
	ll.printLinkedList();
	ll.subtract(head);
	ll.printLinkedList();

	}

}

class ListNode {
	      public int val;
	      public ListNode next;
	      
	      ListNode(int x)
	      { val = x; next = null; }
	  }

class LinkedList{
	// data member
	ListNode head;

		// default constructor
		LinkedList() {
			head = null;
		}

		LinkedList(ListNode f) {
			this.head = f;
		}
		
		// traverse/print the list
		public void printLinkedList() {
			ListNode p = head;
			while (p != null) {
				// print each nodes data
				System.out.print(p.val + " -> ");
				p = p.next;
			}
			// to show the end of the list
			System.out.println("NULL");
		}
		
		// insertAtBeginning
		void insertAtBeginning(int x) {
			ListNode n = new ListNode(x);
			n.next = head;
			head = n;
		}
		
		// insertAtEnd
		public void insertAtEnd(int x) {
		 
				ListNode n = new ListNode(x);
				ListNode p = head;
				while (p.next != null) {
					p = p.next;
				}
				p.next = n;
			
		}
		
		 /* Function to reverse the linked list */
	    ListNode reverse(ListNode node) {
	    	ListNode prev = null;
	    	ListNode current = node;
	    	ListNode next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }
	    
	    
	    
	    ListNode subtract(ListNode head) {
	        
	    	ListNode slow = head;
	    	ListNode fast = slow.next;
	         
	        while(fast !=null && fast.next != null) {
	             
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	         
	        // Reverse the second half and get it's head
	        ListNode head2 = reverse(slow.next);
	         
	        ListNode curr = head;    // pointer to first half
	        ListNode curr2 = head2; // Pointer to revesed second half list 
	         
	        while(curr2 != null) {
	             
	            curr.val = curr2.val - curr.val;
	            curr = curr.next;
	            curr2 = curr2.next;
	        }
	         
	        reverse(head2);
	       return head2;
	    }
	   
}
