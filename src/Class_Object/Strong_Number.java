package Class_Object;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int strong=n;
		int result, fact, sum=0;
		while (n>0) {
			result=n%10;
			fact=1;
			for (int i=1; i<=result; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
     if (sum==strong)
    	 System.out.println("It is Strong Number:  "+strong);
     else
    	 System.out.println("Not a Strong Number: "+strong);
	}
	

}
