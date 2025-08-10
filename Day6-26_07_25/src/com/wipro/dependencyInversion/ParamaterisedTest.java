package com.wipro.dependencyInversion;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamaterisedTest {

	
//	@Test
	@ParameterizedTest
	@ValueSource(strings={"jayasree","lakshmi"})
	void test(String input) {
		assertTrue(input.equals(input.toLowerCase()));
		
	}

	

}
