package org.learningwithrakesh.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderTraversalLineByLine implements TreeTraversal {
	private Queue<Node> queue = new LinkedList<Node>();

	@Override
	public void print(Node node) {
		queue.add(node);
		// level of root node is 0
//		this.qOperation(0, 1);
		this.checkQSize();
	}
	
	private void qOperation(int level, int availabeData) {
		if (queue.isEmpty() || availabeData == 0)
			return;
		/**
		 * We count the nodes at current level. And for every node, we enqueue
		 * its children to queue. Use Total number of node at level i = 2^i;
		 */
		for (int i = totalNumberOfNodeAtLevel(level); i > 0; i--) {

			Node polledNode = queue.poll();
			if (polledNode != null) {
				--availabeData;
				System.out.print(polledNode.getData() + "->");
				if (polledNode.getLeft() != null)
					availabeData++;
				queue.add(polledNode.getLeft());
				if (polledNode.getRight() != null)
					availabeData++;
				queue.add(polledNode.getRight());
			} else {
				queue.add(null);
				queue.add(null);
			}

		}
		System.out.println("\n");
		this.qOperation(++level, availabeData);
	}
		
	private void checkQSize() {
		if (queue.isEmpty())
			return;
		// Get size of queue for the current level
		// Poll till the size after that print the new line
		for (int i = queue.size(); i > 0; i--) {
			Node polledNode = queue.poll();
			if (polledNode != null) {
				System.out.print(polledNode.getData() + "->");
				if (polledNode.getLeft() != null)
					queue.add(polledNode.getLeft());
				if (polledNode.getRight() != null)
					queue.add(polledNode.getRight());
			}

		}
		System.out.println("\n");
		this.checkQSize();
	}

	private int totalNumberOfNodeAtLevel(int i) {
		return (int) Math.pow(2, i);
	}

}
