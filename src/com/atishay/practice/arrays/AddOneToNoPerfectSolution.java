package com.atishay.practice.arrays;

/* 
 * Add 1 o no without using +,-,etc
 * 
 * ~, Bitwise Complement Operator: This is a unary operator which returns the
 * one’s compliment representation of the input value, i.e. with all bits
 * inversed.
 * 
 * Time Complexity: O(1) Space Complexity:O(1)
 * 
 * ~ is similar to (x+1) but negative representation.
 * 
 */
public class AddOneToNoPerfectSolution {
	public static void main(String[] args) {
		int no = 1;
		System.out.println("Final No: " + addOneToNo(no));
	}

	private static int addOneToNo(int no) {
		return (-(~no));
	}
}
