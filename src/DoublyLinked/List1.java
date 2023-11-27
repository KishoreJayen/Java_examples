package DoublyLinked;

import LinkedList.Linked;
import LinkedList.Linked.Node;

public class List1{
	
 class Node{
	
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
 		
 		while(current != null) {
 			System.out.print(current.data+ " ");
 			current = current.next;
 		}
 	}
public void insertatbeggining(int val) {
		
		Node newNode = new Node(val);
		newNode.next= head;
		if(head== null) {	
			tail = newNode;
		}
		else {
			head.pre=newNode;
			head= newNode;
		}
	}

 public static void main(String[] args) {
	List1 mn = new  List1();
	 
	 mn.addNodes(10);
	 mn.addNodes(20);
	 mn.addNodes(30);
	 mn.addNodes(40);
	 mn.addNodes(50);
	 
	mn.insertatbeggining(300);
	 
	 mn.display();
 	
     }
}
