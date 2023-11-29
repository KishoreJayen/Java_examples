package Recurssion;

public class Recurssive {	
	
	
	
	public static int sum (int n, int result, int total) {
		
		if (n==0) {
			return 0;
		}
		else {
			n=n/10;
			
		int result1= n%10;
			
			n=n/10;
			
		return  result1 * (10* (total(result1(n)) -1 )) + n;
		
		}
	}
	private static int total(Object result1) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static Object result1(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		int n=9876; 
		int result = 0, total=0;
		int reverse= sum (n, result, total);
		System.out.println(reverse);
	}
}