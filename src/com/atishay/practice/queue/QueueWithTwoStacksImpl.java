package com.atishay.practice.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

//Implementing a Queue using 2 Stacks
public class QueueWithTwoStacksImpl {
	public static void main(String[] args) {
		QueueWithStacks<Integer> queue = new QueueWithStacks<>();
		queue.enQueue(10);
		queue.enQueue(2);
		queue.enQueue(4);
		queue.enQueue(47);
		queue.enQueue(2);
		queue.enQueue(9);

		while (!queue.isEmpty()) {
			System.out.println(queue.deQueue());
		}
	}
}

class QueueWithStacks<T> {
	private Deque<T> enqueStack = new ArrayDeque<>();
	private Deque<T> dequeStack = new ArrayDeque<>();

	public void enQueue(T data) {
		enqueStack.push(data);
	}

	public T deQueue() {
		while (!enqueStack.isEmpty()) {
			dequeStack.push(enqueStack.pop());
		}

		if (!dequeStack.isEmpty()) {
			return dequeStack.pop();
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean isEmpty() {
		return !(enqueStack.isEmpty() || dequeStack.isEmpty());
	}
}
