package com.dev.linkedlist;

public class DeleteNodeWithoutHead {
    static Node head;
    public static void main(String[] args) {
        DeleteNodeWithoutHead list = new DeleteNodeWithoutHead();
        list.insert(20);
        list.insert(4);
        list.insert(15);
        list.insert(35);
        System.out.println("-------------");
        list.display();

        //delete 15 without sending head

        System.out.println("-------------");
        Node del = list.head.next;

        list.deleteNodeWithoutHead(del);
        list.display();
    }

    private void deleteNodeWithoutHead(Node del) {
     if(del == null){
         return;
     }else{
         if(del.next == null){
             System.out.println("Can't delete last node");
             return;
         }
     }

     //Copy data the next node to current node
        del.data =del.next.data;
        del.next = del.next.next;

    }

    private void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next  = head;
        head = newNode;
    }
}
