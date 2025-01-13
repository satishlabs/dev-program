package com.dev.linkedlist;

public class ReverseLinkedList {
    public static Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.printList();
        System.out.println();
        list.reverseList();
        list.printList();
    }

    private void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    private void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        while(head == null){
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
