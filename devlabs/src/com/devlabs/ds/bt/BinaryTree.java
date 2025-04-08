package com.devlabs.ds.bt;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		 // Insert nodes
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
       // bt.insert(40);
       // bt.insert(50);
       // bt.insert(60);
        System.out.println("Inorder Traversal:");
        bt.inOrder(bt.root);
        System.out.println("\nPostOrder Traversal:");
        bt.postOrder(bt.root);
        System.out.println("\nPretOrder Traversal:");
        bt.preOrder(bt.root);
	}

	   private void preOrder(Node root) {
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}

	private void postOrder(Node root) {
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	// Inorder Traversal (Left, Root, Right)
	private void inOrder(Node root) {
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	private void insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while(queue != null) {
			Node temp = queue.poll();
			
			if(temp.left == null) {
				temp.left = newNode;
				break;
			}else {
				queue.offer(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = newNode;
				break;
			}else {
				queue.offer(temp.right);
			}
		}
	}
}
