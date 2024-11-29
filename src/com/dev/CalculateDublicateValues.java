package com.dev;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CalculateDublicateValues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,6,7,8,5,7,7,3,3};

        System.out.println("---------------------------");

        Arrays.stream(arr).distinct().forEach(x ->
                System.out.println(x + " repeated " + Collections.frequency(Arrays.asList(arr), x) + " times.")
        );
        calculateDublicateValues(arr);



    }

    private static void calculateDublicateValues(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int c: arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        map.forEach((k,v)-> System.out.println(k+" repeated: "+v+" times"));
        System.out.println("-------------------");
        map.forEach((k,v)->{
            if(v>1){
                System.out.println(k+" repeated: "+v+" times");
            }
        });

    }
}
