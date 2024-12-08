package com.dev.linkedlist;

public class CheckCyclicNode {
       public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

public static void main(String[] args) {
           Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; // Creating a cycle
            CheckCyclicNode checker = new CheckCyclicNode();

            // Check if list has cycle
            boolean hasCycle = checker.hasCycle(head);

            // Print result
            System.out.println("List has cycle: " + hasCycle);

            // Print nodes in cycle
            if(hasCycle) {
                Node slow = head;
                Node fast = head;

                // Find meeting point
                while(fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    if(slow == fast) break;
                }

                // Print nodes in cycle
                System.out.print("Nodes in cycle: ");
                slow = slow.next;
                while(slow != fast) {
                    System.out.print(slow.data + " -> ");
                    slow = slow.next;
                }
                System.out.println(fast.data);
            }
    }
}
