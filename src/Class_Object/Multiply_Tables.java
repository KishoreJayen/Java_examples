package Class_Object;

import java.util.Scanner;

public class Multiply_Tables {

	public static void main(String[] args) {
		 Scanner s= new Scanner (System.in);
		 System.out.println("Enter the Table: ");
		 int t=s.nextInt();
		 System.out.println("Enter the Limit: ");
		 int n=s.nextInt();
		 for (int i=1; i<=n; i++) {
			 System.out.println(i + " x " + t + " = " + (t*i));
		 }

	}

}
