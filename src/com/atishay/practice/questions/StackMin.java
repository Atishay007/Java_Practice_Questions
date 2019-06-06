package com.atishay.practice.questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

//Cracking Coding Interview: 
//Chapter 3: Stack and Queue.
//Question: 3.2
public class StackMin {
	public static void main(String[] args) {
		StackWithMin s = new StackWithMin();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(2);
		s.push(0);

		System.out.println(s.min());
	}
}

class StackWithMin {
	private Node top;
	private Deque<Integer> s2 = new ArrayDeque<>();

	private static class Node {
		private Integer data;
		private Node nextNode;

		public Node(Integer data, Node nextNode) {
			super();
			this.data = data;
			this.nextNode = nextNode;
		}
	}

	public void push(Integer data) {
		Node tempNode = new Node(data, null);

		if (top == null) {
			top = tempNode;
			s2.push(top.data);
		} else {
			if (s2.peek() > tempNode.data) {

			} else {
				s2.push(s2.peek());
			}

			tempNode.nextNode = top;
			top = tempNode;
		}
	}

	public Integer pop() {
		if (top == null) {
			throw new EmptyStackException();
		} else {
			Integer tempValue = top.data;
			top = top.nextNode;
			s2.pop();
			return tempValue;
		}
	}

	public Integer min() {
		return s2.peek();
	}
}