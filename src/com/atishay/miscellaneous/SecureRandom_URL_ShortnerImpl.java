package com.atishay.miscellaneous;

import java.security.SecureRandom;

/*This problem was asked by Microsoft.

Implement a URL shortener with the following methods:

shorten(url), which shortens the url into a six-character alphanumeric string, such as zLg6wl.
restore(short), which expands the shortened string into the original url. If no such shortened string exists, return null.
Hint: What if we enter the same URL twice?*/

//This will create a random 6 character alphanumeric String.
//A basic core idea bheind Building URL Shortner.
public class SecureRandom_URL_ShortnerImpl {
	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		String string = "0123456789abcdefghijklmnopqrstuvwxyzABCADEFGHIJKLMNOPQRTUVWXYZ";

		StringBuilder randomStr = new StringBuilder();
		for (int i = 1; i <= 6; i++) {
			randomStr.append(string.charAt(rnd.nextInt(i)));
		}

		System.out.println(randomStr);
	}
}
