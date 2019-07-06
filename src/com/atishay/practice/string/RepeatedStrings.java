package com.atishay.practice.string;

import java.math.BigDecimal;

public class RepeatedStrings {
	public static void main(String[] args) {
		// System.out.println(getCountOfRepeatedStrings());

		getCountOfRepeatedStrings();
	}

	private static void getCountOfRepeatedStrings() {

		String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
		int count = 0;
		long n = 549382313570l;
		if (s.length() < 1 && s.length() > 100) {
			// return 0;
		}

		if (n < 1 && n > 1000000000000l) {
			// return 0;
		}

		if (s.length() == 1 && s.charAt(0) == 'a') {
			// return n;
		} else if (s.length() == 1 && s.charAt(0) != 'a') {
			// return 0;
		}

		for (int i = 0; i < s.length() && n > 0; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		BigDecimal f = new BigDecimal(n * count);
		BigDecimal len = new BigDecimal(s.length());

		System.out.println(f.divide(len).longValue());

	}
}
