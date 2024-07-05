package com.java.programs;

public class Test {

	public static void main(String[] args) {
		String string = "@Gunisetty Venkata Siva Bhaskar@";
		
	/*StringBuffer strBuffer = new StringBuffer();
		StringBuffer buffer = strBuffer.append(string);
		StringBuffer deleteCharAt = buffer.deleteCharAt(0);
		System.out.println(deleteCharAt); 
		//StringBuffer buffer2 = buffer.delete(0, 30);
		StringBuffer deleteCharAt1 = deleteCharAt.deleteCharAt(deleteCharAt.length()-1);
		System.out.println(deleteCharAt1);  */
		
		
		String removeFirstandLat = removeFirstandLat(string);
		System.out.println(removeFirstandLat);
		
	}

	private static String removeFirstandLat(String string) {
		return string.substring(1, string.length()-1);
		
	}

}
