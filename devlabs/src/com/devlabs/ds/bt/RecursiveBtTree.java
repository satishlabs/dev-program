package com.devlabs.ds.bt;

public class RecursiveBtTree {
	Node root;

	public static void main(String[] args) {
		RecursiveBtTree bt = new RecursiveBtTree();
		/*
		 * int[] values = {10,20,30,40,50}; for(int val: values) { bt.root =
		 * insertRecursive(bt.root,val); }
		 */
		bt.root = new Node(10);
		bt.root.left = new Node(20);
		bt.root.right = new Node(30);
		bt.root.left.left = new Node(40);
		bt.root.left.right = new Node(50);
		

		System.out.println("In-Order Traversal: ");
		bt.inOrder(bt.root);
		System.out.println("\nPre-Order Traversal: ");
		bt.preOrder(bt.root);
		System.out.println("\nPost-Order Traversal: ");
		bt.postOrder(bt.root);
	}

	public void insert(int data) {
		root = insertRecursive(root, data);
	}
	
	private void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	private void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	

	private static Node insertRecursive(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}

		if (val < root.data) {
			root.left = insertRecursive(root.left, val);
		} else {
			root.right = insertRecursive(root.right, val);
		}

		return root;
	}
}
