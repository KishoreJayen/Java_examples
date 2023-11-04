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
