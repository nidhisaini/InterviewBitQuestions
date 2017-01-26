package arrays;

public class RomanToInteger {
	
	private static int romanToInt(String s) {
		 int r =0;
		 
		 for(int i=0; i< s.length(); i++){
			 int val1  = value(s.charAt(i));
			 
			 if(i+1 < s.length()){
				 
				 int val2 = value(s.charAt(i+1));
				 
				 if(val1 >= val2){
					 
					 r = r + val1;
				 }
				 else{
					 r = r + val2 - val1; 
					 i++;
				 }
			 }
			 else{
				  r = r + val1; 
				  i++;
			 }			 
		 }
		return r;
	}
	
	static int value(char r){
		if(r == 'I')
			return 1;
		if(r == 'V')
			return 5;
		if(r == 'X' )
			return 10;
		if(r == 'L')
			return 50;
		if(r == 'C' )
			return 100;
		if(r == 'D')
			return 500;
		if(r == 'M')
			return 1000;
		return -1;
	}

	public static void main(String[] args) {
	  int res = romanToInt("MCMIV");
	  System.out.println("The converted number is : " + res);

	}

}
