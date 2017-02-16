package backTracking;

import java.util.ArrayList;

/*Generate all Parentheses IIBookmark Suggest Edit
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
Make sure the returned list of strings are sorted.*/
public class GenerateAllParenthesis {
	
	public static ArrayList<String> generateParenthesis(int n){
		ArrayList<String> r = new ArrayList<String>();
		
		dft(r, "", n,n);
		return r;
		
	}
	
	public static void dft(ArrayList<String> r, String s, int left, int right){
		
		if(left>right)
			return;
		
		if(left ==0 && right==0){
			r.add(s);
			return;
			}
		if(left>0){
			dft(r, s+"(", left-1,right);
		}
		
		if(right>0){
			dft(r, s+")", left,right-1);
		}
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<String> r = new ArrayList<String>();
		
		r = generateParenthesis(3);
		System.out.println("The output is :");
		for(String i: r){
			System.out.println(i);
		}

	}

}
