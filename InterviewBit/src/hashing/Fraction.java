package hashing;

import java.util.HashMap;

/*FractionBookmark Suggest Edit
Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

Example :

Given numerator = 1, denominator = 2, return "0.5"
Given numerator = 2, denominator = 1, return "2"
Given numerator = 2, denominator = 3, return "0.(6)"*/

public class Fraction {
	
	public static String calculateFraction(int n, int d){
		
		
		if(n == 0){
			 return "0";
			 }
		if(d == 0){
			
			return "";
		}
		
			String result = "";
			long num = n, den = d;
			num = Math.abs(num);
			den = Math.abs(den);
			
			// quotient 
			long res = num / den;
			result = result + String.valueOf(res);
			
			// if remainder is 0, return result
			long rem = (num % den) *10;
			if(rem == 0)
				return result;
			
			//right side of decimal point
			HashMap<Long, Integer> map = new HashMap<Long, Integer>();
			
			result += ".";
			while(rem != 0){
				//if digits repeat
				if(map.containsKey(rem)){
					int beg = map.get(rem);
					String part1 = result.substring(0, beg);
					String part2 = result.substring(beg, result.length());
					result = part1 + "(" + part2 + ")";
					return result;
					}
				//continue
				map.put(rem, result.length());
				res = rem/den;
				result = result + String.valueOf(res);
				rem = (num % den) *10;
			}
	   return result;
	}

	public static void main(String[] args) {
		
		String result = calculateFraction(1, 2);
		System.out.println("The result of the fraction is :" + result);
	}

}
