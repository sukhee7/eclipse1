package com.api.book.bootrestbook;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootrestbookApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void getBooksTest() {
		long a = 0;
		long b = 0;
		assertEquals(null, b, a);
	}

}
