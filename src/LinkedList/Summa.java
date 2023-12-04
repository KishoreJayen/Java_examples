package LinkedList;

import DoublyLinked.List1.Node;

public class Summa {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data= data;
			
		}
	}
	public Node head;
	public Node tail;

 public void insertAtbeggining(int data) {
	 
	 Node newNode= new Node(data);
	 if (tail== null) {
		 newNode.next= newNode;
		 tail= newNode;
	 }
	 else {
		 newNode.next= tail.next;
		 tail.next= newNode;
		
	 }
	 
 }
 public void display() {
		if(tail == null) {
			return;
		}
		Node current = tail.next;
		do {
			System.out.println(current.data + " ");
			current = current.next;
		}
		while(current != tail.next);
		
		}
 
 public void insertATend (int data) {
	 Node newNode= new Node(data);
	 
	 if (tail== null) {
		newNode.next= newNode;
		tail= newNode;
	 }
	 else {
		 newNode.next= tail.next;
		tail.next=newNode;
		tail= newNode;
	 }
 }
	
 public static void main(String[] args) {
	Summa mn = new Summa();
	
	mn.insertAtbeggining(10);
	mn.insertAtbeggining(20);
	mn.insertAtbeggining(30);
	
	mn.insertATend(40);
	mn.insertATend(50);
	mn.display();
}
}
