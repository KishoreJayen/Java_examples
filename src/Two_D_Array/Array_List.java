package Two_D_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		ArrayList <Integer>  list= new ArrayList<>();
		list.add(20);  //0
		list.add(30);  //1
		list.add(40);  //2
		list.add(50);  //3
		
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.add(1,80);  //1- refers to index 1 index 80 value
		System.out.println(list);
		
		System.out.println(list.get(2));// get the value from the array
		
		
		list.set(0, 100);
		System.out.println(list);
		
		int a=list.size();
		System.out.println(a);// Size of the element.
		
		list.clear();
		System.out.println(list);
		
		

	}

}









/*Scanner sc= new Scanner (System.in);
		int a;
		for(int i=0; i<=6; i++) {
			a=sc.nextInt();
			list.add(a);
		}
		System.out.print(list);
	
	}
}*/
