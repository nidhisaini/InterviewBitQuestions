package hashing;

import java.util.ArrayList;
import java.util.List;

/*Diffk IIBookmark Suggest Edit
Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.*/
public class diffPossible {
	
	public static int diff(List<Integer> a, int b){
		 int i = 0;
	        int j = 1;
	        while(j < a.size() && i < a.size()){
	            
	            System.out.println(a.get(j) + " " + a.get(i));
	            
	                int diff = a.get(j) - a.get(i);
	                System.out.println("diff " + diff);
	                if(diff == b && i != j)
	                    return 1;
	                else if(diff < b)
	                    j++;
	                else 
	                    i++;
	            
	        }
	        return 0;
	}
	
	
	static boolean findPair(int arr[],int n)
    {
        int size = arr.length;
 
        // Initialize positions of two elements
        int i = 0, j = 1;
 
        // Search for a pair
        while (i < size && j < size)
        {
            if (i != j && arr[j]-arr[i] == n)
            {
                System.out.print("Pair Found: "+
                                 "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
 
        System.out.print("No such pair");
        return false;
    }

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(2);
		
		int r = diff(list, 0);
		System.out.println(r);
		
		/* int arr[] = {1, 5, 4, 1, 1};
	        int n = 0;
	       boolean r = findPair(arr,n);
	        System.out.println(r);
*/
	}

}
