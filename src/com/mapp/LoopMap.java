package com.mapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class LoopMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","Mon");
        map.put("2","Tues");
        map.put("3","Wed");
        map.put("4","Thurs");
        map.put("5","Fri");
        map.put("6","Sat");
        map.put("7","Sun");

        System.out.println("\n Example-1 ....");
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry<String,String>)itr.next();
            System.out.println("key : "+entry.getKey()+"  Value: "+entry.getValue());
        }

        System.out.println("");
        System.out.println("\n Example-2 ....");
        for(Map.Entry<String,String > entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value : "+entry.getValue());
        }
        System.out.println("");
        System.out.println("\n Example-3 ....");
        for(Object obj : map.keySet()){
            System.out.println("Key: "+obj.toString()+" Value : "+map.get(obj));
        }

        System.out.println("");
        System.out.println("\n Example-4 ....");
        map.forEach((k,v)-> System.out.println("Key : "+ k+ " Value: "+v));
    }
}
