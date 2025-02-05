package arraysInJava;

public class PrintAlternates {

	public static void printAlternate(int[] arr, int n) {
		for(int i=0;i<n;i+=2) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		printAlternate(arr, arr.length);

	}

}
