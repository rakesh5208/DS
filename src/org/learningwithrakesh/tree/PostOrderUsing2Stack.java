package org.learningwithrakesh.tree;

import java.util.Stack;

public class PostOrderUsing2Stack implements TreeTraversal {
	// Stack will hold the final data to be printed
	Stack<Node> finalStack = new Stack<>();
	// stack will hold the child data
	Stack<Node> childStack = new Stack<>();

	@Override
	public void print(Node node) {
		// push the first/ root node to child stack
		childStack.push(node);
		this.stackOperation();
		this.printFinalStack();
	}

	/**
	 * Pop from the finalStack till it is empty and print the popped node
	 */
	private void printFinalStack() {
		while (!finalStack.isEmpty()) {
			Node poppedNode = finalStack.pop();
			if (poppedNode != null) {
				System.out.print(poppedNode.getData() + "->");
			}
		}
	}

	/**
	 * Pop from the child stack and push the node to the final stack and push
	 * the left-child and right-child to the child stack
	 */
	private void stackOperation() {
		while (!childStack.isEmpty()) {
			Node poppedNode = childStack.pop();
			if (poppedNode != null) {
				this.finalStack.push(poppedNode);
				if (poppedNode.getLeft() != null)
					this.childStack.push(poppedNode.getLeft());
				if (poppedNode.getRight() != null)
					this.childStack.push(poppedNode.getRight());
			}
		}
	}
}
