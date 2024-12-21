package com.mapp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSortingExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Amit");
        map.put(102, "Vijay");
        map.put(103, "Rahul");

        map.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println("-----------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("-----------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-----------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("-----------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
