package com.atishay.miscellaneous;

public class ShiftOperators {
	public static void main(String[] args) {

		System.out.println(Integer.toBinaryString(51));
		// Left shift Operator Adds 0 in the end.
		// In the below example, it will add 3 0's in the end.
		System.out.println(Integer.toBinaryString(51 << 3));
		System.out.println("No Present:" + (4 << 2));

		System.out.println("Performing Right Shift");
		System.out.println(Integer.toBinaryString(51));
		// Right shift operator shift the bits to the right.
		// Means it removes the bits from the last
		// If you keep shifting the bits, there will be stage
		// when it reaches to 0 and the output will be 0.
		System.out.println(Integer.toBinaryString(51 >> 3));

		System.out.println("Output will be 0");
		System.out.println(Integer.toBinaryString(51 >> 7));
	}
}
