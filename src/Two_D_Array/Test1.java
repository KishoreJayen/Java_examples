package Two_D_Array;

public class Test1 {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data= data;
			this.next= null;
		}
	}
	
	 Node head = null;
	 Node tail = null;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head= newNode;
			tail= newNode;
		}
		else {
			tail.next= newNode;
			tail= newNode;
		}
		
	}
	
	public void display() {
		Node current =  head;
		
		while(current != null) {
			
			System.out.print (current.data + " ");
            current = current.next;			

			
		}
	}
	
	
	public void reverse() {
		
		Node tail = null;
		Node current = head;
		Node next = head.next;
	
	while(current != null) {
		next = current.next;
		current.next= tail;
		tail= current;
		current = next;
		head= tail;	
	}			
	}
	
	public void insertAtPos(int pos, int data) {
		Node newNode= new Node(data);
		
		Node current = head;
		for(int i=1; i<= pos; i++) {
			current = current.next;
			
		}
		newNode.next= current.next;
		 current.next= newNode;	
	}
	
	public void deleteAtPos(int pos) {
		
	
	Node current = head;
	Node newNode = null;
	
	
	for(int i=1;i<=pos;i++) {
		newNode = current; 
		current= current.next;
	}
	
	newNode.next = current.next; 
}
	
	public void deleteBegin() {
		if(head == null) {
			return ;
		}
		else {
			System.out.println("Delete: "+ head.data);
			head=  head.next;
		}
		
	}

	public void deleteAtEnd() {
		 if(head == null) {       
	            return;  
	        }  
	        else {  
	             
	            if(head != tail ) {  
	                Node current = head;  
	                while(current.next != tail) {  
	                    current = current.next;  
	                tail = current;  
	                tail.next = null; 
	                head = tail = null;  
	            }  
	        }
	}
}}









