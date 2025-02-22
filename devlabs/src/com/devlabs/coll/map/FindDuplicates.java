package com.devlabs.coll.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
	public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates); // Output: [2, 3]

	}

	private static List<Integer> findDuplicates(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(map);
		map.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+" "+v);
			}
		});
		
		List<Integer> result = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				result.add(entry.getKey());
			}
		}
		
		Collections.sort(result);
		return result;
	}
}
