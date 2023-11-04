package Class_Program;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {
      System.out.print("Enter the Number: ");
int fact=1;
Scanner s=new Scanner (System.in);
int n = s.nextInt();
for(int i=1; i<=n; i++) {
	fact= fact*i;
}
System.out.println(fact);
}

}
