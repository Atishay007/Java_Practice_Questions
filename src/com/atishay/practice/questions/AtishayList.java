package com.atishay.practice.questions;

import java.util.NoSuchElementException;

public class AtishayList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	static class Node<T> {
		private Node<T> next;
		private T value;

	}

	public void add(T input) {
		if (null != input) {
			Node<T> node = new Node<>();
			node.value = input;
			if (head == null) {
				head = node;
				tail = node;
				node.next = null;
			} else {
				tail.next = node;
				tail = node;
				tail.next = null;
			}
			size++;
		}
	}

	public void printAllNodes() {
		if (null != head) {
			Node<T> node = head;
			int i = size - 1;
			while (i >= 0) {
				System.out.println(node.value);
				// We need this node pointer so that in iteration
				// it can point to other node.
				node = node.next;
				--i;
			}
		} else {
			throw new NoSuchElementException();
		}
	}

	public int size() {
		return size;
	}

	public void remove(T input) {
		if (head == null) {
			throw new NoSuchElementException();
		}

		Node<T> tempNode = head;
		Node<T> secondLastNode = null;
		int i = size - 1;
		while (i >= 0) {
			// CASE: when there is only one element.
			// In this case head and tail will be same.
			if (size == 1) {
				if (tempNode.value == input) {
					head = null;
					tail = null;
					--size;
					break;
				}
			} else {
				if (tempNode.value == input) {
					if (tempNode.next != null) {
						tempNode.value = tempNode.next.value;
						tempNode.next = tempNode.next.next;
					} else {
						// This node is needed when the matching node is last node
						// so we have to make tail node as second last node
						// as last node is deleted.
						// The last node should have next pointer as null.
						secondLastNode.next = null;
						tail = secondLastNode;
					}
					secondLastNode = tempNode.next;
					// On Deletion of Node, the size should be reduced.
					--i;
					--size;
				}
			}

			--i;
			tempNode = tempNode.next;
		}
	}
}
