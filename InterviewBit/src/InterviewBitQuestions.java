import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class InterviewBitQuestions {
	
	/*private static int FindDup(int[] num) {
		int r =-1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0 ; i< num.length-1; i++ ){
			
			if(!hm.containsKey(num[i])){
				hm.put(num[i], 1);
			}
			else
				r = num[i]; 
		}
		
		return r;
	}
	*/
	
	public static void FindTarget(int arr[],int t){
		int a[] ={0,0};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0 ; i< arr.length; i++ ){
			hm.put(arr[i], i);	
		}	
		
		for(Entry<Integer, Integer> m: hm.entrySet()){
			int val = t-m.getKey();
			if(hm.containsKey(val)){
				System.out.println(hm.get(val));
			}
				
		}
		
		//return m.getkey;
	}
	
	public static int lengthofLastWord(String str){
		if(str == null || str.length() == 0)
			return 0;
		
		int result =0;
		boolean flag = false;
					
			for(int i = str.length()-1; i>=0;i--){
				char c  = str.charAt(i);
				System.out.println("the char is "+ c);
				if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')){
					
					flag = true;
					result++;
				}
				else{
					if(flag)
						System.out.println("the flag is "+ flag);
						return result;
				}
			}
			
			return result;	
	}
	
	
	public static ArrayList<ArrayList<Integer>>  prettyPrint(int A){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        if (A <= 0) {
	            return result;
	        }
	        // initialize matrix
	        int n = 2 * A - 1;
	        int[][] matrix = new int[n][n];

	        // update matrix
	        int i = 0;
	        int j = 0;
	        int dir = 0;
	        for (int num = A; num > 0; num--) {
	            // watch the corner case when num = 1
	            int size = num == 1 ? 1 
	                    : (2 * num - 1) * (2 * num - 1) - (2 * num - 3) * (2 * num - 3);
	            int count = 0;
	            while (count < size) {
	                // print number in a circle
	                count++;
	                matrix[i][j] = num;
	                if (dir == 0) {
	                    j++; // move to right
	                    if (j == n || matrix[i][j] != 0) {
	                        dir = 1;
	                        j--;
	                        i++;
	                    }
	                } else if (dir == 1) {
	                    i++; // move downwards
	                    if (i == n || matrix[i][j] != 0) {
	                        dir = 2;
	                        i--;
	                        j--;
	                    }
	                } else if (dir == 2) {
	                    j--; // move to left
	                    if (j < 0 || matrix[i][j] != 0) {
	                        dir = 3;
	                        j++;
	                        i--;
	                    }
	                } else {
	                    i--; // move upwards
	                    if (i < 0 || matrix[i][j] != 0) {
	                        dir = 0;
	                        i++;
	                        j++;
	                    }
	                }
	            }
	        }

	        // fill the result
	        for (int p = 0; p < n; p++) {
	            ArrayList<Integer> list = new ArrayList<>();
	            for (int q = 0; q < n; q++) {
	            	list.add(matrix[p][q]);
	            }
	            result.add(list);
	        }

	        return result;
	    }
	

	public static void main(String[] args) {
		/*int[] num ={3,4,1};
		int r = FindDup(num);
		System.out.println(r);*/
		
		/*int[] arr ={2,7,11,5};
		int t =9;
		FindTarget(arr,t);*/
	/*	int[] a = FindTarget(arr,t);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}*/
		
		/*int len = lengthofLastWord("the sky is blue");
		System.out.println("The length of the string is:"+ len);*/
		
		int A = 3;
		 ArrayList<ArrayList<Integer>> actual =prettyPrint(A);
		 for (int p = 0; p < actual.size(); p++) {
	          
	            for (int q = 0; q < actual.size(); q++) {
	               System.out.print(actual.get(p).get(q) + " "); 
	            }
	            System.out.println(" ");
	        }
	}
	
	

	

}
