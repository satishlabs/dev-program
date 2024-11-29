package com.dev;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyCount {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5}; // Use Integer[] instead of int[]

        Arrays.stream(arr).distinct().forEach(x ->
                System.out.println(x + " repeated " + Collections.frequency(Arrays.asList(arr), x) + " times.")
        );
    }
}
