package com.atishay.performance.jit;

//Proof that JIT(Just in Time Compiler) works on method.
//It analyze and then convert the repeated method
//into machine code, hence it will work faster.

public class JIT_Performance {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		for (Integer i = 1; i <= 123456789; i++) {
			if (i == null) {
			}
		}

		System.out.println("Time taken for checking null condition: " + (System.currentTimeMillis() - startTime));

		startTime = System.currentTimeMillis();
		for (Integer i = 1; i <= 123456789; i++) {
			if (isEmpty(i)) {
			}
		}
		System.out.println("Time taken for checking IsEmpty(): " + (System.currentTimeMillis() - startTime));
	}

	static boolean isEmpty(Object obj) {
		return obj == null;
	}
}
