package com.devlabs.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachWordInString {
	public static void main(String[] args) {
		String str = "Hello How are you How you are";
		Map<String, Integer> map = new HashMap<String, Integer>();
		//char[] chaArr = str.toCharArray();
		String[] strArr = str.split("\\s+");
		for(String ch: strArr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		System.out.println("-----------------------");
		Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
				.map(String::toLowerCase) //optional
				.collect(Collectors.groupingBy(
						word -> word, Collectors.counting()
				));
		//print the word counts
		wordCount.forEach((word,count) -> System.out.println(word+" = "+count));
	}
}
