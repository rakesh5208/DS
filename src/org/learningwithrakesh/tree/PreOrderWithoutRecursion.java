package org.learningwithrakesh.tree;

import java.util.Stack;

public class PreOrderWithoutRecursion implements TreeTraversal {
	Stack<Node> stack = new Stack<>();

	@Override
	public void print(Node node) {
		this.stack.push(node);
		while (!stack.isEmpty()) {
			Node poppedNode = stack.pop();
			if (poppedNode != null) {
				System.out.print(poppedNode.getData() + "->");
				if (poppedNode.getRight() != null)
					this.stack.push(poppedNode.getRight());
				if (poppedNode.getLeft() != null)
					this.stack.push(poppedNode.getLeft());
			}
		}

	}

}
