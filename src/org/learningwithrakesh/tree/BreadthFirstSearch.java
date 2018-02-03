package org.learningwithrakesh.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch implements TreeTraversal {
	private Queue<Node> queue = new LinkedList<Node>();

	@Override
	public void print(Node node) {
		queue.add(node);
		this._queueOperation();
	}

	private void _queueOperation() {
		if (queue.isEmpty()) {
			return;
		}
		Node deleteNode = queue.poll();
		if (deleteNode != null) {
			System.out.print(deleteNode.getData() + "->");
			if (deleteNode.getLeft() != null)
				queue.add(deleteNode.getLeft());
			if (deleteNode.getRight() != null)
				queue.add(deleteNode.getRight());
		}
		this._queueOperation();
	}
}
