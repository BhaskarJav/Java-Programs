package com.java.programs;

public class RandomNumbersExample {

	public static void main(String[] args) {

		int min = 300;
		int max = 500;

		double a = Math.random() * (max - min + 1) + min;
		System.out.println("The Random number between "+min+ " to "+max+" is:" +a);
		
		int b = (int)Math.random() * (max - min + 1) + min;
		System.out.println("The Random number between "+min+ " to "+max+" is:" +a);
		
		
	}

}
