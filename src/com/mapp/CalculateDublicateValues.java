package com.mapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CalculateDublicateValues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,6,7,8,5,7,7,3,3};
        //calculateDublicateValues(arr);
        calculateDublicateValues1(arr);
        System.out.println();
        System.out.println("----------------");
        Arrays.stream(arr).distinct().forEach(x -> System.out.println(x+" repeated "+Collections.frequency(Arrays.asList(arr), x)+" times."));
    }

    private static void calculateDublicateValues1(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        map.forEach((k,v)->{
            if(v>1){
                System.out.println(k+" repeated: "+v+" times");
            }
        });
    }

    private static void calculateDublicateValues(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]>1){
                System.out.println(i+" : "+temp[i]);
            }
        }
    }
}
