package com.example.demo;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() {
		String a = "dsfsfdf";
		System.out.println(a.toCharArray());
		System.out.println(a.getBytes());
		String b = new String(a.toCharArray());
		String c = new String(a.getBytes());
		System.out.println(b);
		System.out.println(c);
	}
}
