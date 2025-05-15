package com.devlabs.ll;

public class AddTwoNumbers {
	public static void main(String[] args) {
		AddTwoNumbers list = new AddTwoNumbers();
		
		Node list1 = list.createList(new int[] {2, 4, 3});// 342
		Node list2 = list.createList(new int[] {5, 6, 4});// 465
		
		Node result = list.addTwoNumbers(list1, list2);
		
		System.out.println("Sum: ");
		list.printList(result);
	}
	
	public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
	
	public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

	private Node createList(int[] digits) {
		Node head = null;
		Node tail = null;
		for(int digit : digits) {
			Node newNode = new Node(digit);
			if(head  == null ) {
				head = tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		return head;
	}
}
