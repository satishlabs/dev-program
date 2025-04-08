package com.devlabs.jdk8.stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "swiss";
		//Output: w
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: charArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for(char c: charArr) {
			if(map.get(c) ==1) {
				System.out.println("First Non-Repeated Characheter In "+str+" is : "+c);
				break;
			}
		}
		
		for(char c: charArr) {
			if(map.get(c)>1) {
				System.out.println("First Repeated Characheter In "+str+" is : "+c);
				break;
			}
		}
		
		Optional<Character> first = map.entrySet().stream().filter(e -> e.getValue()==1).map(e -> e.getKey()).findFirst();
		if(first.isPresent()) {
			System.out.println("First non repeating: "+first.get());
		}
		
		System.out.println("\n============================");
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		collect.forEach((k,v) -> System.out.println("Key: "+k+" value: "+v));
		
		System.out.println("\n============================");
		Optional<Character> first1 = collect.entrySet().stream().filter((e) -> e.getValue()==1).map(e -> e.getKey()).findFirst();
		if(first1.isPresent()) {
			System.out.println("First non repeating: "+first1.get());
		}
		System.out.println("\n============================");
		Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
	}
}
