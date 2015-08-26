package com.anmol.linkedlist;

public class MyLinkedList<T> {
	public Node<T> head;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public void add(Node<T> node) {
		if(head==null) {
			head = node;
		}
		else {
			Node<T> currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}
	
	@Override
	public String toString() {
		if(head == null) {
			return "Empty List";
		}
		else {
			Node<T> currentNode = head;
			StringBuilder sb = new StringBuilder();
			sb.append(currentNode.value);
			while(currentNode.next != null) {
				currentNode = currentNode.next;
				sb.append("-->" + currentNode.value);
			}
			return sb.toString();
		}
	}
}
