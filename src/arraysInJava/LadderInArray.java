package arraysInJava;

import java.util.ArrayList;
import java.util.List;

public class LadderInArray {
	
	public static List<Integer> ladderInArray(int[] arr, int n){
		List<Integer> res = new ArrayList<>();
		int max = arr[n-1];
		res.add(max);
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>max) {
				res.add(arr[i]);
				max=arr[i];
			}
			
		}
		return res.reversed();
	}

	public static void main(String[] args) {
		int[] arr = {16,17,4,3,5,2};
		List<Integer> ladder = ladderInArray(arr, arr.length);
		System.out.println(ladder);
	}

}
