package hashing;

/*Given a string, 
find the length of the longest substring without repeating characters.

Example:

The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

For "bbbbb" the longest substring is "b", with the length of 1.*/
import java.util.HashSet;
import java.util.Iterator;

public class LongestSubstring {
	
	
	public static int lengthOfLongestSubstring2(String s) {
		 int maxLength = 0;
	        
	        for(int i = 0; i < s.length(); i++) {
	            HashSet<Character> chars = new HashSet<Character>();
	            chars.add(s.charAt(i));
	            int j = i + 1;
	            while(j < s.length()) {
	                if(chars.contains(s.charAt(j))) {
	                    break;
	                }
	                else {
	                    chars.add(s.charAt(j));
	                    j++;
	                }
	            }
	            if(chars.size() > maxLength) {
	                maxLength = chars.size();
	            }
	        }
	        
	        return maxLength;
		}
	
	public static int lengthOfLongestSubstring(String a) {
		//String a = b.replaceAll("[0-9]","").toLowerCase(); 
	    
	    int result = 0;
	    
	    HashSet<Character> hs = new HashSet<Character>();
	    for(int i=0; i<a.length(); i++){
	        hs.add(a.charAt(i));
	        
	        int j = i+1;
	        while(j < a.length()){
	            
	            if(hs.contains(a.charAt(j))){
	                break;
	            }
	            else{
	                 hs.add(a.charAt(j));
	                 j++;
	            }
	        }
	    }
	    
	   /* Iterator<Character> it = hs.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }*/
	    if( hs.size() > result)
	    result =hs.size();
	    return result;
	} 

	public static void main(String[] args) {
		/*String a = "abcdefaz";
		int r = lengthOfLongestSubstring(a);
		System.out.println("The length of the string is "+ r);*/
		
		String a = "abcdefaz";
		int r = lengthOfLongestSubstring2(a);
		System.out.println("The length of the string is "+ r);
		

	}

}
