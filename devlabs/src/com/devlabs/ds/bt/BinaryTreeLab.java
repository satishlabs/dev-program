package com.devlabs.ds.bt;

public class BinaryTreeLab {
	Node root;
	public void insert(int data) {
		root = insertRecursive(root,data);
	}
	private Node insertRecursive(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		
		if(value < root.data) {
			root.left = insertRecursive(root.left, value);
		}else {
			root.right = insertRecursive(root.right, value);
		}
		return root;
	}
	public void inorder() {
		inOrderRecursive(root);
		System.out.println();
		
	}
	private void inOrderRecursive(Node root) {
		if(root != null) {
			inOrderRecursive(root.left);
			System.out.print(root.data+" ");
			inOrderRecursive(root.right);
		}
	}
	public void postOrder() {
		postOrderRecursive(root);
		System.out.println();
		
	}
	private void postOrderRecursive(Node root) {
		if(root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.print(root.data+" ");
		}
		
	}
	public void preOrder() {
		preOrderRecursive(root);
		System.out.println();
		
	}
	private void preOrderRecursive(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
		
	}
	public int sumOfTree(Node root) {
		if(root == null)
			return 0;
		return root.data+sumOfTree(root.left)+sumOfTree(root.right);
	}

}
