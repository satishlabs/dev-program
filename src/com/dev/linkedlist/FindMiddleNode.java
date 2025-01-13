package com.dev.linkedlist;
//find the middle element of singly linked list  in one pass
public class FindMiddleNode {
    static Node head;
    public static void main(String[] args) {
        FindMiddleNode  list = new FindMiddleNode();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        //list.insert(60);
        list.display();

        System.out.println("\nFind Middle Node of LinkedList");
        list.findMiddleNode();
        System.out.println("\nFind Middle Node of LinkedList");
        list.findMiddleNode1();
    }
    //Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2.
    private void findMiddleNode1() {
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0; i<length/2; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
//Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
// When the fast pointer reaches end slow pointer will reach middle of the linked list.
    private void findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    private void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
