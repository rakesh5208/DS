package org.learningwithrakesh.tree;

public class PreOrder implements TreeTraversal {
	@Override
	public void print(Node node) {
		if (node == null)
			return;
		System.out.print(node.getData() + "->");
		print(node.getLeft());
		print(node.getRight());
	}
}
