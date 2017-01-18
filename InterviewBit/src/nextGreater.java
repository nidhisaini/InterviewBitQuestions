

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*NEXTGREATERBookmark Suggest Edit
Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 
More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]
Elements for which no greater element exist, consider next greater element as -1.

Example:

Input : A : [4, 5, 2, 10]
Output : [5, 10, 10, -1]

Example 2:

Input : A : [3, 2, 1]
Output : [-1, -1, -1]*/

public class nextGreater {
	
	public static ArrayList<Integer> nextGreaterArray(ArrayList<Integer> a){
		
		ArrayList<Integer> result = new ArrayList<>();
		System.out.print(a.size() + "the size of the list is :");
		int next = -1;
		for(int i=0; i<a.size(); i++){
			next = -1;
			for(int j=i+1; j<a.size(); j++){
				if(a.get(i) < a.get(j)){
					next = a.get(j);
					break;
				}
			}
			result.add(next);
		}
		return result;
	}
	
	
	public static ArrayList<Integer> nextGreaterArray1(ArrayList<Integer> a){
	
		int length = a.size();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=0; i<length;i++){
			if(s.isEmpty()){
				s.push(a.get(i));
			}
			
			while(!s.isEmpty() && s.peek() < a.get(i)){
				result.add(a.get(i));
				s.pop();
					
			}
			s.push(a.get(i));
			
			
			
			while(!s.isEmpty()){
				int top = (int) s.pop();
				 //System.out.println("Next greater element for " + top + "\t = " + -1);
				result.add(-1);
			}
			
		}
		return result;
	}
	
	 public static ArrayList<Integer> nextGreater2(ArrayList<Integer> a) {
	       
		 int[] res = new int[a.size()];
	        Arrays.fill(res, -1);
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i < a.size(); i++) {
	            int height = a.get(i);
	            while (!stack.isEmpty() && height > a.get(stack.peek())) {
	                res[stack.pop()] = height;
	            }
	            stack.push(i);
	        }
	        
	        ArrayList<Integer> result = new ArrayList<>();
	        for (int num : res) {
	            result.add(num);
	        }
	        return result;
	    }

	public static void main(String[] args) {

		/*ArrayList<Integer> b = new ArrayList<>();
		b.add(11);
		b.add(2);
		b.add(1);
		b.add(100);
		
		ArrayList<Integer> list = nextGreaterArray(b);
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}*/
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(2);
		b.add(11);
		
		ArrayList<Integer> list = nextGreater2(b);
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		
	}

}
