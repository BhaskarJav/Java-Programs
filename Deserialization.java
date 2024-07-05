package com.java.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("C:/Users/lenovo/Desktop/FileExampledata.txt"));
			Employee e=(Employee)in.readObject();   
			
			System.out.println(e.getName()+ " "+e.getId());
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}    
	
		
	}

}
