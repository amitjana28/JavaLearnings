package javaOOPSConcepts;

class Student{
	private String sName;
	private int age;
	
	void setDetails(String sName, int age) {
		this.sName = sName;
		this.age = age;
	}
	
	void getDetails() {
		System.out.println("Name of the Student is "+ sName+ " and age is "+ age);
	}
}

public class Employees {
	
	static String empName;
	static float empSalary;
	
	static void setDetails(String name, float salary) {
		empName = name;
		empSalary = salary;
	}
	
	static void getDetails() {
		System.out.println("Name of the employee is "+ empName+ " and salary is "+ empSalary);
	}

	public static void main(String[] args) {
		Employees.setDetails("Amit jana", 9564516.65f);
		Employees.getDetails();
		
		Student s1 = new Student();
		s1.setDetails("Rahul", 22);
		s1.getDetails();

	}

}
