package com.atishay.miscellaneous;

/*
 * 
1. <<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result.
Similar effect as of multiplying the number with some power of two.

2. >>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left
as a result. The leftmost bit depends on the sign of initial number. Similar effect as of dividing 
the number with some power of two.

3. >>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids 
left as a result. The leftmost bit is set to 0.

*/
public class ShiftOperators {
	public static void main(String[] args) {
		int a = 10;

		// Left shift: 10 * (2^1): Means Multiplication
		System.out.println(4 << 1); // result: 8
		// Left shift: 10 * (2 ^2)
		System.out.println(a << 1); // result: 4

		System.out.println("Right Shift results");
		// Right shift means division (/)
		// 10 / (2^1)
		System.out.println(a >> 1); // result:
		// 10 / (2^2)
		System.out.println(a >> 2); // result:
	}
}
