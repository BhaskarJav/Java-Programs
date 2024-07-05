package com.java.programs;

public class PalindromeExample {

	public static void main(String[] args) {

		int temp, r, sum = 0;
		int n = 454;

		temp = n;

		while (n > 0) {
			r = n % 10;
			System.out.println("14 r value" +r);
			sum = (sum * 10) + r;
			System.out.println("16 sum value" +sum);
			n = n / 10;
			System.out.println("18 n value" +n);	
		}

		if (temp == sum) {
			System.out.println("Given Number is Palindrom Number");
		} else {
			System.out.println("Given Number is Non-Palindrom Number");
		}
	}

}
