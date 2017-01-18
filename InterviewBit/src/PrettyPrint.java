import java.util.ArrayList;

public class PrettyPrint {
	
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	    if(a <= 0){
	     return result;
	        
	    }
	    
	    //matrix init
	    int n = 2 * a - 1;  
	    int [][] m = new int[n][n];
	    
	    //update matrix
	    
	    int i = 0;
	    int j = 0;
	    int dir = 0;
	    for(int num = a; num > 0; num--){
	        
	        int size = num == 1 ? 1 :(2 * num - 1) * (2 * num - 1) - (2 * num - 3) * (2 * num - 3);
	        int count = 0;
	        while(count < size){
	            
	            count++;
	            m[i][j] = num;
	            
	            if(dir == 0){
	                j++;//move right
	                if( j == n || m[i][j] != 0){
	                    dir = 1;
	                    j--;
	                    i++;
	                }
	            }
	            else if(dir == 1){
	                i++;// move down
	                if( i == n || m[i][j] != 0){
	                    dir =2;
	                    i--;
	                    j--;
	                }
	            }
	            else if(dir == 2){
	                j--;//move left
	                if(j < 0 || m[i][j] != 0 ){
	                    dir = 3;
	                    j++;
	                    i--;
	                }
	            }
	            else{
	                i--;//move up
	                if(i < 0 || m[i][j] != 0){
	                    dir = 0;
	                    i++;
	                    j++;
	                }
	            }
	            
	            }
	        }
	        

	        for(int p = 0; p < n; p++){
	             ArrayList<Integer> list = new ArrayList<>();
	            for(int q = 0; q < n; q++){
	                list.add(m[p][q]);
	        }
	         result.add(list);
	    }
	  return result;  
	}


	public static void main(String[] args) {
	
		 ArrayList<ArrayList<Integer>> actual = prettyPrint(3);
		 for (int p = 0; p < actual.size(); p++) {
	          
	            for (int q = 0; q < actual.size(); q++) {
	               System.out.print(actual.get(p).get(q) + " "); 
	            }
	            System.out.println(" ");
	        }

	}

}
