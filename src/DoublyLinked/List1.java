package DoublyLinked;

import LinkedList.Linked;
import LinkedList.Linked.Node;

public class List1{
	
 public class Node{
	
	 int data;
	 Node pre;
	 Node next;
	 
	Node(int data){
		this.data=data;
		this.next= null;
		this.pre= null;
		}
 }
     Node head= null;
     Node tail= null;
     Node pre = null;
     
     public void addNodes(int data) {
    	 
    	 Node newNode= new Node (data);
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
 		Node temp = null;
 		while(current != null) {
 			System.out.print(current.data+ " ");
 			temp = current;
 			current = current.next;
 		}
 		System.out.print("Print in Reverse ");
 		while(temp != null) {
 			System.out.println(temp.data+ " ");
 			temp= temp.pre;
 		}
 	}
 	
public void insertatbeggining(int val) {
		
		Node newNode= new Node(val);
        newNode.next= head;
		if(head==null) {
			head = newNode;
		}
		else {
			head.pre=newNode;
			head= newNode;
		}
}
public void insertAtend (int val) {
	Node newNode= new Node (val);
	if(head == null) {
		head= newNode;
		tail= newNode;
	}
	else {
		tail.next= newNode;
		newNode.pre= tail;
		tail = newNode;
	
	}
}

 public static void main(String[] args) {
	List1 mn = new  List1();
	 
	 mn.addNodes(10);
	 mn.addNodes(20);
	 mn.insertatbeggining(300);
	

	 mn.addNodes(30);
	 mn.addNodes(40);
	 mn.addNodes(50);
	 
	
	 mn.display();
	 System.out.println();
	 
	 
	
	
	
     }
}
