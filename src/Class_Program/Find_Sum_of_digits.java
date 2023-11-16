package Class_Program;
import java.util.Scanner;
public class Find_Sum_of_digits {
	
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the Number: ");
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		while(n>0) {
			int result=n%10;
			sum=sum+result;
			n=n/10;	
		
		
	}
		System.out.println("The Sum of Value is: "+sum);
	}

}
