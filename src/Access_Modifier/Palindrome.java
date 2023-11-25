package Access_Modifier;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
          
		String [] arr= {"madam"};
		
		for(int i=0; i<arr.length; i++) {
			String temp= arr[i];
			String reverse;
			
			StringBuilder mn= new StringBuilder();
		    mn = mn.append(temp);
			reverse=mn.reverse().toString();	
			
			if(temp.equals(reverse)) {
				System.out.println("It is Plaindrome "+reverse);
			}
			else {
				System.out.println("Not a Palindrome: "+reverse);
			}
		}
		
		
		
		
	}	
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

/*String [] arr= {"madam", "ada", "teacher", "malayalam"};

   for(int i=0; i<arr.length; i++) {
	String temp= arr[i];
	String Reverse;
	
	StringBuilder sc= new StringBuilder();
	sc=sc.append(temp);
	Reverse= sc.reverse().toString();
	if (temp.equals(Reverse))
		System.out.println(arr[i]+ " "+ "It is Palindrome:"+ Reverse);
	else
		System.out.println(arr[i]+ " "+ "Not a Palindrome:" + Reverse);
}}}*/







/* Scanner s=new Scanner (System.in);
System.out.println("Enter the String: ");
String str1=s.next();


StringBuffer sc=new StringBuffer(str1);
if (str1.equalsIgnoreCase (sc.reverse().toString()))
		System.out.println("Palindrome: ");
else
	System.out.println("Not a Palindrome: ");



}
}*/
            // Palindrome Number & String /*******

		
		
		/*	Scanner s= new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int temp=n, result, sum=0;
		while(n>0) {
			result=n%10;
			sum=sum*10+result;
			n=n/10;
			}
		if (temp==sum)
			System.out.println("It is Palindrome: "+sum);
		else
			System.out.println("Not a Palindrome: "+sum);
	}

}*/

/*String str="madam";
int i=0,j=str.length()-1;

while(i<j) {
	if(str.charAt(i) != str.charAt(j)) { //   != || ==
		
		System.out.println("Not a Palindrome "+str);
		System.exit(0);
	}
	i++;
	j--;
}
System.out.println("Palindrome: "+str);
}
}*/





