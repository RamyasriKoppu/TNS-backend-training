package com.tnsif.collectionsdemo;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		
		        List<String> names = new ArrayList<String>();

		        // Add elements
		        names.add("Alice");
		        names.add("Bob");
		        names.add("Charlie");

		        // Print the list
		        System.out.println("Names: " + names);

		        // Check size
		        System.out.println("Size: " + names.size());

		        // Check if list is empty
		        System.out.println("Is empty? " + names.isEmpty());

		        // Check if it contains "Bob"
		        System.out.println("Contains Bob? " + names.contains("Bob"));

		        // Get element at index 1
		        System.out.println("Element at index 1: " + names.get(1));

		        // Remove "Bob"
		        names.remove("Bob");
		        System.out.println("After removing Bob: " + names);

		        // Convert to array
		        Object[] arr = names.toArray();
		        System.out.println("Array: " + Arrays.toString(arr));

		        // Keep only "Alice"
		        names.retainAll(Collections.singleton("Alice"));
		        System.out.println("After retainAll: " + names);

		        // Clear the list
		        names.clear();
		        System.out.println("After clear: " + names);
		    }
	}
