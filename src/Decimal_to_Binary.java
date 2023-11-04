import java.util.Scanner;


//Program to convert decimal number into binary number.

    public class Decimal_to_Binary {
    	public static void decimal2Binary (int n) { //pass the parameter
    		int [] binaryNum= new int[1000];
	    int i=0;
	    while (n>0) {
	    	binaryNum [i] =n%2;
	    	n=n/2;
	    	i++;
	     }
	    for (int j=i-1; j>=0; j--) 
	    	System.out.print(binaryNum [j] + " ");
    	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Decimal No: "); 
		int n=s.nextInt();
		System.out.println("Decimal Number is: "+n);
		System.out.print("Binary Number is: ");
		decimal2Binary(n);

	}

}
    
    
    
    
    
    
    
    
    
    
    
    /*int i=0;
		int [] Binary= new int [1000];
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=s.nextInt();
		
		while (n>0) {
			Binary [i]= n%2;
			n=n/2;
			i++;
			
		}
		for (int j=i-1; j>=0; j--) {
			System.out.print(Binary [j]+ " ");
		}
		
		
		
	}
}*/
		
