package com.devlabs.ll;

public class ReverseLinkedList {
	public static Node head;

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		// Creating list 1 -> 2 -> 3 -> 4 -> 5
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);

		System.out.println("Original list:");
		list.printList();

		list.reverse();

		System.out.println("Reversed list:");
		list.printList();

	}

	private void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;// Save next
			current.next = prev;// Reverse current node's pointer
			prev = current;  // Move prev and current one step forward
			current = next;
		}
		head = prev;// Reset head to the new front
	}

	private void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

}
