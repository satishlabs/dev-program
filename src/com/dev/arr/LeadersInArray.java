package com.dev.arr;

import java.util.ArrayList;
import java.util.Collections;

/*
You are given an array arr of positive integers.
Your task is to find all the leaders in the array.
An element is considered a leader if it is greater than or equal to all elements to its right.
The rightmost element is always a leader.
* */
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res = findLeaders(arr);
        System.out.println(res);
    }

    private static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight); //Rightmost element is always a leader

        //Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}

