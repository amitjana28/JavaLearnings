package JavaCollections;

import java.util.*;

public class JavaCollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> li = new Stack<>();
		
		System.out.println(li.isEmpty());
		
		li.push("Dog");
		li.push("cat");
		li.push("rabbit");
		li.push("cow");
		System.out.println(li.pop());
		System.out.println(li.peek());
		System.out.println(li.search("cow"));
		
		// itterate over stack
		for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i));
		}
		

	}

}
