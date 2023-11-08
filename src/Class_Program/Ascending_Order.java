package Class_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_Order {

	public static void main(String[] args) {
		/* int [] arr = new int [] {68,70,8,64,2,4,10,25,1,14,5};
	     int temp;
	     for(int i=0; i<arr.length; i++)
	     {
	    	 for (int j=i+1; j<arr.length; j++) {
	    		if (arr[i] > arr[j]) {
	    			
	    			temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]= temp;
	    		 }
	    			 
	    		 }
	    			 }
	     for(int i=0; i<arr.length; i++) {
	      System.out.print(arr [i] +" ");
	    		 }
	     }
}*/
		
		
		int [] arr = new int [] {68,70,8,64,2,4,10,25,1,14};
		
		int temp;
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
			}
			System.out.println(" "+ Arrays.toString(arr));
		}
		
	}


