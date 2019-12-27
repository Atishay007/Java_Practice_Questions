package com.atishay.practice.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

//Runtime Complexity: O(n)
public class IndexOfFirstuniqueCharacterInString {
	public static void main(String[] args) {
		String name = "atishay";
		char[] arr = name.toCharArray();
		getIndexOfFirstUniCharacter(arr);
	}

	private static void getIndexOfFirstUniCharacter(char[] arr) {
		// Used LinkedHashMap to maintain Insertion Order.
		// HashMap has O(1): Get and O(1): Put time complexity.
		Map<Character, Integer> map = new LinkedHashMap<>();

		// O(n): Runtime.
		for (int i = 0; i < arr.length; i++) {
			// increment the count when you found the character.
			if (map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		// O(n)
		Optional<Entry<Character, Integer>> opt = map.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.findFirst();

		if (opt.isPresent()) {
			// O(n): Runtime
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == opt.get().getKey()) {
					System.out.println("Unique Character at Index: " + i);
				}
			}

		} else {
			System.out.println("-1");
		}
	}

}
