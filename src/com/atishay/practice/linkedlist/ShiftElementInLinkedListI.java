package com.atishay.practice.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import com.atishay.practice.linkedlist.LinkedListRotationII.Node;

//Very Poor Solution
//This was my first solution.
public class ShiftElementInLinkedListI {
	public static void main(String[] args) {
		LinkedListRotationII<Integer> lst = new LinkedListRotationII<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);

		System.out.println("####Before Shifting#####");
		lst.printAllNodes();

		lst.setHead(rotateElements(lst.getHead(), 2, 0, lst.size()));
		System.out.println("####After Shifting#####");
		lst.printAllNodes();
	}

	// Using Recursion, to repeat whole process.
	// Shifting the elements by assuming last element to be shifted first and then
	// setting head
	// then again repeating the whole process again.
	private static Node<Integer> rotateElements(Node<Integer> head, int n, int j, int lstSize) {
		if (j >= n) {
			return head;
		}

		Node<Integer> temp = head;

		if (n == lstSize) {
			return head;
		}

		Stack<Node<Integer>> stk = new Stack<>();

		boolean firstNodeFound = false;
		Node<Integer> firstNode = null;

		Deque<Node<Integer>> que = new ArrayDeque<>();

		int i = 0;
		int count = lstSize - 1;
		while (temp != null) {
			if (i < count) {
				que.add(temp);
			} else {
				stk.push(temp);
				if (!firstNodeFound) {
					firstNode = temp;
					firstNodeFound = true;
				}
			}
			i++;
			temp = temp.next;
		}
		que.getLast().next = null;
		stk.pop().next = que.getFirst();
		head = firstNode;
		j++;

		return rotateElements(head, n, j, lstSize);
	}
}
