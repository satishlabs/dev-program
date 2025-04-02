package com.devlabs.lru;

import java.util.*;

class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private Node head, tail;

    private static class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        head = new Node(0, 0); // Dummy head
        tail = new Node(0, 0); // Dummy tail
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1; // Key not found
        Node node = cache.get(key);
        moveToHead(node); // Move accessed node to front
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            if (cache.size() >= capacity) {
                removeLRU();
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
        }
    }

    private void moveToHead(Node node) {
        remove(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        cache.remove(node.key);
    }

    private void removeLRU() {
        Node lru = tail.prev;
        remove(lru);
    }

    // ✅ Updated toString() to print LRU order
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head.next;
        while (current != tail) {
            sb.append(current.key);
            if (current.next != tail) {
                sb.append("->");
            }
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 100);
        System.out.println(lruCache);
        lruCache.put(2, 200);
        System.out.println(lruCache);
        lruCache.put(3, 300);
        System.out.println(lruCache); // ✅ Prints 3->2->1

        lruCache.put(4, 400);
        System.out.println(lruCache); // ✅ Prints 4->3->2

        lruCache.put(5, 500);
        System.out.println(lruCache); // ✅ Prints 5->4->3
        lruCache.put(1, 600);
        System.out.println(lruCache); 
    }
}


//9800880715
