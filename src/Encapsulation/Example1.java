package Encapsulation;

public class Example1 {
	
	int a=10;
	double d =205.05;
	
	public int getA() {
		return a;
	}
	public double getD() {
		return d;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setD(double d) {
		this.d = d;
	}
	public static void main(String[] args) {
		
		Example1 op= new Example1();
		
	op.setA(25);
	op.setD(120.25);
	System.out.println(op.getA());
	System.out.println(op.getD());

	}

}
