package stringsInJava;

public class BasicsStringInJava {

	public static void main(String[] args) {
		// Immutable strings
		String str = "Hello Amit"; //stored in static memory
		String name = new String("Amit Jana"); // stored in heap memory

		// mutable and thread safe
		StringBuffer newStr = new StringBuffer("Hi Amit");
		
		// mutable and not thread safe it is only used
		StringBuilder newStr2 =new StringBuilder("Hello World");
		
		// String tokenizer is used to break the string into tokens
	}

}
