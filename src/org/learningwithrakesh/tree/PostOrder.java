package org.learningwithrakesh.tree;

public class PostOrder implements TreeTraversal {
	@Override
	public void print(Node node) {
		if (node == null)
			return;
		print(node.getLeft());
		print(node.getRight());
		System.out.print(node.getData() + "->");

	}
}
