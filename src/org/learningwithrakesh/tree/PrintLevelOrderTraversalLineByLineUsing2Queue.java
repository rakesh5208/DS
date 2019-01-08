package org.learningwithrakesh.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderTraversalLineByLineUsing2Queue implements TreeTraversal {
	private Queue<Node> q1 = new LinkedList<Node>();
	private Queue<Node> q2 = new LinkedList<Node>();

	@Override
	public void print(Node node) {
		if (node == null)
			return;
		q1.add(node);
		this.qOperation();
	}

	private void qOperation() {
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				Node polledNode = q1.poll();
				System.out.print(polledNode.getData() + "->");
				if (polledNode.getLeft() != null) {
					this.q2.add(polledNode.getLeft());
				}
				if (polledNode.getRight() != null) {
					this.q2.add(polledNode.getRight());
				}
			}
			System.out.println();
			while (!q2.isEmpty()) {
				Node polledNode = q2.poll();
				System.out.print(polledNode.getData() + "->");
				if (polledNode.getLeft() != null) {
					this.q1.add(polledNode.getLeft());
				}
				if (polledNode.getRight() != null) {
					this.q1.add(polledNode.getRight());
				}
			}
			System.out.println();
		}
	}
}
