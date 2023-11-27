package LinkedList;

import BinaryTree.TreeNode;
import Two_D_Array.Node;


public class Linked {
	
	public class Node{
		int data;
		Node next;
	
	Node (int val){
		this.data=val;
		this.next=null;
			
	}
	}

	Node head= null;
	Node tail = null;
	
	public  void addNodes(int val) {
		Node newNode= new Node (val);
		if(head == null) {
			head = newNode;
			tail= newNode;
			}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data+ " ");
			current = current.next;
		}
	}
	
	public void insertatbeggining(int val) {
		
		Node newNode = new Node(val);
		
		if(head== null) {
			head = newNode;
		}
		else {
			newNode.next=head;
			head= newNode;
		}
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current!=null) {
			next=current.next;
			current.next = prev; 
			prev = current;
			current = next;
		}
		
		head = prev;
	}
 public static void main(String[] args) {
	 Linked mn = new  Linked();
	 
	 mn.addNodes(10);
	 mn.addNodes(20);
	 mn.addNodes(30);
	 mn.addNodes(40);
	 mn.addNodes(50);
	 
	 mn.insertatbeggining(5);
	 mn.insertatbeggining(2);
	 
	 
	 mn.display();
	 System.out.println();
	 
	 
	
	 System.out.println("After Reverse" );
	 mn.reverse();
	 mn.display();
	
	 
}
	 
}

 