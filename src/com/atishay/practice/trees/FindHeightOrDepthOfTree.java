package com.atishay.practice.trees;

public class FindHeightOrDepthOfTree {
	public static void main(String[] args) {
		BinaryTree2 tree = new BinaryTree2();
		// Insertion through level Order.
		tree.levelOrderInsertion(10);
		tree.levelOrderInsertion(20);
		tree.levelOrderInsertion(0);
		tree.levelOrderInsertion(4);
		Node root = tree.levelOrderInsertion(6);
		System.out.println(findHeight(root));
	}

	// left -> right -> root(Post-Order traversal use)
	private static int findHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			int tempLHeight = findHeight(root.left);
			int tempRHeight = findHeight(root.right);
			if (tempLHeight > tempRHeight) {
				return tempLHeight + 1;
			} else {
				return tempRHeight + 1;
			}
		}
	}

}
