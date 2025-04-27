package com.devlabs.ll;

public class DeleteNodeLinkedList {
	public static Node head;

	public static void main(String[] args) {
		DeleteNodeLinkedList list = new DeleteNodeLinkedList();
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1); // List: 1 -> 2 -> 3 -> 4 -> 5
		System.out.println("Original list:");
        list.printList();
        
        list.deleteByValue(3);
        System.out.println("\nList after deleting 3:");
        list.printList();
	}
	
	 // Function to delete a node by value
	private void deleteByValue(int key) {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		
		// If head node itself holds the key
		if(head.data == key) {
			head = head.next;
			return;
		}
		 // Search for the key
		Node current = head;
		Node prev = null;
		
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		  // If the key was not found
		if(current == null) {
			System.out.println("Key not found in the list");
			return;
		}
		
		 // Unlink the node
		prev.next = current.next;
	}

	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
}
