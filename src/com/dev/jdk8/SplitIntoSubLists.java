package com.dev.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitIntoSubLists {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var k = 4;
        var l = splitIntoSubLists(list, k);
        System.out.println(l);
        //Test
    }

    private static List<List<Integer>> splitIntoSubLists(List<Integer> list, int k) {
        int baseSize = list.size()/k;
        int reminder = list.size()%k;

        List<List<Integer>> result = new ArrayList<>();
        int start=0;
        for(int i=0; i<k; i++){
            int sublistSize = baseSize + (i < reminder ? 1 : 0);
            var sublist = list.stream()
                    .skip(start)
                    .limit(sublistSize)
                    .collect(Collectors.toList());
            result.add(sublist);
            start += sublistSize;
        }
        return result;
    }

}
