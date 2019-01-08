package org.learningwithrakesh.linklist.single;

public class SingleLinkList {
	private Node head = null;

	/**
	 * Node to be insert at beginning of the linklist
	 * 
	 * @param data: new node data
	 */
	public void insertAtBeginning(Integer data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.head = newNode;
			return;
		} else {
			newNode.setNext(head);
			this.head = newNode;
		}
	}

	/**
	 * Node to be inserted at end of the linklist
	 * 
	 * @param data: new node data
	 */
	public void insertAtEnd(Integer data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	/**
	 * get the size of the linklist
	 * 
	 * @return
	 */
	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		return count;
	}

	/**
	 * Insert the element at the given position, Position is 0 based indexing
	 * 
	 * @param      position: to be inserted at
	 * @param data : new node data
	 * @throws LinkListException
	 */
	public void insertAt(int position, int data) throws LinkListException {
		if (position < 0) {
			throw new LinkListException("Position must be greater than or equal to zero");
		} else if (position > this.size()) {
			throw new LinkListException("Position must be less than or equal to linklist size");
		} else {
			Node newNode = new Node(data);
			if (position == 0) {
				newNode.setNext(head);
				head = newNode;
			} else {
				int i = 0;
				Node tempNode = head;
				Node prevNode = null;
				while (i < position && tempNode != null) {
					prevNode = tempNode;
					tempNode = tempNode.getNext();
					i++;
				}
				prevNode.setNext(newNode);
				newNode.setNext(tempNode);
			}
		}
	}

	public void deleteFirstNode() {
		if (head != null) {
			Node tempNode = head;
			head = head.getNext();
			tempNode.setNext(null);
			tempNode = null;
		}
	}

	public void deleteLastNode() {
		if (head != null && head.getNext() != null) {
			Node tempNode = head;
			Node prevNode = null;
			while (tempNode.getNext() != null) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			prevNode.setNext(null);
			tempNode = null;
		}else {
			head = null;
		}
		

	}

	/**
	 * Clear the linklist
	 */
	public void clear() {
		this.head = null;
	}

	/**
	 * Method to print data of the linklist
	 */
	public void print() {
		Node tempNode = this.head;
		System.out.println("*********************** Singly Linklist *********************");
		while (tempNode != null) {
			System.out.print(tempNode.getData() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.println("NULL");

	}
}
