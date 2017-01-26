package arrays;

import java.util.ArrayList;

public class plusOne {

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		
		int len = a.size()-1;
		for (int i = len; i >=1; i--) {
			if (a.get(i) < 1) {
				a.set(i, a.get(i) + 1);
			} 
			else {
				if (a.get(i) < 9) {
					a.set(i, a.get(i) + 1);
				}

				else {
					a.set(i, 0);
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list = plusOne(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
