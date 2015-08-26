package com.anmol.excercise;

import com.anmol.linkedlist.MyLinkedList;
import com.anmol.linkedlist.Node;

public class ReorderList {
	public static void main(String args[]) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(new Node<Integer>(5));
		list.add(new Node<Integer>(10));
		list.add(new Node<Integer>(34));
		list.add(new Node<Integer>(23));
		list.add(new Node<Integer>(12));
		list.add(new Node<Integer>(1));
		System.out.println(list);
		reorder(list,8);
		System.out.println(list);
	}
	
	/**
	 * Reorder at kth Node
	 * @param list
	 * @param k
	 * @throws Exception 
	 */
	public static void reorder(MyLinkedList<Integer> list, int k) {
		Node<Integer> currentNode = list.head;
		Node<Integer> prevNode = list.head;
		while(k > 1) {
			prevNode = currentNode;
			if(currentNode.next != null)
				currentNode = currentNode.next;
			else
				currentNode = list.head;
			k--;
		}
		Node<Integer> kNode = currentNode;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = list.head;
		list.head = kNode;
		prevNode.next = null;
	}
}
