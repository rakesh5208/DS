package org.learningwithrakesh.linklist.single;

public class SLLDriver {
	public static void main(String[] args) throws LinkListException {
		SingleLinkList sll = new SingleLinkList();
		int[] arr = { 97, 28, 14, 72, 53, 33, 31, 38, 47, 39 };
		
		/**
		 * Added node to the start
		 * 39->47->38->31->33->53->72->14->28->97->NULL
		 */
		for (int i = 0; i < arr.length; i++) {
			sll.insertAtBeginning(arr[i]);
		}
		sll.print();
		
		/**
		 * Added node to the end
		 * 97->28->14->72->53->33->31->38->47->39->NULL
		 */
		sll.clear();
		for (int i = 0; i < arr.length; i++) {
			sll.insertAtEnd(arr[i]);
		}
		sll.print();
		/**
		 * Added at the position
		 * 97->28->14->72->53->33->31->38->47->39->NULL
		 */
		sll.clear();
		for (int i = 0; i < arr.length; i++) {
			sll.insertAt(sll.size(), arr[i]);
		}
		sll.print();
		/**
		 * 81->97->28->14->72->53->33->31->38->47->39->NULL
		 */
		sll.insertAt(0, 81);
		sll.print();
		/**
		 * 81->97->28->14->72->53->33->31->38->47->39->89->NULL
		 */
		sll.insertAt(sll.size(), 89);
		sll.print();
		/**
		 * 81->97->28->14->72->23->53->33->31->38->47->39->89->NULL
		 */
		sll.insertAt(5, 23);
		sll.print();
		
		/**
		 * delete first node
		 * 97->28->14->72->23->53->33->31->38->47->39->89->NULL
		 */
		sll.deleteFirstNode();
		sll.print();
		/**
		 * clear and add only one node and then delete
		 * 
		 */
		sll.clear();
		sll.insertAtBeginning(10);
		sll.print();
		sll.deleteFirstNode();
		sll.print();
		sll.insertAtBeginning(10);
		sll.insertAtBeginning(20);
		sll.deleteFirstNode();
		sll.print();
		/**
		 * Delete last node
		 */
		sll.clear();
		sll.insertAtBeginning(10);
		sll.print();
		sll.deleteLastNode();
		sll.print();
		sll.insertAtBeginning(10);
		sll.insertAtBeginning(20);
		sll.deleteLastNode();
		sll.print();
		
		
		sll.clear();
		
		for (int i = 0; i < arr.length; i++) {
			sll.insertAt(sll.size(), arr[i]);
		}
		sll.print();
		sll.deleteLastNode();
		sll.print();
		for (int i = 0; i < arr.length; i++) {
			sll.deleteLastNode();
		}
		sll.deleteLastNode();
		sll.deleteLastNode();
		sll.print();
		
		/**
		 * clear and add only one node and then delete
		 * 
		 */
		sll.clear();
		sll.insertAtBeginning(10);
		sll.print();
		sll.deleteAt(0);
		sll.print();
		sll.insertAtBeginning(10);
		sll.insertAtBeginning(20);
		sll.deleteAt(1);
		sll.print();
		sll.clear();
		
		for (int i = 0; i < arr.length; i++) {
			sll.insertAt(sll.size(), arr[i]);
		}
		sll.print();
		sll.deleteAt(sll.size()-1);
		sll.print();
		int size = sll.size();
		for (int i = 0; i <size; i++) {
			sll.deleteAt(sll.size()-1);
		}
		sll.print();
	}
}
