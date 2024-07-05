package com.java.programs;

public class ObjectCreationClone {
	String name = "Siva Bhaskar";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) throws Exception {

		ObjectCreationClone obj1 = new ObjectCreationClone();
		System.out.println(obj1.getName());
		try {
			ObjectCreationClone obj2 = (ObjectCreationClone) obj1.clone();
			System.out.println(obj2.getName());
		} catch (Exception e) {
			System.out.println("New Object is created");
		}

	}

}
