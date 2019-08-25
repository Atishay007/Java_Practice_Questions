package com.atishay.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Runtime Complexity: O(n)
//Space Complexity: O(n)
public class WaveArray {
	public static void main(String[] args) {
		// List<Integer> lst = new ArrayList(Arrays.asList(1, 2, 3));
		List<Integer> lst = new ArrayList(Arrays.asList(8, 9, 2, 4));
		int sizeCondition = 0;
		if (lst.size() % 2 == 0) {
			sizeCondition = lst.size();
		} else {
			sizeCondition = lst.size() - 1;
		}
		for (int i = 0; i < sizeCondition; i++) {
			int temp = lst.get(i);
			lst.set(i, lst.get(i + 1));
			lst.set(i + 1, temp);
			i++;
		}
		System.out.println(lst);
	}
}
