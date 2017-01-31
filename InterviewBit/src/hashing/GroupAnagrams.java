package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static ArrayList<ArrayList<String>> anagrama(List<String> str){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		for(String s: str){
			char[] arr = new char[26];
			
			for(int i=0; i<s.length(); i++){
				arr[s.charAt(i)-'a']++;
			}
			String ns = new String(arr);
			
			if(map.containsKey(ns)){
				map.get(ns).add(s);
				}
			else{
			ArrayList<String> al = new ArrayList<String>();
			al.add(s);
			map.put(ns, al);
			}
		}
		result.addAll(map.values());
		
		
		return result;
	}
		
		
	

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("god");
		list.add("tac");
		
		
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result = anagrama(list);
		
		 for (int p = 0; p < result.size(); p++) {
	          
	            for (int q = 0; q < result.size(); q++) {
	               System.out.print(result.get(p).get(q) + " "); 
	            }
	            System.out.println(" ");
	        }
	}

}
