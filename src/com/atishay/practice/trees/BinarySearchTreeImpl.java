package com.atishay.practice.trees;

import com.atishay.practice.trees.BinarySearchTree.Node;

public class BinarySearchTreeImpl {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		Node root = tree.insert(null, 10);
		tree.insert(root, 20);
		tree.insert(root, 5);
		System.out.println("InOrder traversal: Left->Root->Right");
		tree.inOrderTraversal(root);
	}
}

class BinarySearchTree {

	static class Node {
		private Node left;
		private Node right;
		private int value;

		Node(int value) {
			this.value = value;
		}
	}

	// Left -> Root ->Right
	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.value);
			inOrderTraversal(root.right);
		}
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value <= root.value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}
}