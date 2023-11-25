package Inheritance;

public class Example2 {
	
	public int add() {
	int n=987;
	System.out.println("Before the Reverse Number is: "+n);
	int result, sum=0;
	while(n>0) {
		result=n%10;
		sum=sum*10+result;
		n=n/10;	
 
}
	System.out.println("After the Reverse Number is:"+ sum );
	return sum;
	}
	public static void main(String[] args) {
		
		Example2 mn= new Example2();
		mn.add();
		
		
	}
	}
