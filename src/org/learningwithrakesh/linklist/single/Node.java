package org.learningwithrakesh.linklist.single;

public class Node {
	private Integer data;
	private Node next;

	public Node(Integer data) {
		this.data = data;
		this.next = null;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return this.data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	public String toString() {
		String nextData = next != null ? "" + next.getData() : "null";
		return "data: "+data + "next: "+ nextData;
	}
}
