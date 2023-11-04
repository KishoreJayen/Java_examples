package Class_Program;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		Scanner s =new Scanner(System.in);
		int sum=0, result ,n;
	    int input = s.nextInt();
		n=(int) Math.pow(input,2);
		while(n>0) {
			result=n%10;
			sum=sum+result;
			n=n/10;
		}
		if(input==sum) {
			System.out.println("It is a Neon Number: ");
			
		}
		else {
			System.out.println("It is not a Neon Number: ");
		}
		}
}
	
		
		
	

