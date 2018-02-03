package org.learningwithrakesh.tree;

public class InOrder implements TreeTraversal {

	@Override
	public void print(Node node) {
		if (node == null)
			return;
		print(node.getLeft());
		System.out.print(node.getData() + "->");
		print(node.getRight());
	}

}
