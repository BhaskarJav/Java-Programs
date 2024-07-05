package com.java.programs;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String selectedString = "Welcome to TCS Technolgy, Your are selected as a Java Developer";
		int count;
		char[] string = selectedString.toCharArray();

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != 0) {
					count++;
					string[j] = 0;
				}

			}
			if (count > 1 && string[i] != '0') {
				System.out.print(string[i]);
			}
		}

	}

}
