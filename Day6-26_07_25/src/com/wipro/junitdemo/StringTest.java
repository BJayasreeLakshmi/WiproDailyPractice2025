package com.wipro.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {
	
	String str=null;

	@Test
	void test() {
		assertThrows(NullPointerException.class, () -> str.toUpperCase());
	}

}
