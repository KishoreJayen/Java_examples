package Access_Modifier;

import java.util.ArrayList;

public class Rough {

	public static void main(String[] args) {
		int arr[]= {87,54,1,2,99,989,25};
		
		System.out.println(min(arr));
		
	}
	 
	static int min(int arr[]) {
		int temp = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if (arr[i] > temp) {
				temp= arr[i];	
			}			
		}
		return  temp;
		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	
	int cpunt=0;
	
	for(int i=11; i<10; i--) {
		cpunt++;
	}
	System.out.println(cpunt);
	}
	}*/
		
		
		
		
		
		
		
		
		/*number(1);
	
	}
	
	private static void number (int i)
	{	
		System.out.println(i);
		i++;
		number(i);
		
		
		
	}
}*/
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		/*
	int []a = {2,5,1,7,3,8,4,9,5};
	
		recursive(a,0);
		

	}
	private static void recursive (int [] a, int i) {
		if (a.length ==i) {
			return;
		}
		else {
			System.out.println(i+": "+ a[i]);
			recursive (a, i+1);
			
		}
	}

}*/









/*int arr[]= {65,1,10,1,5,65,6,2,14,2};
	  ArrayList
	   
	
	}
}*/











/*for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++ ) {
			if(arr[i]== arr[j])
				System.out.print(arr[i]
						+" ");
		}
	}
	}
}*/

		
