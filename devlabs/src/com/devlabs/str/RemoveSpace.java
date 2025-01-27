package com.devlabs.str;

import java.util.stream.Collectors;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "i love programming";

        // Remove spaces and collect characters back to a String
        String result = str.chars()
                           .mapToObj(c -> (char) c)
                           .filter(c -> c != ' ') // Filter out spaces
                           .map(String::valueOf)
                           .collect(Collectors.joining()); // Join characters back into a string

        System.out.println(result); // Output: "iloveprogramming"
    }
}
