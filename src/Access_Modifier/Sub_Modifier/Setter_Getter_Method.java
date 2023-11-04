package Access_Modifier.Sub_Modifier;

public class Setter_Getter_Method {
	int emp_id;
	String emp_name;
	double Salary;
	
	void setEmp() {
		emp_id=1;
		emp_name="Thala";
		Salary=50000;
	}
void getEmp() {
	System.out.println("Employee id:"+emp_id);
	System.out.println("Employee Name: "+emp_name);
	System.out.println("Salary = "+Salary);
}
	
	public static void main(String[] args) {
		Setter_Getter_Method ob=new Setter_Getter_Method();
		System.out.println("State emp_id: "+ob.emp_id );
		System.out.println("Getter Method Calling");
		ob.getEmp();
		System.out.println("Setter Method Calling");
		ob.setEmp();
		System.out.println("Calling get method after set method: ");
		ob.getEmp();
	}
		

	}


