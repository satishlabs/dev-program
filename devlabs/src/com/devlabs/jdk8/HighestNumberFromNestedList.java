package com.devlabs.jdk8;

import java.util.Arrays;
import java.util.List;

public class HighestNumberFromNestedList {
    public static void main(String[] args) {
        // List of Lists containing Integers
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(3, 5, 7, 9),
                Arrays.asList(15, 21, 4, 8),
                Arrays.asList(30, 2, 11, 18)
        );

        // Finding the highest number using Java 8 Streams
        int maxNumber = nestedList.stream()
                .flatMap(List::stream)  // Flatten the nested list
                .max(Integer::compareTo) // Get the max value
                .orElseThrow(() -> new RuntimeException("List is empty"));

        // Output the highest number
        System.out.println("Highest Number: " + maxNumber);
    }
}

