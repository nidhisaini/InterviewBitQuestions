package binarySearch;

import java.util.ArrayList;
import java.util.List;

/*Count Element OccurenceBookmark Suggest Edit
Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.

PROBLEM APPROACH :

For complete solution, look at the hint.
https://www.youtube.com/watch?v=pLT_9jwaPLs&feature=player_embedded
https://www.youtube.com/watch?v=OE7wUUpJw6I*/
public class countElementOccurence {

	public static int findCount(int[] a, int b, boolean flag) {
		
		int low = 0;
		int high = a.length-1;
		int mid = (low + high)/2; 
		int result = -1;
		
		while(low<=high){
			
			if(a[mid] == b){
				
				result = mid;
				if(flag)
				  high = mid-1; //Go on searching towards left
				else
					low = mid+1;//Go on searching towards right
				}
			else if(b < a[mid])
				high = mid-1;
			else
				low = mid +1;
			}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(5);
		a.add(6);
		a.add(7);*/
		
		int[] a = {1,2,3,4,5,5,6,7,8}; 
		System.out.println("find count :");
		int firstIndex = findCount(a, 5, true);
		int lastIndex = findCount(a, 5, false);
		int r = lastIndex - firstIndex +1;
		System.out.println("The count is" + r);
		
		/*if(firstIndex == -1){
			System.out.println("The count is" + 0);
		}
		else{
			
			
		}*/
		

	}
	
	
	

}
