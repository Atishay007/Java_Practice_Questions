package com.atishay.miscellaneous;

import java.io.Closeable;
import java.io.IOException;

public class AutoCloseableExample {

	public static void main(String[] args) throws Exception {
		try (TestMe2 testMe = new TestMe2()) {
			System.out.println("Working with TestMe");
		}
	}
}

class TestMe implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Resources are getting AutoClosed using AutCloseable.");
	}
}

class TestMe2 implements Closeable {
//It also has same functionality as AutoCloseable.
	@Override
	public void close() throws IOException {
		System.out.println("Resources are getting AutoClosed implementing Closesable interface.");
	}
}
