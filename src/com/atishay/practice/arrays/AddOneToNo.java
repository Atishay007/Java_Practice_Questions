package com.atishay.practice.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddOneToNo {
	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		List<Integer> lst = new ArrayList<>();
		StringBuilder str = new StringBuilder(arr.length);
		for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
		}

		// BigInteger is used otherwise
		// The range is too big, it is throwing Number Format Exception.
		BigInteger no = new BigInteger(str.toString());
		no = no.add(BigInteger.ONE);

		String strFinalNo = String.valueOf(no);

		for (int i = 0; i < strFinalNo.length(); i++) {
			lst.add(Integer.valueOf(Character.toString(strFinalNo.charAt(i))));

		}

		System.out.println(lst);

	}
}
