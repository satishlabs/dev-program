package com.devlabs.coll.map;


import java.util.HashMap;

public class HashMapSameHashCodeExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Adding multiple keys with the same hash code
        map.put("FB", "Value1"); // HashCode: 2236
        map.put("Ea", "Value2"); // HashCode: 2236
        map.put("CC", "Value3"); // HashCode: 2236
        map.put("DC", "Value4"); // HashCode: 2236
        map.put("CF", "Value5"); // HashCode: 2236
        map.put("EC", "Value6"); // HashCode: 2236
        map.put("FD", "Value7"); // HashCode: 2236
        map.put("CD", "Value8"); // HashCode: 2236
        map.put("GF", "Value9"); // HashCode: 2236
        map.put("HF", "Value10"); // HashCode: 2236
        map.put("IF", "Value11"); // HashCode: 2236

        // Printing the map
        System.out.println("HashMap content:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Demonstrating hash codes
        System.out.println("\nHash codes of keys:");
        map.keySet().forEach(key -> System.out.println(key + " -> HashCode: " + key.hashCode()));

        // Checking the size of the map
        System.out.println("\nSize of HashMap: " + map.size());
    }
}

