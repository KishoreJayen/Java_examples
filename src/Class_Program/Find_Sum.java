package Class_Program;

import java.util.Scanner;

public class Find_Sum {

	public static void main(String[] args) {
		int input, sum=0;
		System.out.println("Enter the Natural Number: ");
		Scanner s=new Scanner (System.in);
		input =s.nextInt();
		for(int i=1; i<=input; i++) {
			sum=sum+input;
			
					
		}
	System.out.println("The Sum of Natural Number is: "+sum);
	

}
}