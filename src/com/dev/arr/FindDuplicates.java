package com.dev.arr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Given an array arr of integers,
* find all the elements that occur more than once in the array.
* Return the result in ascending order.
* If no element repeats, return an empty array
* */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates); // Output: [2, 3]
        System.out.println("-------------------");
                duplicates = findDuplicates1(arr);
        System.out.println(duplicates); // Output: [2, 3]
        System.out.println("-------------------");
        duplicates = findDuplicates2(arr);
        System.out.println(duplicates); // Output: [2, 3]
    }

    private static List<Integer> findDuplicates2(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }
        System.out.println(map);
        return map.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> findDuplicates1(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        return map.entrySet().stream().filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

    }

    private static List<Integer> findDuplicates(int[] arr) {
        int[] freq = new int[arr.length+1];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        return java.util.Arrays.stream(arr)
                .filter(num -> freq[num] > 1)
                .distinct()
                .sorted()
                .boxed()
                .collect(java.util.stream.Collectors.toList());
    }
}
