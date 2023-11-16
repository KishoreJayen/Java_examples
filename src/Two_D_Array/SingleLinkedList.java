package Two_D_Array;

import java.util.LinkedList;



class Node {
	int data;
	Node next;
	

  Node(int data){
	this.data= data;
	this.next=null;
}


public Node head= null;
public Node tail= null;

public void addNode (int data) {
	
		Node newNode = new Node (data);
		
		if (head ==null) {
			head= newNode;
			tail=newNode;
			}
		else {
			tail.next= newNode;
			tail= newNode;
		}
	
}
public void display() {
	
	Node current= head;
	if (head== null) {
		System.out.println("The Given Value is Empty: ");
		return;
	}
	System.out.println("Nodes of singly linked list: ");    
    while(current != null) {    
        
        System.out.print(current.data + " ");    
        current = current.next;    
    }    
    System.out.println();    
}    
	}

public class SingleLinkedList {

	public static void main(String[] args) {
	  
		Node mn = new Node();
		
		
		
		
		
		
		
	
		
		
	}

}
