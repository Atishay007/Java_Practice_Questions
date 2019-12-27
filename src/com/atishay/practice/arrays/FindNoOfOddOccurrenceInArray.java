package com.atishay.practice.arrays;

//Space Complexity: O(1) 
//RunTime Complexity: O(n)
//No. in array are repeated even no. of times.
//Find no. that is present only one or odd no. of time.
//Using XOR
public class FindNoOfOddOccurrenceInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4 };
		// Initialize this with 0.
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		System.out.println("No which is oddly present: " + result);
	}
}
