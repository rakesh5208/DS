package org.learningwithrakesh.tree;

/**
 * 
 * As per Wikipedia, A Threaded Binary Tree as follows: A binary tree is
 * threaded by making all right child pointers that would normally be null (if
 * there is no right child of that node) point to the in-order successor of the
 * node (if exists),and all left child pointers that would normally be null (if
 * there is no left child of that node) points to the in-order predecessor of
 * the node.
 *
 */

public class InOrderTraversalWithThreadedBinaryTree implements TreeTraversal {

	@Override
	public void print(Node node) {
		this.makeBinaryTreeAsThreadedBinaryTree(node);
	}

	private void makeBinaryTreeAsThreadedBinaryTree(Node node) {
		Node current = node;
		while (current != null) {
			if (current.getLeft() == null) {
				System.out.print(current.getData() + "->");
				current = current.getRight();
			} else {
				Node inOrderPredecessor = this.findInOrderPredeccessorOfNode(current);
				// In-order predecessor node doesn't have right child
				// point current node as successor node this predecessor node
				// Using Right threading
				if (inOrderPredecessor.getRight() == null) {
					inOrderPredecessor.setRight(current);
					current = current.getLeft();
				} else {
					// means either predecessor node is same as current node
					// or it is null
					// now revert the previous made link and print the data
					inOrderPredecessor.setRight(null);
					System.out.print(current.getData() + "->");
					current = current.getRight();
				}

			}
		}
	}

	private Node findInOrderPredeccessorOfNode(Node current) {
		if (current != null) {
			Node pre = current.getLeft();
			while (pre.getRight() != null && pre.getRight() != current) {
				pre = pre.getRight();
			}
			return pre;
		}
		return null;

	}
}
