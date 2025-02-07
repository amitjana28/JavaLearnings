package basicsOfJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Fun {

	static int lengthOfArray(ArrayList<Integer> arr) {
		int count=0;
		for(Object ele : arr) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// Two types of methods Predefined and user defined methods
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.addAll(Arrays.asList(new Integer[] {4,2,6,5,8}));
		
		// Predefined method to know length is
		System.out.println(arr.size());
		
		//Userdefined method to know length is
		System.out.println(lengthOfArray(arr));

	}

}
