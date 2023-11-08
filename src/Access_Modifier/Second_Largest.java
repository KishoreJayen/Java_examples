package Access_Modifier;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,5,2,100,264};
		int temp, size;             //n///**
		size=arr.length;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if (arr[i]>arr[j]) {//change the sign if sign is smaller means to get the smallest number
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					}
			}
			}
		System.out.println();
		System.out.println("The Second Largest Number is: "+arr [size-2]);
	}
}




/*
		int arr []= {8,7,9,10,22,36,54};
		
		int small= Integer.MAX_VALUE;
		int big= Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if (arr[i]<small && arr[j]>big) 
				small = arr[i];
			    big= arr[j];
			}
		}
		System.out.println("The Smallest number is: "+small);
		System.out.println("The Largest Number is: "+ big);
	}
}
 */    
            //The Smallest and Largest Number
