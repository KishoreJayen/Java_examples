package Queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> que =  new LinkedList<Integer>();		
		que.offer(20);
		que.offer(40);
		que.offer(50);
		que.offer(60);
		
		
		System.out.println(que);

		
	  que.poll();// FIFO>>First in first out
	  que.remove(1);
	  System.out.println(que);
	System.out.println("Peek: "
			+que.peek());

	System.out.println("The Size of the array is: "+ que.size());
	
	System.out.println(que.remove(2));
	
	System.out.println(que);
	
	
	
	
	
	
	
	}

}
