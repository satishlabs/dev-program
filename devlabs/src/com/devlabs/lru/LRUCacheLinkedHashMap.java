package com.devlabs.lru;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


class LRUCacheLinkedHashMap extends LinkedHashMap<Integer, Integer> {
    private final int capacity;
	private final Map<Integer, Node> cache;
	private Node head, tail;

    public LRUCacheLinkedHashMap(int capacity) {
        super(capacity, 0.75f, true); // true = access-order
        this.capacity = capacity;
		this.cache = new HashMap<Integer, Node>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		head.prev = head;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity; // Remove least recently used entry
    }
    
    private int get(int key) {
		if (!cache.containsKey(key))
			return -1;
		Node node = cache.get(key);
		moveToHead(node);
		return node.value;
	}
    
    private void put(int key, int value) {
		if (cache.containsKey(key)) {
			// Key exists: update value & move to front
			Node node = cache.get(key);
			node.value = value;
			moveToHead(node);
		} else {
			// New key: check if capacity is full
			if (cache.size() >= capacity) {
				removeLRU(); // Remove Least Recently Used node
			}
			Node newNode = new Node(key, value);
			cache.put(key, newNode);
			addToHead(newNode);
		}

	}
    
    private void removeLRU() {
		Node lru = tail.prev;
		remove(lru); // Remove least recently used node

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
    	LRUCacheLinkedHashMap lruCache = new LRUCacheLinkedHashMap(3);
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

