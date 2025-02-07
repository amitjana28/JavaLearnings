package JavaCollections;

import java.util.*;

public class JavaCollectionSet {

	public static void main(String[] args) {
		// unordered collection of object with no duplicate value, allow only one null value, Thread safe
		
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> hs2 = new HashSet<Integer>();
		Set<Integer> union = new HashSet<Integer>(hs);
		Set<Integer> intersection = new HashSet<Integer>(hs);
		
//		hs.add(95);
		hs.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9, 0}));
		System.out.println(hs);
		
		hs2.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		System.out.println(hs2);
		
		union.addAll(hs2);
		System.out.println(union);
		
		intersection.retainAll(hs2);
		System.out.println(intersection);
		
		
	}

}
