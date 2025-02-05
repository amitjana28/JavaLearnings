package stringsInJava;

public class BasicStringOperation {

	public static void main(String[] args) {
		String str  = "I am the richest person in the world";
		
		// searching for character in a string
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('s',20));
		System.out.println(str.lastIndexOf('h'));
		System.out.println(str.charAt(5));
		
		System.out.println(str.length());
		 int count = 0;
		 for(char ele : str.toCharArray()) {
			 count++;
		 }
		 
		 System.out.println(count);

	}

}
