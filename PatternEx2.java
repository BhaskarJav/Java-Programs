package com.java.programs;

public class PatternEx2 {

	public static void main(String[] args) {
		int i, j, rows = 6;

		for (i = 1; i < rows; i++) {

			for (j = i; j >= 1; j++) {
				System.out.print(j+" ");

			}

			System.out.println();

		}

	}

}
