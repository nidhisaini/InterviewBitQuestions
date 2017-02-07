package binarySearch;

/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).

You are given a target value to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Input : [4 5 6 7 0 1 2] and target = 4
Output : 0

NOTE : Think about the case when there are duplicates. Does your current solution work? How does the time complexity change?**/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class rotatedSortedArraySearch {

	public static int search(final List<Integer> a, int b) {
		int index =-1;
		
		for(int i=0; i<a.size();i++){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		if(!hm.containsKey(a)){
			hm.put(a.get(i), i);
		}
		
		for(Entry m: hm.entrySet())
			if(m.getKey().equals(b)){
				index =(int) m.getValue();	
				
		}

		}
		return index;
	}
	
	public static int search1(final int[] a, int b) {
		 return binarySearch(a, 0, a.length-1, b);
	}
	 
	public static int binarySearch(int[] nums, int left, int right, int target){
	    if(left>right) 
	        return -1;
	 
	    int mid = left + (right-left)/2;
	 
	    if(target == nums[mid])
	        return mid;
	 
	    if(nums[left] <= nums[mid]){
	        if(nums[left]<=target && target<nums[mid]){
	          return binarySearch(nums,left, mid-1, target);
	        }else{
	          return  binarySearch(nums, mid+1, right, target);
	        }
	    }else {
	        if(nums[mid]<target&& target<=nums[right]){
	          return  binarySearch(nums,mid+1, right, target);
	        }else{
	          return  binarySearch(nums, left, mid-1, target);
	        }
	    }
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new 	ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(0);
		list.add(1);
		list.add(3);
		
		int index = search(list, 8);
		System.out.println(index);

	}

}
