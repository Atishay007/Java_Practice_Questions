package com.atishay.miscellaneous;

import java.security.SecureRandom;

/*This problem was asked by Microsoft.

Implement a URL shortener with the following methods:

shorten(url), which shortens the url into a six-character alphanumeric string, such as zLg6wl.
restore(short), which expands the shortened string into the original URL. If no such shortened string exists, return null.
Hint: What if we enter the same URL twice?*/
//Ans: For this we can store the URL as key in HashMap and its respective URL Shortner as a value.
// We can check whether URL is same or not from HashMap and we can also check its value and
//can have validations on them.

//This will create a random 6 character alphanumeric String.
//A basic core idea behind Building URL Shortner.

//Article: https://www.baeldung.com/java-secure-random
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
