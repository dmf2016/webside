package com.webside.util;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		for (;;) {
			for (int i = 0; i < 1000000; i++) {
				Thread.sleep(10);
			}
		}
	}
}
