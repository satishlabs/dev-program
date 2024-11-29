package com.dev.col;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {
    public static void main(String[] args) {
        //Creating a ConcurrentHahsMap

        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(1,"one");
        map.put(2,"two");
        Iterator itr = map.keySet().stream().iterator();
        while (itr.hasNext()){
            System.out.println(map.get(itr.next()));
            map.put(3,"Three");
        }
    }
}
