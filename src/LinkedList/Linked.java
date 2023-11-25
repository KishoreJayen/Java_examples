package LinkedList;

import Two_D_Array.Node;


public class Linked {
    Node head;

    class Node{	
    	int data;
    	Node next;
    	
    	Node(int val){	
    		this.data=val;
    		this.next=null;
    	}
    }  
    
    
    public TreeNode head = null;    
    public Node tail = null; 
    
 
     public void addNode(int val) {
    	 
    	 Node newNode = new Node(val);
    	 newNode.next=null;
    	 
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
		
		while(current.next!= null) {
			System.out.print(current.data + " ");
			current= current.next;
		}	
		System.out.println(current.data);
	}
	

	public void insertatbeginning(int val) {
		
		Node newNode = new Node(val);
		
		if(head==null) {
			head= newNode;
		}
		else {
			newNode.next=head;
			head= newNode;
		}	
	}

	
	public void insertatposition(int pos, int val) {
		if(pos==0) {
			insertatbeginning(val);
			return;
		}
		Node newNode = new Node(val);
		Node current = head;
		
	    for(int i=0; i<pos-1; i++) { //i<pos;
	    	current = current.next;	
	    }
	    newNode.next=current.next;
	    current.next= newNode;
	}
	
	
	
	public static void main(String[] args) {	
		Linked mn = new Linked();
	
		mn.insertatbeginning(9);
		mn.insertatbeginning(5);
	
		mn.insertatposition(0, 50);

		
		mn.display();
	}
}