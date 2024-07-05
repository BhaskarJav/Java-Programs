package com.java.programs;

public class ObjectCreationNewClass {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class cls = Class.forName("ObjectCreationNewClass");
			ObjectCreationNewClass obj = (ObjectCreationNewClass) cls.newInstance();
			obj.methodCalling();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void methodCalling() {

		System.out.println("Welcome to Objection creation using new keyword");
	}

}
