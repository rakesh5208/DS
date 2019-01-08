package org.learningwithrakesh.linklist.single;

public class LinkListException extends Exception{

	public LinkListException(String msg) {
		super(msg);
	}
	public LinkListException(String msg, Throwable t) {
		super(msg,t);
	}
}
