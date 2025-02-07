package JavaCollections;

import java.util.*;

public class JavaCollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new LinkedList<>();
		
		//add list
		li.add(45);
		li.add(1, 95);
		li.add(66);
		li.add(35);
		li.addFirst(33);
		li.addLast(62);
		
		System.out.println(li.size());
		System.out.println(li);
		
		// update list
		li.set(2, 100);
		
		//remove
		li.remove(3);
		
		System.out.println(li);
		
		// iterate list
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		// list into array
		Object[] arr = li.toArray();
		for(Object ele:arr) {
			System.out.println(ele);
		}

	}

}
