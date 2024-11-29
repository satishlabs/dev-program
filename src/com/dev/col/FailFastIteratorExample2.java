package com.dev.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFastIteratorExample2 {
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
        ListIterator<Integer> listItr = list.listIterator();
        while (listItr.hasNext()){
            System.out.println(listItr.next());
            listItr.add(123);
        }
    }
}
