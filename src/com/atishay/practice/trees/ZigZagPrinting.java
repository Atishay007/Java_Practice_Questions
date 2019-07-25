package com.atishay.practice.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.atishay.practice.trees.BinaryTree11.Node;

public class ZigZagPrinting {

	public static void main(String[] args) {

		BinaryTree11 tree = new BinaryTree11();
		// Insertion through level Order.
		// 3,9,20,null,null,15,7
		tree.levelOrderInsertion(3);
		tree.levelOrderInsertion(9);
		tree.levelOrderInsertion(20);
		tree.levelOrderInsertion(15);
		// Don't make Node a private class, because we will need it.
		Node root = tree.levelOrderInsertion(7);

		System.out.println("Level Order Traversal");
		System.out.println(BinaryTree11.levelOrderTraversal(root));
	}
}

class BinaryTree11 {
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

	// Level Order Traversal
	public static List<List<Integer>> levelOrderTraversal(Node root) {
		List<List<Integer>> lst = new LinkedList<>();
		if (root != null) {
			Deque<Node> queue = new ArrayDeque<>();
			queue.add(root);

			List<Integer> lstTemp = new LinkedList<>();
			lstTemp.add(root.value);
			lst.add(lstTemp);
			// true means right to left.
			boolean direction = true;
			while (!queue.isEmpty()) {
				Node temp = queue.removeFirst();
				List<Integer> lstTempo = new LinkedList<>();
				// right to left
				Deque<Node> tempQueue = new ArrayDeque<>();

				// left to right
				if (temp.left != null) {
					queue.add(temp.left);
					tempQueue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
					tempQueue.add(temp.right);
				}

				while (!tempQueue.isEmpty()) {
					if (direction) {
						lstTempo.add((tempQueue.removeLast()).value);
					} else {
						lstTempo.add((tempQueue.removeFirst()).value);
					}
				}

				if (lstTempo.size() > 0) {
					lst.add(lstTempo);
				}
				if (direction) {
					direction = false;
				} else {
					direction = true;
				}
			}

		}
		return lst;
	}
}
