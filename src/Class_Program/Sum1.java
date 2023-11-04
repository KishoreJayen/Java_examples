package Class_Program; //program to find sum of n natural program

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int result=0;
		for(int i=1; i<=n;i++) {
			result +=i;
		}
		System.out.println("Sum = "+result);
		s.close();
	}
	

	}
	
	

