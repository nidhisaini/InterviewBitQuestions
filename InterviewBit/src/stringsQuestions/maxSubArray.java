/*Max Sum Contiguous SubarrayBookmark Suggest Edit
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.*/

package stringsQuestions;

import java.util.ArrayList;
import java.util.List;

public class maxSubArray {

	public static int maxSubArray(final List<Integer> a) {
	    
	    int len = a.size();
	    int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	    for(int i=0; i< len;i++){
	        if(len == 1){
	            max_so_far = a.get(i); 
	            //return max_so_far;
	        }
	        else{
	        max_ending_here = max_ending_here + a.get(i);
	        if(max_so_far < max_ending_here){
	            max_so_far = max_ending_here;
	        }
	        if(max_ending_here < 0){
	            max_ending_here = 0;
	        }
	    }
	  
	   }
	    return max_so_far; 
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(-5);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(-5);
		int a = maxSubArray(list);	
		System.out.println("The max sub array is sum is :" +a);
	}

}
