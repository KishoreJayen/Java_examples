
import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,9,14,16,18,29,98};
		int key= 98;
		int result = binarySearch(arr, key);
		System.out.println(result);
	
	}
	
	static int binarySearch(int arr[], int key) {
		
		int first=0;
		int last= arr.length-1;
		
		while(first <= last) {
			int mid= (first+last) /2;
			
			if (arr[mid] < key) {
				first= mid+1;
			}
			else if(arr[mid]> key) {
				last=mid-1;
			}
			else {
				return mid;
			}
		}
		return first ; 
		// first = celing number ** last = floor number;
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 /*  int arr[]= {10,40,60,80,100,120,150};
		
        Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Key: ");
		int key = sc.nextInt();
		                                                  //******Binary Search//******
				int first=0, last= arr.length-1;
				int temp=0;

		while(first <= last) {
			int mid =(first+last)/2;
			if(arr[mid]==key) {
				System.out.println("Element is found: "+ mid);
			    temp=1;
			    break;
			    }
			else if(arr[mid]< key) {
				first= mid+1;
			}
			else {
				last = mid-1;
			}
		}
		if(temp==0) {
			System.out.println("Element is not found");
		}
		
	}	
	}*/
		
		
		
		
		/*int arr[]= {21,25,36,98,74,125,1,223};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Key: ");
		int key = sc.nextInt();
		
		int temp=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Given Element is found: "+ key);
				temp=1;
				break;
			}	
		}
		if(temp==0) 
			System.out.println("Not found");
		}
	
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		fum(10, 20);
		fum("Kishore Jayen");
		fum(102.35);
       
	}
	static void fum(int a, int b) {
		return;
	}
	
	static void fum(String name) {
		System.out.println(name);
		
	}
	static void fum(double b) {
		System.out.println(b);
	}
}*/

	
	
	
	
	
	
	
	
	
	
	/*int x=11;
	
	while (x<=5) {
		System.out.println("While x = " +x);
		x++;
	}
	do {
		System.out.println("do x = " +x);
		x++;
		
	}
	while(x<=10);
		
	for(int y=1; y<=10;y++) {
		System.out.println("for y = " +y);
	}
	
	}

	}*/


