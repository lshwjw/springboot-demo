package com.example.demo;

import org.junit.Test;

import com.example.demo.model.User;

public class ReflectionTest {

	@Test
	public void test1() throws InstantiationException, IllegalAccessException {
		Class clazz = User.class;
		User user = (User) clazz.newInstance();
		System.out.println(user);
	}
}
