package Access_Modifier;

import java.util.Scanner;

public class Find_Occurance {


		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int count =0;
		int arr[]= new int [n];
		
		 for (int i=0; i<n; i++) 
		{
			arr[i]=s.nextInt();
			System.out.println("Enter the elements of which you want to "+ "count numbers of occurance:");
			int search=s.nextInt();
			
			for(int i=0; i<n;i++) {
				if (arr[i]== search)
					count++;
			}
			if(count >0)
				System.out.println("Number of occurance of the elements: "+count);
			else
				System.out.println("Number of occurance of the elements: "+count);
		}
		
}	
		}
		

		


