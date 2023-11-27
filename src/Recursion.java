
public class Recursion {
	
	 public static int sum(int n, int total) {
		
		 total= total *n;
		 n++;
		 if(n<=5) 
			return sum(n, total);
		 else 
			return total;
		 }	 
	 
	
	public static void main(String[] args) {
		int n=1, total=1;
		sum(n, total);
		int result= sum(n, total);
		System.out.println(result);
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public static void sum(int a){
    	
  
    	
    	
    	if(a==0) {
    		return 0;
    	}
    	else {
    		return a + sum (a-1);
    	}
      }
	

	
	public static void main(String[] args) {
		int a= 5;
		int result= sum(a);
		System.out.println("The Sum of 5 Numbers is: "+ result);		
		
	}
}*/

