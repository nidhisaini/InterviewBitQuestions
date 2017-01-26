package stringsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class repeatedNumber {
	public static int repeatedNumber(final List<Integer> a) {
	    
	    HashMap<Integer, Integer> hm = new  HashMap<Integer, Integer>();
	    int result = -1;
	   
	    for(int i=0; i<a.size(); i++){
	        if(!hm.containsKey(a.get(i))){
	            hm.put(a.get(i), 1);
	        }
	        else{
	        	int val = hm.get(a.get(i));
				val++;
				hm.put(a.get(i), val);
	        }
	    }
	    
	   
	    for(Entry<Integer, Integer> m : hm.entrySet()){
	        int val = m.getValue();
	        if(val > 1){
	          result = m.getKey();}
	    }
	    return result;
	    
    
 }

	public static void main(String[] args) {
		ArrayList<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(2);
		b.add(11);
		b.add(3);
		int r = repeatedNumber(b);
		System.out.println(r);

	}

}
