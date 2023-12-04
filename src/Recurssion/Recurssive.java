package Recurssion;

public class Recurssive {	
	
	public static void main(String[] args) {
		print(5);
	}
	
	static void print(int a) {
		if(a>0) {
			print (a-1);
			System.out.println(a);
		}
	}
}