package Access_Modifier;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
	System.out.println("Enter the Number: ");
	int n=s.nextInt();
	int p=0;
	for(int i=1; i<=n; i++) {
		if (n%i==0)                       ////**** Same as the Factor****////
			p++;                    
	}
		if(p==2)
			System.out.println(n + " It is Prime Number");
		else
			System.out.println(n + " It is not Prime Number");
		
	}
}
		
		
		
/*Scanner s= new Scanner (System.in);
int p=0;
for(int n=1; n<=999; n++) {
	for(int i=1; i<=n; i++) {
		if (n%i==0) 
			p++;
	}
	if(p==2) {
		System.out.println(n + " It is Prime Number");
}
p=0;
}
}
}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Enter the Number: ");
	Scanner s= new Scanner (System.in);
	int n=s.nextInt();
	int result=0;
	for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
			result=1;
		break;
	}
	}
	if (result==0 && n!=1)
		System.out.println(n + " It is Prime Number ");
	else if (n!=1)
		System.out.println(n + " It is not a Prime Number ");

	}

}*/
