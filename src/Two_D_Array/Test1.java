package Two_D_Array;

public class Test1 {
	
	
 public void dani() {
	int n=5878, sum=0;
	while(n>0) {
		int result=n%10;
		sum=sum *10+result;
		n=n/10;
	}
		System.out.println(sum);
	
}

 /*public void display() {
 
	int count=1, total=0;
	
	int n=5;
	while(n>=count) {
		total=total+count;  
		count++;
		System.out.println(total);
	}*/
	

public static void main(String[] args) {
	Test1 mn = new Test1();
	//mn.display();
	
	
	mn.dani();
	
}
}













