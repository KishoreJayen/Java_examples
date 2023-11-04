package Class_Program;
import java.util.Scanner;
public class Find_Sum_of_digits {
	
	public static void main(String[] args) {
		int n, sum=0;
		System.out.println("Enter the Number: ");
		Scanner s= new Scanner (System.in);
		n=s.nextInt();
		while(n>0) {
			int result=n%10;
			sum=sum+result;
			n=n/10;	
		}
		System.out.println("The Sum of Value is: "+sum);
	}
	
	}


