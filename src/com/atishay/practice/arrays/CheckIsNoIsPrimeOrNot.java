package com.atishay.practice.arrays;

//Runtime complexity: O(n)
//Space complexity: O(n)
//Prime No is that no which is divisible by 1 or by itself.
public class CheckIsNoIsPrimeOrNot {
	public static void main(String[] args) {
		int no = 2;
		int b = 2;
		boolean isPrime = true;

		while (b <= no / 2) {
			if (no % b == 0) {
				isPrime = false;
				break;
			}
			b++;
		}

		if (isPrime) {
			System.out.println("No. is Prime");
		} else {
			System.out.println("No. is not Prime");
		}

	}
}
