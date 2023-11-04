package Class_Program;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		System.out.print("Enter the Reverse Number: ");
//		int n, sum=0,result;
		Integer  sum=0,result;
		int n;
//		String s = sum.toString();
		
		Scanner s=new Scanner (System.in);
		
	    n=s.nextInt();
		while(n>0) {
			result=n%10;
			sum=sum*10 + result;
			n=n/10;
			
			 
		}

		System.out.println("The Reverse Number is: " +sum.toString());
	}

}
