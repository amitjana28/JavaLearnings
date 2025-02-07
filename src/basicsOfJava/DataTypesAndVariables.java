package basicsOfJava;

class Node{
	
	// Static variable count to count how many objects is created
	static int count;
	// They are instance variables
	int data;
	Node next;
	
	// Initializing them using constructor
	Node(int data){
		count++;
		this.data = data;
		this.next = null;
	}
}

public class DataTypesAndVariables {

	public static void main(String[] args) {
		// Primitive : boolean(8bits=1byte), byte(8bits), char(16bits), short(16bits), int(32bits), float(32bits) long(64bits), double(64bits)
		// Non-primitives : Strings, class, Objects, Interface, Arrays
		
		// they are local variables
		boolean bol = true;
		byte bt = 0;
		char ch = 'M';
		short age = 25;
		int number = 4562656;
		long mobileNo = 817894283;
		float pie = 3.14586f;
		double twoRoot = 1.4564246415454;
		
		
		
		/* 
		 * Local variables : Within methods, blocks or constructors, created the time of declaration and initialization must, destroyed after block ends
		 * Instance variables: Declared in a class but outside methods,constructor and blocks, created when object is created and destroyed with object, 
		 * 			They are only accessed by the creation of objects Initialization is not mandatory by default value is 0 we initialize them using 
		 * 			constructor or using instance block, scope will be thought the class except the static context.
		 * Static variables : Declaration similar to Instance variable only difference is static keyword is used with them. Each object have only one 
		 * 			copy of static variables, created starting of program execution and destroyed execution end, 
		 */
		
		// Each node having there individual data and next instance variables
		Node head = new Node(40);
		System.out.println(Node.count);
		head.next = new Node(50);
		System.out.println(Node.count);
		head.next.next = new Node(65);
		System.out.println(Node.count);
		

	}

}
