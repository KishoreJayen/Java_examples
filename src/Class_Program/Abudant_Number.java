package Class_Program;

import java.util.Scanner;

public class Abudant_Number {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner s= new Scanner (System.in);
		int n;
		n=s.nextInt();
		int sum=0; 
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n) {
			System.out.println("It is Abudant Number: ");
		}
			else {
				System.out.println("Not a Abudant Number: ");
			}
		}
		

	}



