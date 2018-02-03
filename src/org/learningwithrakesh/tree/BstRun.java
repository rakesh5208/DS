package org.learningwithrakesh.tree;

public class BstRun {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int []arr = {10,8,5,4,2,7,13,12,14,11,6,3,1,9};
		
//		int []arr = {10};
//		int []arr = {25,15,50,10,22,35,70,4,12,18,24,31,44,66,90};
//		int []arr = {20,8,30,4,12,10,14,3,7,25,35,23,22};
		/**
				         10
				       /    \
				      8      13
				     / \	/  \   
				    5   9   12  14
				   /\      /     
				  4  7    11
				 /  /    
				2  6   
			   / \
			  1   3
		 */
		for(int i=0;i<arr.length;i++){
			bst.add(arr[i]);
		}
		bst.print(new InOrder());
		bst.print(new InOrderWithoutRecursion());
		bst.print(new InOrderTraversalWithThreadedBinaryTree());
		bst.print(new PreOrder());
		bst.print(new PreOrderWithoutRecursion());
		bst.print(new PostOrder());
		bst.print(new BreadthFirstSearch());
		
		bst.print(new PrintLevelOrderTraversalLineByLine());
		
		
		
		
	}
}
