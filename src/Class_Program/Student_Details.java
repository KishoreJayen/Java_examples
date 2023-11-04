package Class_Program;

import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		int id, contact, salary;
		String name, address;
		id=s.nextInt();
		name=s.next();
		s.nextLine();
		address=s.nextLine();
		contact=s.nextInt();
		salary=s.nextInt();
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Adress: "+address);
		System.out.println("Contact: "+contact);
		System.out.println("Salary: " +salary);
		
		

	
	}

}
