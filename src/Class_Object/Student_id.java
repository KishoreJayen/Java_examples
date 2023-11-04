package Class_Object;

import java.util.Scanner;

public class Student_id {
	int stud_id; //Class Variable
	String stud_name;
	void print( int id1, String name1) { // Method
		stud_id=id1;
		stud_name=name1;
		System.out.println("Student ID: "+stud_id);
		System.out.print("Student Name: "+stud_name);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Student id: ");
		int id= s.nextInt();
		System.out.print("Enter the Student Name:");
		String name=s.next();
		Student_id obj= new Student_id();
		obj.print(id, name); //Calling the method print
		
s.close();
	}

	
	}


