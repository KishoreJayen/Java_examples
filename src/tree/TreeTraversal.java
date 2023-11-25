package tree;

public class TreeTraversal{
	Node<Integer> root;
		public TreeTraversal(Node<Integer> root) {
			this.root=root;
		}
		public void inorder() {
			inorder(root);
		}

public void inorder(Node<Integer> currentRoot) {
    if(currentRoot != null) {    
             inorder(currentRoot.left);
		     System.out.println(currentRoot.data);
		     inorder(currentRoot.right);    	       
	}
}
    public void preorder() {
		preorder(root);
	}

public void preorder(Node<Integer> currentRoot) {
if(currentRoot != null) {    
         System.out.println(currentRoot.data);
         preorder(currentRoot.left);
	     preorder(currentRoot.right);    	       
}
}
public void postorder() {
	postorder(root);
}

public void postorder(Node<Integer> currentRoot) {
if(currentRoot != null) {    
     postorder(currentRoot.left);
     System.out.println(currentRoot.data);
     postorder(currentRoot.right);    	       
}

}
}
