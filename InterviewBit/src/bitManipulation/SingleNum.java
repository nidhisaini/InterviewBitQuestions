package bitManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SingleNum {

	public static int singleNumber(final List<Integer> a) {
	    
	    HashSet<Integer> hs = new  HashSet<Integer>();
	    for(int i=0; i< a.size(); i++){
	       if(!hs.add(a.get(i)))
	           hs.remove(a.get(i));	           
	    }
	    
	    Iterator<Integer> it = hs.iterator();
	return it.next();
	}
	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(2);
	a.add(3);
	a.add(1);
	
	  int num = singleNumber(a);
	  System.out.println("The number is "+ num);
	}

}
