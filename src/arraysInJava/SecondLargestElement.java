package arraysInJava;

import java.util.Arrays;

public class SecondLargestElement {
	
	// Idea is to sort the array and traverse from second last and find element not equal to last i.e largest one
	public static int nieveSecondLargest(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	// One pass to find largest and second pass to find second largest which is not equal to largest
	public static int twoPassSecondLargest(int[] arr, int n) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest)
				secondLargest=arr[i];
		}
		
		return secondLargest;
	}

	/* Idea is to compare element one by one if grater secondLargest will become largest and greater one is largest else if smaller then largest and greater 
	then second largest it become second largest */
	
	public static int onePassSecondLargest(int[] arr, int n) {
		int largest = -1, secondLargest = -1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] < largest && arr[i] > secondLargest){
				secondLargest = arr[i];
				
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,10};
		System.out.println(onePassSecondLargest(arr,arr.length));
	}

}
