package org.learningwithrakesh.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * The idea is to print last level first, then second last level, and so on.
 * Like Level order traversal, every level is printed from left to right.
 *
 * 
 */
public class ReverseLevelOrderTraversal implements TreeTraversal {

	Queue<Node> queue = new LinkedList<>();
	Stack<Node> stack = new Stack<>();

	@Override
	public void print(Node node) {
		if (node == null)
			return;
		queue.add(node);
		this.addToStack();
		this.printStack();
	}

	private void addToStack() {
		while (!queue.isEmpty()) {
			// dequeue
			Node polledNode = queue.poll();
			if (polledNode != null) {
				// pushed to popped node into stack;
				this.stack.push(polledNode);
				
				// enqueue right child
				if (polledNode.getRight() != null) {
					this.queue.add(polledNode.getRight());
				}
				// enqueue left child
				if (polledNode.getLeft() != null) {
					this.queue.add(polledNode.getLeft());
				}
			}
		}
	}
	/**
	 * Print the node value from stack
	 */
	private void printStack() {
		while (!stack.isEmpty()) {
			Node poppedNode = stack.pop();
			if (poppedNode != null) {
				System.out.print(poppedNode.getData() + "->");
			}
		}
	}
}
