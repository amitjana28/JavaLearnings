package stringsInJava;

public class CheckStringSame {

	public static boolean checkIsSame(String str, String str2) {
		if(str.length()!=str2.length())
			return false;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static int searchChar(String str, char ch) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		System.out.println(str.equals(str2));
		System.out.println(str.compareTo(str2));
		System.out.println(checkIsSame(str, str2));
		System.out.println(searchChar(str,'e'));
		System.out.println(str.indexOf('e'));
	}

}
