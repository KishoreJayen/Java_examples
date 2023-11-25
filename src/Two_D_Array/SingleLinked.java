package Two_D_Array;

public class SingleLinked {
class Node{
	int data;
	Node next;
	
	Node(int val){
		this.data=val;
		this.next=null;
	}
}

	Node head = null;
	Node tail= null;


public void addNum (int val) {
	
	Node newNode = new Node(val);
	
	if(head ==null) {
		head= newNode;
		tail= newNode;
	}
	else {
		tail.next=newNode;
		tail= newNode;
	}
	
}

public void display() {
	
	Node current =head;
	
	while(current !=  null) {
		System.out.print(current.data + " ");
		current = current.next;
	}	
}

public void InsertatBeginning(int val ) {
	
	Node newNode = new Node(val);
	
	if (head == null) {
		head= newNode;
	}
	else {
		newNode.next= head;
		head= newNode;
	}
}

public static void main(String[] args) {
	
 SingleLinked mn = new  SingleLinked ();
 
 mn.addNum(10);
 mn.addNum(20);
 mn.addNum(30);
 mn.addNum(40);
 mn.InsertatBeginning(5);
	mn.display();
}
}
