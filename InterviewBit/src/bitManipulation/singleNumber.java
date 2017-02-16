package bitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class singleNumber {

	public static int singleNumber2(final List<Integer> a) {
	    int r=0; 
	    HashMap<Integer, Integer> hm = new  HashMap<Integer, Integer>();
	    for(int i=0; i<a.size();i++){
	        if(!hm.containsKey(a.get(i))){
	            hm.put(a.get(i), 1);
	        }
	        else{
	             int val = hm.get(i);
	             hm.put(a.get(i), val);
	            }
	         }
	         
	         for(Map.Entry<Integer, Integer>  m: hm.entrySet()){
	                int v = m.getValue();
	             if(v<3)
	               r = m.getKey(); 
	             
	         }
	   return r;      
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
