package basicsOfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) throws IOException{
		// User Input from buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(name);
		
		// User input from scanner 
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		System.out.println(age);
		System.out.println(gender);
		
	}

}
