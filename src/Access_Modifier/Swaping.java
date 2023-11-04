package Access_Modifier;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
	
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the String: ");
		String str1=s.next();
		int len= str1.length();
		char ch[]= str1.toCharArray();
	    if (len%2==0) {
	    for(int i=1; i<len; i+=2) 
		System.out.print(ch[i]+""+ch[i-1]);/// String 
	    }
	    else {
	    	for(int i=1; i<len-1; i+=2)
	    		System.out.print(ch[i]+""+ch[i-1]);
	    	System.out.print(ch[len-1]);
	            		
	    }
		
		
		}
	
	}




   /*  Scanner s= new Scanner (System.in);
     System.out.println("Enter the String: ");
     int n=s.nextInt();
     int arr[]= new int [n];
     for(int i=0; i<n; i++)
    	 arr[i]=s.nextInt();
     if (n%2==0) {
    for(int i=1; i<n; i+=2) 
        System.out.print(arr[i]+""+arr[i-1]);/// String 
   }
     else  {
	for(int i=1; i<n-1; i+=2)
		System.out.print(arr[i]+""+arr[i-1]);
	System.out.print(arr[n-1]);
        		
}


}

}*/











