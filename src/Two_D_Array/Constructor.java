package Two_D_Array;

public class Constructor {
	
	String name;
	int age;
	String ph;

	Constructor(){
		name="Kishore";
		age=22;
		System.out.println(name);
		System.out.println(age);
	}
	 Constructor(String ph){
		System.out.println(ph);
		
		
	}
		Constructor(String name, int age){
			
		System.out.println(name);
		System.out.println(age);
			
		}
		
	public static void main(String[] args) {
		Constructor mn= new Constructor("AdbulRazaq", 20);
     
       new Constructor("6565626565656562");
		
		//System.out.println(mn.name);
		 //System.out.println(mn.age );
		 
	}
}
   