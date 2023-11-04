package Class_Program;

import java.util.Scanner;

public class Home_Notes {

	public static void main(String[] args) {
	
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		int arr[]= new int [n];          
		for( int i = 0; i<=n; i++) {
			arr [i]=s.nextInt();		
		}
		 for(int i=0; i<n-1; i++) {
	    	   for( int j=i+1; j<n;j++) {
	    		   if (arr [i]== arr [j])
	    			   System.out.print(arr [i]+" ");
	    		   
	    	   }
		}
		
	}
}

		
		
		
		/*String str="AbcDEg21%hoi";
		str=str.replaceAll("[^a-zA-Z]", ""); //^a
		System.out.println(str);
		

		
		
		
		
		
		
		
			/*String str="hello 123456";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>='a')
				if(str.charAt(i)<='z')
					               //  System.out.print(str.charAt(i));
			count++;
			
		}
		System.out.println(count);
		-
		}
		
		
		
	}*/


		
		
	

