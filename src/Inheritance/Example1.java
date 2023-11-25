package Inheritance;

public class Example1 {

	String name;
	String address;
	String contatc;
	int tax;
	
	void name() {
		this.name="Kishore ,"
				+ " Hari";
	
		
	}
	private void address( ) {
		this.address="Mookambikai Appartment, Arulpuram, Tiruppur";
			
		
	}
	void Tax() {
		
	}
public static void main(String[] args) {
	
	Example1 dc= new Example1();
	dc.address();
	dc.name();


	System.out.println(dc.name);
	System.out.println(dc.address);
	
	
}
}
