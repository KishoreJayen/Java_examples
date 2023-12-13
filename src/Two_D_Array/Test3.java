package Two_D_Array;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test1 mn  = new Test1();
		
		mn.insert(10);
		mn.insert(20);
		mn.insert(30);
		mn.insert(40);
		mn.insert(50);
		
		mn.display();
		System.out.println();
		
	
		
		
		
		
		mn.insertAtPos(0, 4);
		mn.insertAtPos(3, 12);
		mn.insertAtPos(5, 37);
		
		
			mn.display();
			System.out.println();
			
			
			mn.reverse();
			System.out.println("Reverse Number----");
			mn.display();
			System.out.println();

		System.out.println("------");
		
		mn.deleteAtPos(2);
		mn.deleteAtPos(3);
		mn.display();
		
		
		
		
		System.out.println("----------");
		mn.deleteBegin();
		
		mn.display();
		
		System.out.println("-----------");
		mn.deleteAtEnd();
		mn.display();
	}

	
}
	


	
























