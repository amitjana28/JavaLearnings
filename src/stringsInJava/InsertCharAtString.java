package stringsInJava;

public class InsertCharAtString {

	public static String insertChar(StringBuilder str, int index, char ch) {
		str.insert(index,ch);
		return str.toString();
	}
	
	public static String deleteChar(StringBuilder str, int index) {
		str.deleteCharAt(index);
		return str.toString();
	}
	
	public static String customInsertChar(String str, int index, char ch) {
		StringBuilder newStr = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i==index) 
				newStr.append(ch);
			newStr.append(str.charAt(i));
		}
		
		if(index>=str.length())
			newStr.append(ch);
		
		return newStr.toString();
	}
	
	public static String customDeleteChar(String str, int index) {
		StringBuilder newStr = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i==index) 
				continue;
			newStr.append(str.charAt(i));
		}
		
		return newStr.toString();
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello Amit");
		System.out.println(insertChar(str,4,'m'));
		System.out.println(customInsertChar("Rahul Jana",4,'m'));
		
		System.out.println(deleteChar(str,3));
		System.out.println(customDeleteChar("Rahul Jana",4));
	}

}
