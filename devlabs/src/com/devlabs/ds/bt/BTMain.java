package com.devlabs.ds.bt;

public class BTMain {
	public static void main(String[] args) {
		BinaryTreeLab tree = new BinaryTreeLab();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(2);
		tree.insert(7);
		
		System.out.println("Inorder Traversal:");
       tree.inorder();
       System.out.println("PostOrder Traversal:");
       tree.postOrder();
       System.out.println("PreOrder Traversal:");
       tree.preOrder();
       int sum = tree.sumOfTree(tree.root);
       System.out.println("Sum of Binary Tree: " + sum);
	}
}
