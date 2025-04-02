package com.devlabs.lru;

public class Node {
	int key, value;
	Node prev,next;
	
	public Node(int k, int v) {
		key=k;
		value=v;
	}
}
