import java.util.Scanner;

public class Relation_Operator {
	
	public static void main(String[] args) {
	   
		int decimal=0, i=0;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Binary Number: ");
		int n= s.nextInt();                  // Covert Binary to decimal//**
		while (n>0) {
			int result=n%10;
			decimal= (int) (decimal+result*Math.pow(2, i));
			n=n/10;
			i++;
			System.out.print(" "+decimal );
		}
		
		
	}	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int a =10;
		
		int b =20;
		System.out.println("a=b="+(a==b));
		System.out.println("a!=b="+(a!=b));
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("b>=a="+(b>=a));
		System.out.println("b>=a="+(b<=a));
	}
} */
