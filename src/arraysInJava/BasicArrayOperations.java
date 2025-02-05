package arraysInJava;

import java.util.Scanner;

public class BasicArrayOperations {
	
	public static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int linearSearch(int[] arr, int n, int ele) {
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	
	public static int largestEle(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static boolean isSorted(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {20,10,20,4,100};
		int n = arr.length;
		
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		for(int i=0;i<m;i++) {
			arr2[i] = sc.nextInt();
		}
		
		printArray(arr,n);
		printArray(arr2,m);
		System.out.println(largestEle(arr,n));
		
		int[] arr3 = {20,20,78,98,99,97};
		System.out.println(isSorted(arr3, arr3.length));
		sc.close();
		
	}

}
