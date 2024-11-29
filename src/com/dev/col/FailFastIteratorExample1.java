package com.dev.col;

import java.util.ArrayList;

public class FailFastIteratorExample1 {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
       // list.add(3845);

        // Iterating over a copy of the list
        for (Integer number : new ArrayList<>(list)) {
            System.out.println(number);
            list.add(123); // Modify the original list
        }

        System.out.println("Final list: " + list);
    }
}
