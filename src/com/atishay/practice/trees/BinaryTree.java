package com.atishay.practice.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.removeIf(a->a==10);
		System.out.println(lst);
	}
}
