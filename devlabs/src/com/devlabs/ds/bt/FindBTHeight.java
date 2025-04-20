package com.devlabs.ds.bt;

import java.util.LinkedList;
import java.util.Queue;

public class FindBTHeight {
	static Node root;
	public static void main(String[] args) {
		 // Example Tree:
        //       1
        //     /   \
        //    2     3
        //   /
        //  4
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		
		// Output: 2 (if counting edges)
		System.out.println("Height of tree: "+findHeight(root));
		System.out.println("\n==================================");
		System.out.println("Height of tree: "+findHeightBFS(root));
	}
	private static int findHeightBFS(Node root) {
		if(root == null)
			return -1;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int height = -1;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			height++;
			
			for(int i=0; i<size; i++) {
				Node current = queue.poll();
				
				if(current.left != null)
					queue.add(current.left);
				if(current.right != null)
					queue.add(current.right);
			}
		}
		
		return height;
	}
	private static int findHeight(Node root) {
		// return 0 if counting nodes instead of edges
		if(root == null)
			return -1;
		int leftHieght = findHeight(root.left);
		int rightHeight = findHeight(root.right);
		return Math.max(leftHieght, rightHeight)+1;
	}
}
