package arraysInJava;

import java.util.ArrayList;
import java.util.List;

public class DistinctLargestElem {

	public static List<Integer> getThreeLargest(int[] arr, int n){
		int fLargest=Integer.MIN_VALUE;
		int sLargest=Integer.MIN_VALUE;
		int tLargest=Integer.MIN_VALUE;
		
		for(int ele : arr) {
			if(ele>fLargest) {
				tLargest = sLargest;
				sLargest = fLargest;
				fLargest = ele;
			} else if(ele>sLargest && ele!=fLargest) {
				tLargest = sLargest;
				sLargest = ele;
			} else if(ele>tLargest && ele!=sLargest && ele!=fLargest) {
				tLargest=ele;
			}
		}
		
		List<Integer> res = new ArrayList<>();
		if(fLargest==Integer.MAX_VALUE)
			return res;
		res.add(fLargest);
		if(sLargest==Integer.MAX_VALUE)
			return res;
		res.add(sLargest);
		if(tLargest==Integer.MAX_VALUE)
			return res;
		res.add(tLargest);
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {10,4,3,50,23,10};
		
		List<Integer> res = getThreeLargest(arr,arr.length);
		for(int ele : res) {
			System.out.println(ele);
		}
	}

}
