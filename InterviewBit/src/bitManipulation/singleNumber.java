package bitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class singleNumber {

	public static int singleNumber2(final List<Integer> a) {
	  
	   
	    	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	        int num = 0;
	         
	        for (int i = 0; i < a.size(); i++) {
	            if (!hashMap.containsKey(a.get(i))) {
	                hashMap.put(a.get(i), 1);
	            } else if (hashMap.get(a.get(i)) == 1) {
	                hashMap.put(a.get(i), 2);
	            } else if (hashMap.get(a.get(i)) == 2) {
	                hashMap.remove(a.get(i));
	            }
	        }
	        Set<Integer> set = new HashSet<Integer>();
	        set = hashMap.keySet();
	         
	        for (Integer n : set) {
	            num = n;
	        }
	        return num;    
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(1);
		a.add(2);
		
		  int num = singleNumber2(a);
		  System.out.println("The number is "+ num);

	}

}
