package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		while (true) {
			System.out.println(new String("right"));
			System.out.println(new String("left"));
			System.out.println(new String("right"));
			System.out.println(new String("center"));
			System.out.println(new String("idea"));
			System.out.println(new String("game2"));
			System.out.println(new String("game"));
			new Thread().start();
		}
	}

}
