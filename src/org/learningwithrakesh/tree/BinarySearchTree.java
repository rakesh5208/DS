package org.learningwithrakesh.tree;

public class BinarySearchTree {
	private static Node root = null;

	public void add(Integer data) {
		root = this._add(root, data);

	}

	private Node _add(Node node, Integer data) {
		if (node == null) {
			node = new Node(data);
			return node;
		} else if (node.getData() >= data) {
			node.setLeft(this._add(node.getLeft(), data));
		} else {
			node.setRight(this._add(node.getRight(), data));
		}
		return node;
	}

	public void print(TreeTraversal treeTraversal) {
		System.out.println("**************"+treeTraversal.getClass().getSimpleName() + "**********");
		treeTraversal.print(root);
		System.out.println("NULL");

	}
}
