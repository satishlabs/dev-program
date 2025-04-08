package com.devlabs.ds.bt;

public class HeightBT {
	Node root;
	
	public static void main(String[] args) {
		HeightBT bt = new HeightBT();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);

        System.out.println("Height of tree: " + bt.height(bt.root));
	}

	private int height(Node root) {
		if(root == null) {
			return -1;  // or return 0 if you define empty tree height as 0
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
}
