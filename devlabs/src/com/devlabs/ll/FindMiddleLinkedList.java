package com.devlabs.ll;

/*
 To find the middle element of a singly linked list in Java, you can use the slow and fast pointer approach:

slow moves one node at a time.

fast moves two nodes at a time.

When fast reaches the end, slow will be at the middle.
 * */
public class FindMiddleLinkedList {
	public static Node head;
	public static void main(String[] args) {
		FindMiddleLinkedList list = new FindMiddleLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		
		System.out.println("\n=================");
		list.printList();
		System.out.println("\n=================");
		list.printMiddle();
	}
	
	private void printMiddle() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next; //Move one step
			fast = fast.next.next; //Move two steps
		}
		System.out.println("Middle element: " + slow.data);
	}
	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	private void insert(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
