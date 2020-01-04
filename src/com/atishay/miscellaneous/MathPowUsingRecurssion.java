package com.atishay.miscellaneous;

public class MathPowUsingRecurssion {

	public static void main(String[] args) {
		int no = 2;
		int pow = 3;
		// This is acting as accumulator.
		int result = 1;

		System.out.println(mathPowRecurssion(no, pow, result));
	}

	private static int mathPowRecurssion(int no, int pow, int result) {
		// base condition in recursion.
		if (pow == 0) {
			return result;
		}

		result = result * no;

		// we have to return otherwise compilation error in which return didn't found.
		return mathPowRecurssion(no, pow - 1, result);
	}

}
