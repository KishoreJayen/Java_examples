package Polymorph;

public class First extends Final {
		
    void hello(){
    
    	int s=10;
    	int v=40;
    	System.out.println(s+v);
	}
    
  private  void B() {
    	int n=987;
    	System.out.println("Before the Reverse Number is: "+n);
    	int result, sum=0;
    	while(n>0) {
    		result=n%10;
    		sum=sum*10+result;
    		n=n/10;
    	
    	}
    	
    	System.out.println("After the reverse number is:" +sum);
    }
    
    void Random() {
    	int n=5;
    	int total = 0, count=1;
    	while(count<=5) {
    		total=total+count;
    		count++;
    		
    	}
    	System.out.println("The Sum of the given Number is: " +total);	
    }
    
  public static void main(String[] args) {
	
	  First sc= new First();
	  sc.display();
	sc.hello();
	 // sc.display();
	  sc.B();
	  sc.Random();
	
	  
}
}
	
	


