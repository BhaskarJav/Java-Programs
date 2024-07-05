package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilteringCollectonStream {

	public static void main(String[] args) {

		// List values using Stream
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "mobile", 15000f));
		productList.add(new Product(2, "Tv", 25000f));
		productList.add(new Product(3, "Fridge", 35000f));
		productList.add(new Product(4, "AC", 22000f));
		productList.add(new Product(5, "Inverter", 33000f));

		List<Float> productList1 = productList.stream().filter(p -> p.price < 20000).map(p -> p.price)
				.collect(Collectors.toList());

		System.out.println(productList1);

		// Iterating the List values using Stream

		productList.stream().filter(p -> p.price < 20000).forEach(p -> System.out.println(p.name));

		
		// count of List values
		long count = productList.stream().filter(p -> p.price > 20000).count();
		System.out.println(count);
		
	//	Converting List to Set Using Steam
		
		Set<Float> listtoSet = productList.stream().filter(p -> p.price < 20000).map(p -> p.price)
				.collect(Collectors.toSet());
		System.out.println(listtoSet);
		
//		Converting List to Map Using Steam
		
			Map<Integer, String> listtoMap = productList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
			System.out.println(listtoMap);
			
			
		// Write a Java Program to find duplicate or repeat element in given String
			
			
			String string = "Congratulation to Telugu Desam Party and Janasena Party";
			
			List<String> duplicateElements = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
			.stream().filter(x-> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
			System.out.println("Duplicate elemetns in a given String :"+duplicateElements);
			
			
			List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 25, 15, 19, 15, 98, 49);

			// List<Integer> numbers= myList.stream().filter(m -> m.getValue() >
			// 1).collect.(Collectors.reducing((number1,
			// number2)).(number1>number2)?number1::number2)).toList();

			List<Integer> duplicateElements1 = myList.stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
					.filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
			System.out.println("Duplicate elemetns in a given String :" + duplicateElements1);

			
			//first non repetative char in an given arrya
			
			String string1 = "Congratulation to Siva Bhaskar";
			Character character = string1.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().
			stream().filter(e->e.getValue()>=1).map(Map.Entry::getKey).findFirst().get();
			System.out.println("First non repeatative : "+character);
	
			
			
			string1.chars() // Convert the String to an IntStream
            .mapToObj(c -> (char) c) // Convert each int in the stream to a char
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group by character and count them
            .forEach((character1, frequency) -> System.out.println(character1 + ": " + frequency));
			
			
	}

}
