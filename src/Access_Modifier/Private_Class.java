package Access_Modifier;

class base{
   private int a=10;
	private int b=20;
	void display() {
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	}
	public class Private_Class {
		private int x=10;
		private int y=20;
		
	public static void main(String[] args) {
		 base obj= new base();
		 Private_Class pc=new Private_Class();
		 
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		
		obj.display();
		System.out.println("x ="+pc.x);
		System.out.println("y ="+pc.y);
		
	}

}
