package BinarySearchTree;

import tree.Node;

public class MainTree {

	class Node{
	   int key;
		Node left;
          Node right;
		
		public Node(int data){
			this.key= data;
			left= right= null;
		}
	}
	
public Node root;

public MainTree(int data) {
	root = new Node (data) ;
}

public void insert ( int data) {

	insert (root, data);
}

public Node insert (Node root, int data) {
	
	if(root == null) 
		return new Node (data);
		
		if(data <root.key) 
			root.left=  insert (root.left, data);
		//if(data > root.key)
		else
			root.right= insert (root.right, data);
		
		return root;
}
   
   public void inorder(Node root) {
	    if(root != null) {    
	             inorder(root.left);
			     System.out.print(root.key + " ");
			     inorder(root.right);    	       
		}
	}
   

   public Node search(Node root, int data) {
	   
	   if(root == null) {
		   System.out.println("Element not found");
		   return root ;
	   }
	   if(data== root.key) {
		   System.out.println("The given is found");
	   return root;
	   }
	   else if(data < root.key) {
		   search (root.left, data);
	   }
	   else {
		  search (root.right, data);
	   }
	return root;
		
   }
   
   public int FindMinimun (Node root) {
	   
	   if(root== null) {
		   System.out.println("The value is not found");
	   }
	   else if (root.left== null) {
		 return  root.key;
	   }
		 return FindMinimun(root.left);
	   
   }
   
   
 public int FindMaximun (Node root) {
	   
	   if(root== null) {
		   System.out.println("The value is not found");
	   }
	   else if (root.right== null) {
		 return  root.key;
	   }
		 return FindMaximun(root.right); 
   }
 
  
 /*public int height( Node root) {
	 if (root == null) {
		 return 0;
	 }
	int leftheight = height(root.left);
	int rightheight = height(root.right);
	
	if(leftheight < rightheight) {
		return
				leftheight = leftheight +1;
	}else {
		return
				rightheight = rightheight+1;
	}*/

		
	 
 }

   
   
   
   
   
   
   
   
   
   
   
  /* public Node delete(Node root, int data) {
	   root = delete(root,data); 
	   
	   if (root==null)
		   return root;
	   
	   if (data  < root.key) {
		root.left=   delete (root.left, data);
	   }
	   else if(data > root.key){
	  root.right= delete (root.right, data);}
	   
	   else {
		   if(root.right==null)
			   return root.left;
		   if(root.left==null)
			   return root.right;
	   }
	return root;
	  
   }*/
      
   }
	

