package Class_Object;

import java.util.Arrays;
import java.util.Scanner;

public class Home_Notes {
	
	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the Number: ");
	int n=s.nextInt();
	int arr[]= new int [n];
	System.out.println("Enter the Element: ");
	for (int i=0; i<=n; i++) {
	arr[i]=s.nextInt();
	}


	int k=s.nextInt();
	
	for(int i=0; i<n; i++) {
		if(arr[i]%k==0)
			System.out.print("1 ");
		else
			System.out.print("0 ");
	}
	
		
	}	
	}


		

		
		
	

		
/*Scanner s = new Scanner (System.in);
System.out.println("Enter the Number: ");
int n=s.nextInt();
for(int i=1; i<=n; i++) {
	if (n%i==0)
		System.out.print(i + " ");
	
}
*/                 //   ***** Factor of the given number//****

		
		
		
		
		
		
		
		
		
		
		/*int n= 345689754;
      		int count =0;
		while(n>0) {
			n=n/10;
			count ++;
			
			
		}
		System.out.println(count);
		
	}
}*/         // *******Count the Number: output is: 9*******
	
		
		
		
		
		
	
		
		
	/*	int n=7;
		int f=1, s=1, t;
		System.out.print(" "+f);
		System.out.print(" "+s);
		for( int i=3; i<=n; i++) {
			t=f+s;
			System.out.print(" "+t);
			f=s;
			s=t;
			
			///  ***** FIBONACCI SERIES***
		}
		
	}
	}*/















       /*int []a = {8,9,98,10,250};


int temp=a.length;
System.out.println(temp);

for(int i=0; i<1; i++) {
	System.out.print(Arrays.toString(a));

}
	
	}
}*/


	
	
	
	/*int count=1, total=1;
	while(count<=5) {
	 total= total*count;
	 count++;
		
	}
	
	System.out.println("The Sum is **" +total+ "**");
	
	
}	
	
}*/