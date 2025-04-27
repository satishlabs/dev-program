package com.devlabs.ll;

public class DeleteNodeLinkedList {
	public static Node head;

	public static void main(String[] args) {
		DeleteNodeLinkedList list = new DeleteNodeLinkedList();
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1); // List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
		System.out.println("Original list:");
		list.printList();

		list.deleteByValue(3);
		System.out.println("\nList after deleting 3:");
		list.printList();

		// Delete node at position 2 (0-based), i.e., 4
		list.deleteByPosition(2);
		System.out.println("\nAfter deleting node at position 2:");
		list.printList();

		// Now delete node with only reference (let's delete node '2')
		Node nodeToDelete = list.head.next.next; // node with data 2
		list.deleteGivenNode(nodeToDelete);

		System.out.println("\nAfter deleting node by reference (2):");
		list.printList();
	}

	// Delete the given node without head access
	private void deleteGivenNode(Node nodeToDelete) {
		if (nodeToDelete == null || nodeToDelete.next == null) {
			System.out.println("Cannot delete the last node using this method.");
			return;
		}
		// Copy data from next node to current node
		nodeToDelete.next = nodeToDelete.next.next;
		nodeToDelete.next = nodeToDelete.next.next;

	}

	// Delete node at a given position
	private void deleteByPosition(int position) {
		if (head == null) {
			System.out.println("List is empty...");
			return;
		}

		Node temp = head;
		// if head needs to be removed
		if (position == 0) {
			head = temp.next;
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}

		// If position is more than number of nodes
		if (temp == null || temp.next == null) {
			System.out.println("Position is out of buds...");
			return;
		}

		// Node temp.next is the node to delete
		temp.next = temp.next.next;
	}

	// Function to delete a node by value
	private void deleteByValue(int key) {
		if (head == null) {
			System.out.println("List is empty...");
			return;
		}

		// If head node itself holds the key
		if (head.data == key) {
			head = head.next;
			return;
		}
		// Search for the key
		Node current = head;
		Node prev = null;

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		// If the key was not found
		if (current == null) {
			System.out.println("Key not found in the list");
			return;
		}

		// Unlink the node
		prev.next = current.next;
	}

	private void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}
}
