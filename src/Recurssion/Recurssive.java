package Recurssion;

public class Recurssive {	
	 static int sum=0;
	
	static int rev(int n) {
		
		if(n == 0) {
			return 1 ; 
		}
		int result= n%10;
		sum=sum*10+result;
		return (n/10);	
	}
	
	public static void main(String[] args) {
		
		rev(12345);
		System.out.println(sum);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
        int n = 7;
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}*/