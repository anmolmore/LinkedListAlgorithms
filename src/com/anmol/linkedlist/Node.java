package com.anmol.linkedlist;

public class Node<T> {
	public Node<T> next;
	public T value;

	public Node(T value) {
		this.next = null;
		this.value = value;
	}
	
	public Node() {
		this.next = null;
		this.value = null;
	}
}
