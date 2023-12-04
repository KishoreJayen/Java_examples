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
	
	 public void deleteStart() {
	        if (head == null){ // not possible to delete
		            return;
		        } 
	        else {
	        System.out.println("Deleted: " + head.data);
	      
	        head = head.next;
	    }}
	 public void deleteEnd() {
	        if (tail == null){ // not possible to delete
		            return;
		        } 
	        else {
		        System.out.println("Deleted: " + tail.data);
		      
		   
		    
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
	public void insertAtend(int val) {
		Node newNode = new Node(val);
		
		if(tail.next != null) {
			tail= newNode;
		}
		else {
			tail.next= newNode;
			tail= newNode;
			}
	}
	

	
 public static void main(String[] args) {
	 Linked mn = new  Linked();
	 
	 mn.addNodes(10);
	 mn.addNodes(20); 
	 mn.addNodes(30);
	 mn.addNodes(40);
	 mn.addNodes(50);
	 mn.addNodes(60);
	
		mn.display();
		System.out.println();
	
	 mn.deleteStart();
	 mn.display();
	 System.out.println();
	 
	 mn.deleteEnd();
	 mn.display();
		
	 
	 mn.insertatbeggining(5);
	 mn.insertAtend(80);
	 mn.insertatbeggining(2);
     mn.insertatbeggining(1);
	 mn.insertAtend(100);
	 
	 System.out.println();
	 mn.display();
	 System.out.println();
	 
	
	
	 System.out.println("After Reverse" );
	 mn.reverse();
	 mn.display();
	
	
	
}
 
	 
}

 