package com.java.programs;

public class ObjectComparision {

	public static void main(String[] args) {

		String s1 = "Bhaskar";
		String s2 = new String("Bhaskar");
		String s3 = "Siva";
		System.out.println("Comparing s1 and s2 objects is " + s1.equals(s2)); // true
		System.out.println("Comparing s2 and s3 objects is " + s2.equals(s3));// false
		System.out.println("Comparing s1 ans s3 objects is " + s1.equals(s3));// false

		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3);// false
		System.out.println(s1 == s3);// true

	}

}
