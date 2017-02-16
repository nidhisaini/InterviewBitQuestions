package backTracking;

import java.util.ArrayList;

public class Permutations {

	 public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        
	        result.add(new ArrayList<Integer>());
	        for(int i=0; i < a.size(); i++){
	          
	            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
	            
	            for(ArrayList<Integer> l : result){
	                
	                for(int j=0; j < l.size() + 1; j++){
                   
	                    
	                    l.add(j, a.get(i));
	                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
	                    current.add(temp);
	                  
	                    
	                    l.remove(j);
	                }
	            }
	            result = new ArrayList<ArrayList<Integer>>(current);
	        }
	        return result;
	        
	    }
	
	
	public static void main(String[] args) {
		//ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList<ArrayList<Integer>> result =  permute(list);
		System.out.println("The result is:");
		for(int i = 0; i< result.size(); i++){
            
            System.out.println(result.get(i));
            
        }
	}

}
