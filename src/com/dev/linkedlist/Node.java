package com.dev.linkedlist;

public class Node {
    //create a method to detect a cyclic node and find the position of it
    // Node properties
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
