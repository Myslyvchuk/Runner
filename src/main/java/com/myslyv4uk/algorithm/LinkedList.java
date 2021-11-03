package com.myslyv4uk.algorithm;

import java.util.Objects;

public class LinkedList<T> {
	private Node<T> head;
	private int size;
	
	// 5 -> 4 -> 1 -> 0
	// 0 -> 1 -> 4 -> 5
	public void reverse() {
		if(head == null){
			return;
		}
		Node<T> currentHead = head;
		while (currentHead.next != null){
			swap(currentHead);
		}
	}
	
	private void swap(Node<T> currentHead) {
		Node<T> temp = currentHead.next;
		// change iteration for while
		currentHead.next = temp.next;
		temp.next = head;
		head = temp;
	}
	
	public void reverse2() {
			Node<T> current = head;
			Node<T> next = null;
			Node<T> previous = null;
			while (current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			previous = head;
	}
	
	public void addByIndex(int index, T element) {
		Objects.checkIndex(index, size);
		Node<T> newNode = new Node<>(element);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		size++;
	}
}

class Node<T> {
	T element;
	Node<T> next;
	
	public Node(T element) {
		this.element = element;
	}
}
