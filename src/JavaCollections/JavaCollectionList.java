package JavaCollections;

import java.util.*;

public class JavaCollectionList {

	public static void main(String[] args) {
		/*
		 *  List maintain order of data in sequential order and duplicate allowed. ArrayList, LinkedList, Stack and Vector(rarely used)
		 *  Operations : add, update, remove, accessing, search, check element present or not
		 *  
		 *  ArrayList : Can grow according to requirement and can slow
		 *  Vector : Same as arraylist but thread-safe and allow null
		 */
		List<String> fruits = new ArrayList<>();
		
		// adding elements
		fruits.add("apple");
		fruits.add("starfruit");
		fruits.add(1,"kiwi");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("grapes");
		

		System.out.println(fruits);
		
		// Update elements
		fruits.set(1, "starfruit");
		fruits.set(2, "Kiwi");
		fruits.set(4, "Kiwi");
		
		System.out.println(fruits);
		
		//search using indexOf or lastIndexOf
		System.out.println(fruits.indexOf("Kiwi"));
		System.out.println(fruits.lastIndexOf("Kiwi"));
		
		//removing
		System.out.println(fruits.remove("Kiwi"));
		System.out.println(fruits);

		System.out.println(fruits.remove(0));
		System.out.println(fruits);
		
		//Accessing elements
		System.out.println(fruits.get(3));
		
		//check is element present
		System.out.println(fruits.contains("Kiwi"));
	}

}
