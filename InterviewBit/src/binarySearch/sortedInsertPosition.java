package binarySearch;
/*Sorted Insert PositionBookmark Suggest Edit
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0*/

import java.util.ArrayList;

public class sortedInsertPosition {

	public static int searchInsert(ArrayList<Integer> a, int b) {
		  
	    int i=0;
	    int j = a.size()-1;
	    
	   while(i <= j){
	       int mid = (i+j)/2;
	       
	       if(b > a.get(mid))
	          i = mid +1;
	        else if(b < a.get(mid))
	          j = mid -1;
	        else
	           return mid;
	   }
	    
	  return i;  
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		
		int a = 5;
		
		int r = searchInsert(list,a);
		System.out.println("The index is " + r);

	}

}
