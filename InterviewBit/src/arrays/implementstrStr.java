package arrays;
/*Please Note:

Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases. */
public class implementstrStr {
	
	public static int ImpStrStr(String a,String b ){
		if(a == null || b== null )
			return 0;
		
		if(b.length() ==0)
			return 0;
		
		for(int i=0;i<a.length();i++){
			if(i+ b.length() > a.length())
				return -1;
		
		int m = i;
		for(int j=0;j<a.length();j ++){
			if(b.charAt(j) == a.charAt(m)){
				if(j == b.length()-1)
					return j;
				m++;
			}
			else{
				break;
			}
		}
	}
		return -1;
	}
	

	public static void main(String[] args) {
		String a = "haystack";
		String b= "needle";
		int r = ImpStrStr(a,b);
		System.out.println(r);

	}

}
