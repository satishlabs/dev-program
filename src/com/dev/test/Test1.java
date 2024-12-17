package com.dev.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        Arrays.stream(arr).peek(System.out::print).count();
    }
}
