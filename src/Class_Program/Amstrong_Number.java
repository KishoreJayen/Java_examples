package Class_Program;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
	/*	int n=153, result, sum=0;
		int orginal=n;
		while(n>0) {
			result=n%10;
			result= (int) Math.pow(result, 3);
			sum=sum+result;
			n=n/10;
		}
         if(sum==orginal)
        	 System.out.println(" it is armstrong "+sum);
         else
        	 System.out.println(" It is Not a Armstrong "+sum);
	}

}*/

Scanner s= new Scanner (System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt();
int orginal=n;
int result, sum=0;
while(n>0) {
	  result=n%10;
	  result=(int) Math.pow(result, 3);
	  sum=sum+result;
	  n=n/10;
	   }
if(sum==orginal)
	  System.out.println("It is Armstrong: "+sum);
else
	  System.out.println("It is Not a Armstrong: "+sum);
}
}



/*Scanner s= new Scanner (System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt();
int sum=0, result, digit=1;

while (n>0) {                 //////////   SPY NUMBER    ////*******
	result=n%10;
	sum=sum+result;
	digit =digit*result;
	n=n/10;
	
}
if (digit==sum) {
	System.out.println("It is Spy: ");
}
	else {
		System.out.println("It is Not a Spy :  "+sum);
}
	

}
}*/
