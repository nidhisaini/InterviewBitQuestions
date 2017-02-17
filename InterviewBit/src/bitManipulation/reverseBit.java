package bitManipulation;

/*Reverse bits of an 32 bit unsigned integer

Example 1:

x = 0,

          00000000000000000000000000000000  
=>        00000000000000000000000000000000
return 0

Example 2:

x = 3,

          00000000000000000000000000000011 
=>        11000000000000000000000000000000
return 3221225472
*/
public class reverseBit {

	public static long reverse(long a) {
	     long y = 0;
	     for (int i = 0; i < 32; ++i) {
	    	 y <<= 1;       // make space
	    	 y |= (a & 1);  // copy LSB of X into Y
	    	 a >>>= 1;      // shift X right
	     }
	     return y;
	}
	
	public static void main(String[] args) {
		long a = 00000000000000000000000000000011;
		long r = reverse(a);
		System.out.print(r);

	}

}
