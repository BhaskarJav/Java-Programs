package com.java.programs;

public class ReverseNumberwhileloop {

	public static void main(String[] args) {

		int number = 123546;
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;

			reverse = reverse * 10 + remainder;

			number = number / 10;
		//	System.out.println(number);
		}
		
		System.out.println(reverse);
	}

}
