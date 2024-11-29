package com.dev.col;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample {
    public static void main(String[] args) {

        //Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        //Adding elements to list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
        list.add(3845);
        //Getting an Iterator from list
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(123);
        }
    }
}
