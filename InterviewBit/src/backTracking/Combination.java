package backTracking;

import java.util.ArrayList;

public class Combination {
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		if(n <= 0 || n < k)
			return result;
		
		ArrayList<Integer> item = new ArrayList<Integer>();
		combination(n, k, 1, item, result);
		return result;
	    
	}
	
	private static void combination(int n, int k, int start, ArrayList<Integer> item,
			ArrayList<ArrayList<Integer>> result) {
		
		if(item.size() == k){
			result.add(new ArrayList<Integer>(item));
			return;
		}
		
		for(int i= start; i<= n; i++){
			item.add(i);
			combination(n,k, i+1,item,result);
			item.remove(item.size()-1);
		}
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		list = combine(4, 2);
		
		for(ArrayList<Integer> a :list){
			System.out.println(a);
		}

	}

}
