package tree;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> mn = new Stack<Integer>();
		mn.add(50);
		mn.push(10);
		mn.push(20);
		mn.push(30);
		mn.push(40);
	
	
		
		System.out.println(mn);
		
	      //mn.remove(2)   ;                                   //	mn.peek();
		
		int first_removed = mn.pop();
		System.out.println(first_removed);
		//int second_removes = mn.pop();
		//System.out.println(second_removes);
		
		mn.peek();
		System.out.println("New" + mn);
		System.out.println(mn.size());
		
		

		
		
		
		
			}

}
