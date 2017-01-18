

import java.util.ArrayList;

/*Given an array of non negative integers A, and a range (B, C), 
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3 
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]*/
public class NumRange {
	
	public static int NumRangeFun(ArrayList<Integer> A, int B, int C){
		int count = 0;
		
		for(int i=0; i< A.size(); i++){
			int sum = A.get(i);
			
			if((sum >= B) && (sum <= C))
				count++;
			for(int j=i+1; j< A.size(); j++){
				sum = sum  + A.get(j);
				if((sum >= B) && (sum <= C)){
					count++;
					continue;
				}
				if(sum > C){
					break;
				}
				
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(6);
		a.add(1);
		a.add(0);
		a.add(5);
		
		int b = 6;
		int c = 8; 
		int result = NumRangeFun(a, b, c);
		System.out.println("the count of countinous number is:" + result);
	}
	
	

}
