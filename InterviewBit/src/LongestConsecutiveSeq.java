

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class LongestConsecutiveSeq {
	
	public static int LongestSequence(List<Integer> a){
		int lengthOfLSC = 0;
		HashSet<Integer> hashSet = new HashSet<Integer>();	
		hashSet.addAll(a);
	
		for(Integer value: a){
			
			if(!hashSet.contains(value-1)){
				int temp = value;
				while(hashSet.contains(temp)){//if next number is present
					temp++;
				}
				
				if(lengthOfLSC < (temp-value)){//is this the largest subset
					lengthOfLSC = temp-value;
				}
			}
		}
		return lengthOfLSC;
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(1);
		a.add(101);
		a.add(2);
		a.add(3);
		int result = LongestSequence(a);
		System.out.println("the longest sequence count is " + result);

	}

}
