package Class_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_the_number_array {

	public static void main(String[] args) {
		

		int arr[] = {50, 40, 30, 20, 10};
		
		int i=0, j=arr.length, temp;
		while(i<j) {
			
			temp= arr[i];
			arr[i]= arr[j];
			arr [j]= temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int arr[] = {50, 40, 30, 20, 10};
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(" "+arr[i]);
		}
		
		
				
	}
	
}   
		
		
		/*String str="";
		Scanner s=new Scanner (System.in);
      System.out.println("Enter the String: ");
       str=s.next();
     
      StringBuffer sc= new StringBuffer (str);
      sc.reverse();
      System.out.println("Reverse String is: "+str);
      System.out.println("After Reverse is: "+sc);
      }
      
    

	}*/

                             
