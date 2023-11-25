package BinaryTree;

public class MainTree {
	public static void main(String[] args) {
		
	/*	C
		  root.left= new TreeNode<Integer>(6);
		   root.right= new TreeNode<Integer>(5);
		   root.left.left= new TreeNode<Integer> (9);
		   root.left.right= new TreeNode<Integer>(2);
		   root.right.left= new TreeNode<Integer>(7);
		   root.right.right= new TreeNode<Integer>(1);
		   root.left.left.left= new TreeNode<Integer>(21);
		   root.left.left.right= new TreeNode<Integer>(19);
		   root.left.right.left= new TreeNode<Integer>(3);
		   root.left.right.right= new TreeNode<Integer>(16);
		   root.right.left.left= new TreeNode<Integer>(12);
		   root.right.left.right= new TreeNode<Integer>(13);*/
		
		
		TreeNode <Integer> root = new TreeNode <Integer>(3); 

        root.left = new TreeNode <Integer> (7);
        root.right= new TreeNode <Integer> (8);
        root.left.left= new TreeNode<Integer> (1);
        root.left.right= new TreeNode <Integer>(9);
        root.left.right.right= new TreeNode <Integer> (2);
		
		TreeTraversal mn = new TreeTraversal(root);
		
		System.out.println("Mirror Tree"+ mn.mirror(root));
		
		
		System.out.println("Inorder");
		mn.inorder(root);

		 System.out.println("PostOrder");
		 mn.postorder(root);
		 
		 System.out.println("Pre Order");
		 mn.preOrder(root);
		
		
		
		
	
		
	}

}
