package tree;
public class TreeStructure {
           
	
     public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(8);
		   root.left= new Node<Integer>(6);
		   root.right= new Node<Integer>(5);
		   root.left.left= new Node<Integer> (9);
		   root.left.right= new Node<Integer>(2);
		   root.right.left= new Node<Integer>(7);
		   root.right.right= new Node<Integer>(11);
		   root.left.left.left= new Node<Integer>(21);
		   root.left.left.right= new Node<Integer>(19);
		   root.left.right.left= new Node<Integer>(3);
		   root.left.right.right= new Node<Integer>(16);
		   root.right.left.left= new Node<Integer>(12);
		   root.right.left.right= new Node<Integer>(13);
		   
		   
		   TreeTraversal traversal=new TreeTraversal(root);
		   System.out.print("Search = ");
		   traversal.search(root);
		   
     }
}
		   
		   
		   
		   
		   
		  /* TreeTraversal traversal=new TreeTraversal(root);
		   System.out.println("Inorder");
 		   traversal.inorder();
 		  System.out.println("Preorder");
 		  traversal.preorder();
 		  System.out.println("Postorder");
 		  traversal.postorder();
 		  
 		   
 		  
	}

}*/
	
		
	
			
			
		
		
		
	
		
	
		
		
	