package Class_Program;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number: ");
		Scanner s= new Scanner (System.in);
		 int n, sum=0;
		 n=s.nextInt();
		 for(int i=1; i<n; i++) {
			 if (n%i==0) {
				 sum=sum+i;
			  }
		 }
		if (sum==n)
			System.out.println("It is Perfect Number: "+n);
		else
			System.out.println("Not a perfect Number: "+n);
		
	}
}