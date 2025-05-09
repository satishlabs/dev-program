package com.devlabs.ll;

public class MergeSortedLists {
	public static void main(String[] args) {
		MergeSortedLists merger = new MergeSortedLists();
		int[] a1 = { 1, 3, 5, 7 };
		int[] a2 = { 2, 4, 6, 8 };

		Node list1 = merger.createList(a1);
		merger.printList(list1);
		Node list2 = merger.createList(a2);
		merger.printList(list2);

		Node merged = merger.merge(list1, list2);
		System.out.println("Merged List:");
		merger.printList(merged);
	}

	// Merges two sorted linked lists and returns the head of the merged list
	private Node merge(Node list1, Node list2) {
		// Dummy node to help build the result list
		Node dummy = new Node(-1);
		Node tail = dummy;
		
		//Traverse both lists
		while(list1 != null && list2 != null) {
			if(list1.data <= list2.data) {
				tail.next = list1;
				list1 = list1.next;
			}else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		   // Attach the remaining part
		if(list1 != null)
			tail.next = list1;
		if(list2 != null)
			tail.next = list2;
		return dummy.next;
	}

	private void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println();
	}

	// Helper to create a list from an array
	private Node createList(int[] arr) {
		Node head = null;
		Node tail = null;
		for (int val : arr) {
			Node newNode = new Node(val);
			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		return head;
	}
}
