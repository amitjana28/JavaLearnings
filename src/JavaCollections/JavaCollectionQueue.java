package JavaCollections;

import java.util.*;

public class JavaCollectionQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> li = new LinkedList<>();
		
		li.add(42); // Add at last and this will give error if queue is full
		li.offer(62); // Add at last and this will return false if queue is full
		li.offer(95);
		li.offer(66);
		li.offer(32);
		li.offer(11);
		
		System.out.println(li);
		
		li.remove(); // remove from start and give error if empty queue
		li.poll(); // remove from start and return null if empty queue
		
		System.out.println(li);
		
		
		// Convert into array and then iterate
		Object[] arr = li.toArray();
		for(Object ele : arr) {
			System.out.println(ele);
		}
		

		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
