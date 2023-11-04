package Access_Modifier;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	/*	Scanner s=new Scanner (System.in);
		System.out.println("Enter the String: ");
		String str1=s.next();
		StringBuffer sc=new StringBuffer(str1);
		if (str1.equalsIgnoreCase (sc.reverse().toString()))
				System.out.println("Palindrome: ");
		else
			System.out.println("Not a Palindrome: ");
		
		
		
	}
}*/
		            // Palindrome Number & String /*******
		
		
		
	
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int temp=n, result, sum=0;
		while(n>0) {
			result=n%10;
			sum=sum*10+result;
			n=n/10;
			}
		if (temp==sum)
			System.out.println("It is Palindrome: "+sum);
		else
			System.out.println("Not a Palindrome: "+sum);
	}

}
