package Class_Object;

import java.util.Scanner;

public class Duplicate_Elements_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]= new int [n];
		for (int i=1; i<n;i++) {
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
