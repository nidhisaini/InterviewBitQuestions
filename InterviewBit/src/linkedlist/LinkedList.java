package linkedlist;
import java.util.HashSet;

public class LinkedList {
	// data member
	Node first;

	// default constructor
	LinkedList() {
		first = null;
	}

	LinkedList(Node f) {
		this.first = f;
	}

	// helper method
	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	// insertAtBeginning
	void insertAtBeginning(int x) {
		Node n = new Node(x);
		n.next = first;
		first = n;
	}

	// traverse/print the list
	public void printLinkedList() {
		Node p = first;
		while (p != null) {
			// print each nodes data
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		// to show the end of the list
		System.out.println("NULL");
	}

	// deleteFromBeginning
	public Object deleteFromBeginning() {
		if (isEmpty()) {

			System.out.print("Can't delete from the empty list");
			return null;
		} else {
			Object deleted = first.data;
			first = first.next;
			return deleted;
		}

	}

	// insertAtEnd
	public void insertAtEnd(int x) {
		if (isEmpty())
			insertAtBeginning(x);
		else {
			Node n = new Node(x);
			Node p = first;
			while (p.next != null) {
				p = p.next;
			}
			p.next = n;
		}
	}

	// deletefromEnd
	public Object deletefromEnd() {
		if (isEmpty()) {
			System.out.println("Can't delete from the empty list");
			return null;
		} else {
			Node p = first;
			Node q = null;
			while (p.next != null) {
				q = p;
				p = p.next;
			}

			if (q != null) {
				q.next = null;
			} else { // implies exactly one element in the linked list
				first = null;
			}
			return p.data;
		}

	}

	// insertAt
	void insertAt(int x, int index) {
		if (index == 0) {
			insertAtBeginning(x);
		} else {
			Node n = new Node(x);
			Node p = first;
			int count = 0;

			while ((p != null) && (count < index - 1)) {
				p = p.next;
				count = count++;
			}

			if (p != null) {
				n.next = p.next;
				p.next = n;
			} else {
				System.out.println("Index exceeds list length");
			}

		}
	}

	// deleteFrom index position
	public Object deleteFrom(int index) {
		Object deletedItem;

		if (index == 0) {
			deletedItem = deleteFromBeginning();
			return deletedItem;
		} else {
			Node p = first;
			Node q = null;

			for (int i = 1; i <= index; i++) {
				q = p;
				p = p.next;
			}

			if (p != null) {
				q.next = p.next;
			} else {
				deletefromEnd();
			}

			return q.data;
		}

	}
	
	
	
	//removeDuplicates from sorted linked List
	//http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-list/
	public Node removeDuplicates() {
		Node p = first;
		Node c = first.next;
		if (isEmpty()) {
			System.out.println("The linked list is empty");
			return null;
		} else if (first.next == null) {
			System.out.println("Can't compare itmes because their is one item in the list");
			return first;
		} else {
			while (c != null) {
				if (p.data == c.data) {
					c = c.next;
				} else {
					p.next = c;
					p = p.next;
					c = c.next;
				}
			}
			p.next = null;
		}
		return first;
	}
	
	

	// remove duplicates from the unsorted linked list with no buffer
	public Node removeDuplicatesFromUnsortedLL() {
		Node p = first;
		Node q = null;
		while (p != null ) {
			q = p;//*****p and q points to the same node*****//
			
			while (q.next != null) {//****q points to the same node as p but q.next points to the node next to q***//
				
				if (p.data == q.next.data) {
					q.next = q.next.next;//remove q.next.next					
				} else {
					q = q.next;
				}
			}//end of inner while loop
			p = p.next;
		}//end of outer while loop
		return first;
	}
	
	
	
	/*remove duplicates from unsorted linked list with buffer. 
	We are going to use HashSet to store the elements of the Linked List. 
	HashSet doesn't store the duplicate values.
	 */
	public HashSet removeDupFromUnsortedLinkedList(){
		Node p = first;
		Node c = first.next;
		
		/*1. initalize the hashset 
		2. add data value of the first element of LL to the HashSet. */
		HashSet<Object> set = new HashSet<Object>();
		set.add(p.data);
		
		while( c!= null){
			//check if hash set contains the value
			if(!set.contains(c.data)){
				//add the value to the hash set and move both the pointers
				set.add(c.data);
				c = c.next;
				p = p.next;
			
			}
			else{
				//remove the node and connect p to c.next node
				c = c.next;
				p.next = c;
			}
		//end of while loop
		}
		return set;
	} 
	
	/*Implement an algorithm to find the nth to last element of a singly linked list.*/
	public Object printNthFromLast(int n){
		Node p = first;
		
		int len = 0;
		int nthitem;
		while(p != null){
			p = p.next;
			len++;
		}
		
		if(len <n)
		 System.out.println("The length is less then " + n);	
				
		p = first;
		//find the value of nth item in the list
		for(int i= 1; i< (len - n +1); i++)
		{
			p= p.next;
		}
			
	return p.data;
	} 
	
	
	/* Function to get the nth node from end of list using iterative approch */
    public Object printNthFromLastIterative(int n)
    {
        Node main_ptr = first;
        Node ref_ptr = first;
 
        int count = 0;
        if (first != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n+" is greater than the no "+" of nodes in the list");
                    
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
            while (ref_ptr != null)
            {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("Node no. "+n+" from last is "+ main_ptr.data);
          
        }
		return main_ptr.data;
    }
 
	
	
//	Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
//	EXAMPLE
//	Input: the node ‘c’ from the linked list a->b->c->d->e
//	Result: nothing is returned, but the new linked list looks like a->b->d->e
	/*public Object deleteFromMiddle(int position){
		 Node p = first;
			
			int count =1;
			while(count<position){
				p = p.next;
				count++;
			}			
				
			Node q= p.next;
			p.data = q.data;
			p.next = q.next;
				
	return first;
	}*/
	
	
		//search the node and return it
	public Object searchNode(int position){
	    Node q = first;
		
		int count =1;
		while(count<position){
			q = q.next;
			count++;
		}
		return q.data;
	}

	
	
	
//	Write code to partition a linked list around a value x, such that all nodes 
//	less than x come before all nodes greater than or equal to x. 
     public Node partition(int x){
    	 Node current = first;
    	 Node beforeStartRef = null;
    	 Node beforeEnd = null;
    	 Node afterStartRef = null;
    	 Node afterEnd = null;
     	 
    	 /*Partition*/
    	 while(current != null){
    		 Node next = current.next;
    		 current.next = null;
    		 System.out.println(" The value of the current node is :" + current.data);
    		 
    		 if(current.data < x){
    			 
    			 if(beforeStartRef == null){
    				 beforeStartRef = current;
    				 beforeEnd = beforeStartRef;
    				 
    			 }
    			 else{
    				 beforeEnd.next = current;
    				 beforeEnd = current;
    			 } 
    		 }
    		 else{
    			 if(afterStartRef == null){
    				 afterStartRef = current;
    				 afterEnd = afterStartRef;
    			 }
    			 else{
    				 afterEnd.next = current;
    				 afterEnd = current;
    			 }
    				 
    		 }
    		 current = next;
    	 }//end of while loop
    	 
    	 
    	// incase  Before list is empty
    		if(beforeStartRef == null){
    		    return beforeStartRef;
    		}
    	 
    	 Node ret = afterStartRef;
    	      	 
    	 if(beforeStartRef != null){
    		 /*Merge two list*/
      		 beforeEnd.next = ret;
      		 ret = beforeStartRef;
    		
    	 }	
    	  
    	 afterEnd.next  = null;
    	 ret = first;
    	
    return beforeStartRef;
    	   	 
    }
	
     /*Check if a Liked List is a palindrome*/
     public Node isPalindrom(int i){
		/*1. Find middle of the linked list
		  2. Reverse the second part of linked list
		  3. Compare the values of first linked list and the second linked list*/
    	 
    	 Node fastPtr = first;
    	 Node slowPtr = first;
    	 
    	 while(fastPtr != null && fastPtr.next != null){
    		 slowPtr = slowPtr.next;
    		 fastPtr =fastPtr.next.next;
    	 }
    		
    	 System.out.println("the middle of the linke list" + slowPtr.data);
    		/*end of find middle of the linked list */
    	Node prevNode = slowPtr;
    	Node nextNode = null;
    	Node currentNode = slowPtr;
    	while(currentNode != null){
    		nextNode = currentNode.next;
    		currentNode.next = prevNode;
    		prevNode = currentNode;
    		currentNode = prevNode;
    		 System.out.println("prevNode " + prevNode.data);
    	}
    	
    	return prevNode;
     }
     
    /* Remove Duplicates from Sorted ListBookmark Suggest Edit
     Given a sorted linked list, delete all duplicates such that each element appear only once.

     For example,
     Given 1->1->2, return 1->2.
     Given 1->1->2->3->3, return 1->2->3.*/
 	public Node deleteDuplicates() {
 	   
 	   if(first == null || first.next == null)
             return first;
  
 	  Node prev = first;    
 	  Node p = first.next;
  
         while(p != null){
             if(p.data == prev.data){
                 prev.next = p.next;
                 p = p.next;
                 //no change prev
             }else{
                 prev = p;
                 p = p.next; 
             }
         }
  
         return first;
 	}
     
     
    /* Add two numbers represented by linked lists*/
     public Node addTwoList(Node f, Node s){
    	 Node res = null;
    	 Node temp = null;
    	 Node prev = null;
    	 int carry = 0, sum;
    	 
    	 while(f != null || s!= null){
    		 
    		// The next digit is sum of following things
             // (i)  Carry
             // (ii) Next digit of first list (if there is a next digit)
             // (ii) Next digit of second list (if there is a next digit)
    		 sum = carry + (f!= null? f.data:0) + (s != null? s.data:0);
    		 
    		// update carry for next calulation
    		 carry = (sum >=10)? 1 :0;
    		 
    		 //update sum if it is greater than 10
    		 sum = sum%10;
    		 
    		// Create a new node with sum as data
    		 temp = new Node(sum);
    		 
    		 // if this is the first node then set it as head of
             // the resultant list
    		 if(res == null){
    			res = temp; 
    		 }
    		 else{ // If this is not the first node then connect it to the rest.
    			 prev.next = temp;
    		 }
    		 
    		// Set prev for next insertion
    		 prev = temp;
    		 
    		 if(f != null){
    			 f = f.next;
    		 }
    		 if(s != null){
    			 s = s.next;
    		 }
       	 }
    	 
    	 if(carry > 0){
    		 temp.next = new Node(carry);
    	 }
    	 return res;
     }
     
     
     
    /* Partition ListBookmark Suggest Edit
     Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

     You should preserve the original relative order of the nodes in each of the two partitions.

     For example,
     Given 1->4->3->2->5->2 and x = 3,
     return 1->2->2->4->3->5.*/
     public Node partition(Node a, int b) {
 	    
    	 Node curr = a;
 	     
    	 Node BeforeSr = null;
    	 Node BeforeE = null;
    	 Node AfterSr = null;
    	 Node AfterE = null;
 	    
 	    
 	    
 	    while(curr != null){
 	   
 	    	Node next = curr.next;
 	    curr.next = null;
 	    
 	    if(curr.data < b) { 
 	        
 	        if(BeforeSr == null){
 	            BeforeSr = curr;
 	            BeforeE = BeforeSr;
 	        }
 	        else{
 	            BeforeE.next = curr;
 	            BeforeE = curr;
 	        }
 	    }
 	    else{
 	        if(AfterSr == null){
 	            AfterSr = curr;
 	            AfterE = AfterSr;
 	        }
 	        else{
 	            AfterE.next = curr;
 	            AfterE = curr;
 	        }
 	    }
 	    curr = next;
 	}
 	
 	// incase  Before list is empty
 	if(BeforeSr == null){
 	    return AfterSr;
 	}
 	
 	//merge two lists
 	Node ref = AfterSr;
     if(BeforeSr != null){
         BeforeE.next = ref;
         ref = BeforeSr;
     }
     
     AfterE.next = null;
     ref = a;
     
     return BeforeSr;
 	}
     
     
/*List Cycle
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example :

Input : 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3. */
     
	public Node detectCycle(Node a) {
	    
		Node s = a;
		Node f = a;
	    
	    while(f != null && f.next != null){
	          s = s.next;
	          f = f.next.next;
	          if(s == f )
	              break;
 	    }
 	    
 	    if( f == null || f.next == null ){
 	        return null;
 	    }
 	    
 	    s = a;
 	    while( s != f ){
 	        s = s.next;
 	        f = f.next;
 	       
 	       
 	    }
 	   return f;
	}

	
     
     
     	
}
