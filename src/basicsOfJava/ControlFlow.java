package basicsOfJava;

import java.io.*;

class Menu{
	static void showMenu() {
		System.out.println(
				"Please choose your drink :\n"
				+ "1. Coco cole\n"
				+ "2. Pepsi\n"
				+ "3. Red Bull\n"
				+ "4. exit\n"
				);
	}
}

public class ControlFlow {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		// If-else-if condition
//		int age = Integer.parseInt(br.readLine());
//		if(age<1 || age>100) {
//			System.out.println("Invalid age");
//		} else if (age<18) {
//			System.out.println("You can't vote");
//		} else {
//			System.out.println("You can vote");
//		}
//		
//		
//		// while loop and switch condition
//		while(true) {
//			Menu.showMenu();
//			int option = Integer.parseInt(br.readLine());
//			switch(option) {
//				case 1 : 
//					System.out.println("Here is your Coco cola.\n");
//					break;
//				case 2 : 
//					System.out.println("Here is your Pepsi.\n");
//					break;
//				case 3 :
//					System.out.println("Here is your Red bull.\n");
//					break;
//				case 4 : 
//					System.out.println("Thanks for visit\n");
//					break;
//				default :
//					System.out.println("Invalid Selection\n");
//			}
//			
//			if(option==4)
//				break;
//		}
		
		
		// for loop
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<11;i++) {
			//skip when i is 5 and continue rest
			if(i==5)
				continue;
			System.out.println(num*i);
		}
		
		System.out.println();
		
		// for each
		int[] arr = {4,6,2,8,9};
		for(int ele:arr) {
			System.out.println(ele*ele);
		}
		

	}

}
