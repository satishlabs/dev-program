package com.devlabs.ds.bt;

public class CountNodeInBT {
	Node root;
	
	public static void main(String[] args) {
		CountNodeInBT bt = new CountNodeInBT();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		
		System.out.println("No of Node in BT: "+bt.countNode(bt.root));
	}

	private int countNode(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftCount = countNode(root.left);
		int rightCount = countNode(root.right);
		
		return leftCount+rightCount+1;
	}
}
