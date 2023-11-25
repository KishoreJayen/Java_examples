package BinaryTree;

public class TreeTraversal {
	
	TreeNode <Integer> root;
	
	public TreeTraversal(TreeNode <Integer> root) {
		
		this.root= root;
	}
	
	public void inorder(TreeNode <Integer> currentRoot) {
		
		if(currentRoot != null) {
			
			inorder(currentRoot.left);
			System.out.println(currentRoot.data);
			inorder(currentRoot.right);
			
		}	
	}
	
	public void preOrder(TreeNode <Integer> currentRoot){
		
    if(currentRoot != null) {
    	
    	System.out.println(currentRoot.data);
    	preOrder(currentRoot.left);
    	preOrder(currentRoot.right);
    	 	
    }
					}
	
	
	public void postorder(TreeNode <Integer> currentRoot) {
		
		if(currentRoot != null) {
			
			postorder(currentRoot.left);
			postorder(currentRoot.right);
			System.out.println(currentRoot.data);
		}
	}
	
	public TreeNode<Integer> mirror (TreeNode <Integer> currentRoot) {
		
		if(currentRoot == null) {
			return currentRoot;
		}
		else {
			TreeNode <Integer> Left= mirror(currentRoot.left);
			TreeNode <Integer> Right= mirror(currentRoot.right);
		
		currentRoot.left= Right;
		currentRoot.right= Left;
		return currentRoot;
		}
	}
	}
