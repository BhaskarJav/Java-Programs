package com.java.programs;

public class PatternEx1 {

	public static void main(String[] args) {

		int i, j, rows = 6;

		for (i = 0; i < rows; i++) {
			for (j = 2 * (rows - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}

	}

}
