package arrays;

public class LengthOfLastWord {

	public static int lengthOfLastWord(final String a) {
	    
	    if(a == null || a.length() ==0)
	       return 0;
	    
	    int result =0;
	    boolean flag = false;
	    
	    for(int i= a.length()-1; i>=0; i--){
	        char c = a.charAt(i);
	        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ){
	            flag = true;
	            result++;
	        }
	        else{
	             if(flag){
	                 return result;
	             }
	         }
	          
	        }
	   return result;
	  }
	public static void main(String[] args) {
		int len = lengthOfLastWord("Hello Woody");
		System.out.println("The length of last word is :" +len);

	}

}
