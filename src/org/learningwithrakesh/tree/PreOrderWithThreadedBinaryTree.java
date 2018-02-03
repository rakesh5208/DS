package org.learningwithrakesh.tree;

public class PreOrderWithThreadedBinaryTree implements TreeTraversal {
	@Override
	public void print(Node node) {
		this.makeThreading(node);
	}

	private void makeThreading(Node node) {
		Node current = node;
		while (current != null) {
			if (current.getLeft() == null) {
				System.out.print(current.getData()+"->");
				current = current.getRight();
			} else {
				Node inOrderPredecessor = this.getInOrderPredecessor(current);
				if (inOrderPredecessor.getRight() == null) {
					System.out.print(current.getData()+"->");
					inOrderPredecessor.setRight(current);
					current = current.getLeft();
				}else{
					inOrderPredecessor.setRight(null);
					current = current.getRight();
				}
			}
		}
	}

	private Node getInOrderPredecessor(Node node) {
		if (node != null) {
			Node pre = node.getLeft();
			while (pre.getRight() != null && pre.getRight() != node) {
				pre = pre.getRight();
			}
			return pre;
		}
		return null;
	}
}
