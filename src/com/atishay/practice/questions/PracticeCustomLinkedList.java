package com.atishay.practice.questions;

public class PracticeCustomLinkedList {

	public static void main(String[] args) {
		AtishayList<Integer> lst = new AtishayList<>();
		lst.add(10);
		//lst.add(20);
	//	lst.add(10);

		lst.printAllNodes();

		System.out.println("Size of List: " + lst.size());

		lst.remove(10);

		System.out.println("Size of List after removing duplicate elements: " + lst.size());
		
		lst.printAllNodes();

	}
}
