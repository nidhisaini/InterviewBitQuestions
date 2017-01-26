
package arrays;
/*Palindrome StringBookmark Suggest Edit
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem*/
public class isPalindrome {
	
	public static int isPalin(String b) {
		
		if(b.length() == 0  || b == null)
			return 0;
		else if(b.length() == 1)
			return 1;
		else{
			String a =b.toLowerCase();
			int l = 0;
			int r = a.length()-1;
			
			while(l<r){
				
				while(l<r && !isValid(a.charAt(l))){
					l++;
				}
				while(l<r && !isValid(a.charAt(r))){
					r++;
				}
				
				if(a.charAt(l) != a.charAt(r))
					return 0;
			
				l++;
				r--;
			}
			return 1;
		}
	}
	
	public static boolean isValid(char c){
		
		if(c >= 'a'  && c <= 'z' )
			return true;
		if(c >= '0'  && c <= '9' )
			return true;
		
		return false;
	} 
	
	public static int isPalin1(String a) {
		   if(a == null || a.length() == 0)
		   return 0;
		   else{
		         int i, j;
		       String  c  = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		    
		      for(i=0, j=c.length()-1 ; i<j; i++, j--){
		        
		        if(c.charAt(i) != c.charAt(j)){
		           return 0;
		        }
		       
		    } 
		   return 1;
		       
		   }
		}
		
	
	

	public static void main(String[] args) {
		
		/*int r = isPalin("A man, a plan, a canal: Panama");	
		System.out.println("The string is a palindrom "+ r);*/
		
		int r1 = isPalin1("A man, a plan, a canal: Panama");	
		System.out.println("The string is a palindrom "+ r1);
		
	}

}
