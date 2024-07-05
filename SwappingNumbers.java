package com.java.programs;

public class SwappingNumbers {

	

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		SwappingNumbers swap = new SwappingNumbers();
		
		System.out.println("Before Swapping Two numbers are "+ a + " and "+b);
		swap.swapNumbers(a, b);
	}

	private void swapNumbers(int a, int b) {
		 a = a+b; // 5+6 = 11
		 b = a-b;  // 11-6 = 5
		 a= a-b; // 11 -5 = 6
		 
		 System.out.println("After Swapping Two numbers are "+ a + " and "+b);
	}

}
