package org.learningwithrakesh.tree;

import java.util.Stack;

public class InOrderWithoutRecursion implements TreeTraversal {
	private Stack<Node> stack = new Stack<>();
	@Override
	public void print(Node node) {
		Node currentNode = node;
		while (currentNode != null || !stack.isEmpty()) {
			if (currentNode != null) {
				this.stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				Node poppedNode = this.stack.pop();
				System.out.print(poppedNode.getData() + "->");
				currentNode = poppedNode.getRight();
			}
		}

	}
}
