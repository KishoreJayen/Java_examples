package ClassandObject;

public class Class_Object {

		public int total() {
			int  total=1, count =1;
			while(count<=5) {
				total= total*count;
				count++;
			}
			return total;		
			
		}	
		public static void main(String[] args) {
			Class_Object mn =new Class_Object();
			
			
			int total=mn.total();
			System.out.println("The Sum is: "+ total);
			
		}

	}



/*public class Class3 {
	
	public int rev() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n , result, sum = 0;
	  	n=sc.nextInt();
	     while(n>0) {
			
			result=n%10;
			sum=sum*10+result;
			n=n/10;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Class3 mn = new Class3 ();
		int reverse= mn.rev();
		System.out.println("The Reverse Number is: "+reverse);
		
		
		
		
	}
	}*/
	
	
	
	
	

