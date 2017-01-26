package InterviewBit;

import java.util.ArrayList;

public class setZeroMatrix {

	public static int[][] setZeroes(int[][] m) {

		// check if first row/col have any zero and set the variable
		// firstrowHasZero and firstcolHasZero
		boolean firstrowHasZero = false;
		boolean firstcolHasZero = false;

		// check if first row has zero
		for (int i = 0; i < m.length; i++) {
			if (m[0][i] == 0) {
				firstrowHasZero = true;
				break;
			}
		}

		// check if first col has zero
		for (int j = 0; j < m[0].length; j++) {
			if (m[j][0] == 0) {
				firstcolHasZero = true;
				break;
			}
		}

		/*
		 * iterate through the rest of the matrix, setting m[i][0] = 0 and
		 * m[0][j] = 0 to zero whenever there's a zero in m[i][j]
		 */

		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m[0].length; j++) {
				if (m[i][j] == 0) {
					m[i][0] = 0;
					m[0][j] = 0;
				}
			}
		}

		// use mark to set elements
		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m[0].length; j++) {
				if (m[i][0] == 0 || m[0][j] == 0) {
					m[i][j] = 0;
				}
			}
		}

		// set first row to zero, if there's a zero in m[i][0]
		if (firstrowHasZero) {
			for (int i = 0; i < m.length; i++) {
				m[0][i] = 0;
			}
		}

		// set first col to zero, if there's a zero in m[0]j]
		if (firstcolHasZero) {
			for (int j = 0; j < m[0].length; j++) {
				m[j][0] = 0;
			}
		}
		return m;
	}

	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {

				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 1 }, { 1, 1, 1}, { 1, 1, 1} };
		System.out.println("The input is: ");
		print(arr);
		int[][] r = setZeroes(arr);
		System.out.println("The result is: ");
		
		print(r);

	}

}
