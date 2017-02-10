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
	
	public static void main(String[] args) {
		
		long a = 00000000000000000000000000001011;
		int c = numSetBits(a);
		System.out.println("The number of one bits are : "+ c);

	}

}
