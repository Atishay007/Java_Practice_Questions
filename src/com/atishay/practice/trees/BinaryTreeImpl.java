package com.atishay.practice.trees;

import java.util.ArrayDeque;
import java.util.Deque;

import com.atishay.practice.trees.BinaryTree.Node;

public class BinaryTreeImpl {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		// Insertion through level Order.
		tree.levelOrderInsertion(10);
		tree.levelOrderInsertion(20);
		tree.levelOrderInsertion(0);
		tree.levelOrderInsertion(4);
		// Don't make Node a private class, because we will need it.
		Node root = tree.levelOrderInsertion(6);

		System.out.println("Printing InOrderTraversal");
		tree.inOrderTraversal(root);

		System.out.println("Printing PreOrderTraversal");
		tree.preOrderTraversal(root);

		System.out.println("Printing PostOrderTraversal");
		tree.postOrderTraversal(root);

		System.out.println("Level Order Traversal");
		tree.levelOrderTraversal(root);
	}
}

class BinaryTree {
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

	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.value);
			inOrderTraversal(root.right);
		}
	}

	public void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.println(root.value);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.value);
		}
	}

	public void levelOrderTraversal(Node root) {
		if (root != null) {
			Deque<Node> queue = new ArrayDeque<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node temp = queue.removeFirst();
				System.out.println(temp.value);

				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
	}
}