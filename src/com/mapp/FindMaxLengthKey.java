package com.mapp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//How to Find Key with Maximum Length in HashMap?
public class FindMaxLengthKey {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Orange",1);
        map.put("Banana", 2);
        map.put("Fruit",3);
        map.put("Mango", 4);
        map.put("Vegetable",5);
        String maxlengthKey = findMaxlengthKey(map);
        System.out.println(maxlengthKey);
    }

    private static String findMaxlengthKey(HashMap<String, Integer> map) {
        return map.entrySet()
                .stream()
                .max(Comparator.comparingInt(e ->e.getKey().length()))
                .map(Map.Entry::getKey)
                .orElse("None");
    }
}
