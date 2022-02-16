package HashMapConcept;

import java.util.HashMap;

public class Product {

	// By Default java is assigning 16 virtual capacity for hashmap class as for
	// Array List 10 virtual capacity is getting assigned
	// For hashmap every segment consist of 4 division
	// As soon as 8th key0value pair reached in hashmap then it will directly converted from linked list to binary segment. 
	// Binary segment is faster than linked list

	public static void main(String[] args) {
		// key-value pair
		// <k-v>
		HashMap<String, String> prodmap = new HashMap<String, String>();
		prodmap.put("Name", "Macbook Pro");
		prodmap.put("Seller", "XYZ ent");
		prodmap.put("Size", "Macbook Pro 16 inches");
		System.out.println(prodmap.get("Name"));
		System.out.println(prodmap.get("Seller"));
		System.out.println(prodmap.get("Size"));

		prodmap.forEach((k, v) -> System.out.println(k + " : " + v));

		HashMap<Integer, String> stmap = new HashMap<Integer, String>();
		stmap.put(1, "RAM");
		stmap.put(2, "Rakesh");
		stmap.put(3, "Pooja");
		stmap.put(4, "RAM");
		stmap.put(8, "Rajesh");

		System.out.println(stmap.get(8));
		System.out.println(stmap.size());

		stmap.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
