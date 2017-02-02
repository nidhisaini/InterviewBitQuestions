package hashing;

import java.util.HashSet;

public class Colorful {
	
	public static int colorful(int a) {
	     String s = String.valueOf(a);

       HashSet<Integer> set = new HashSet<>();
 
       int temp = 0;

       while (temp < s.length()) {
           //if consecutive Integer is same return 0
    	 

           if (set.contains(s.charAt(temp) - '0')) return 0;
           set.add(s.charAt(temp) - '0');
           temp++;
       }

       int i = 0;
       int j = 1;
       int n = s.length();

       int val1 = 0;
       int val2 = 0;

       while (j < n) {

           val1 = s.charAt(i) - '0';
         
           
           val2 = s.charAt(j) - '0';
           
           
           if (set.contains(val1*val2))
        	   
               return 0;

           set.add(val1 * val2);

           i++;
           j++;
       }
       return 1;
       }

	public static void main(String[] args) {
		int a = 236;
		int r = colorful(a);
		System.out.println("The string is colorful "+ r);

	}

}
