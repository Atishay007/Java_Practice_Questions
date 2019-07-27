package com.atishay.practice.linkedlist;

import java.util.NoSuchElementException;

import com.atishay.practice.linkedlist.CustomLinkedListI.Node;

//Reversing LinkedList using Recursion.
public class ReverseLinkedListRecursion {
	public static void main(String[] args) {
		CustomLinkedListI lst = new CustomLinkedListI();
		lst.add(10);
		lst.add(20);
		Node head = lst.add(40);
		lst.printAllNodes(reverse(head));
	}

	static Node reverse(Node head) {
		// if head is null or only one node, it's reverse of itself.
		// We are stopping at second Last Node.
		if ((head == null) || (head.next == null))
			return head;

		// reverse the sub-list leaving the head node.
		Node reverse = reverse(head.next);

		// head.next still points to the last element of reversed sub-list.
		// so move the head to end.
		head.next.next = head;

		// point last node to nil, (get rid of cycles)
		head.next = null;
		return reverse;
	}
}

class CustomLinkedListI {
	private Node head;
	private Node tail;
	private int size = 0;

	static class Node {
		Node next;
		int value;

		Node(int value) {
			this.value = value;
		}
	}

	public void printAllNodes(Node head) {
		if (null != head) {
			Node node = head;
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

	public Node add(int value) {
		Node node = new Node(value);
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
		return head;
	}
}