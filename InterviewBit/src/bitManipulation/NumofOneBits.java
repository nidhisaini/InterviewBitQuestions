package bitManipulation;

public class NumofOneBits {

	public static int numSetBits(long a) {
	     int count = 0;
   for(int i=1; i<33; i++){
       if(getBit(a, i) == true){
           count++;
       }
   }
   return count;
	}
	
	public static boolean getBit(long a, int i){
   return (a & (1 << i)) != 0;
}
	
	 public static int numSetBits1(int a) {
	        int res = 0;
	        while (a != 0) {
	            if ((a & 1) == 1) {
	                res++;
	            }
	            a >>= 1;
	        }
	        return res;
	    }
	
	public static void main(String[] args) {
		
		int a = 00000000000000000000000000001011;
		int c = numSetBits1(a);
		System.out.println("The number of one bits are : "+ c);

	}

}
