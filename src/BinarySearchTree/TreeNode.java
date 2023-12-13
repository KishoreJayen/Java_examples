package BinarySearchTree;

import BinarySearchTree.MainTree.Node;

public class TreeNode {
	public static void main(String[] args) {
		
		MainTree mc = new MainTree (60);
		
		mc.insert(30);
		mc.insert(50);
		mc.insert(10);
		mc.insert(70);
		mc.insert(20);
		mc.insert(80);
		mc.insert(40);
		
		
	

		mc.search(mc.root, 20);
		
		 System.out.println("The maximum number is: "+mc.FindMaximun(mc.root));
		System.out.println("The miminum number is: "+mc.FindMinimun(mc.root));
		
		System.out.println(mc.height(mc.root));
		System.out.println(mc.diameter(mc.root));
		
		 
		//System.out.println(mc.lca(mc.root));
	}
}


















