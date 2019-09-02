package com.atishay.practice.arrays;

//RunTime O(n) , Space Complexity O(1)
public class ReverseNo {
	public static void main(String[] args) {
		System.out.println(reverseNo(198547));
	}

	private static int reverseNo(int n) {
		long rev = 0;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		// Special Case
		if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
			return 0;
		}

		return (int) rev;
	}
}
