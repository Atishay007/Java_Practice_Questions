package com.atishay.practice.trees;

import java.util.ArrayDeque;
import java.util.Deque;

import com.atishay.practice.trees.BinaryTree2.Node;

public class FindDeepestSingleNode {
	public static void main(String[] args) {
		BinaryTree2 tree = new BinaryTree2();
		// Insertion through level Order.
		tree.levelOrderInsertion(10);
		tree.levelOrderInsertion(20);
		tree.levelOrderInsertion(0);
		tree.levelOrderInsertion(4);
		// Don't make Node a private class, because we will need it.
		Node root = tree.levelOrderInsertion(6);
		tree.levelOrderTraversal(root);
	}
}

class BinaryTree2 {
	private static Node root;

	static class Node {
		private Node left;
		private Node right;
		private int value;

		Node(int value) {
			this.value = value;
		}
	}

	public Node levelOrderInsertion(int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		Deque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.removeFirst();
			if (temp.left == null) {
				temp.left = new Node(value);
				break;
			} else if (temp.right == null) {
				temp.right = new Node(value);
				break;
			} else {
				queue.add(temp.left);
				queue.add(temp.right);
			}
		}
		return root;
	}

	public void levelOrderTraversal(Node root) {
		if (root != null) {
			Deque<Node> queue = new ArrayDeque<>();
			queue.add(root);
			Node temp = null;
			while (!queue.isEmpty()) {
				temp = queue.removeFirst();

				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
			if (temp != null) {
				System.out.println("Deepest Node is:" + temp.value);
			}
		}
	}
}