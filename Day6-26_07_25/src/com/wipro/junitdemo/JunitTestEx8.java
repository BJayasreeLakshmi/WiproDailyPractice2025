package com.wipro.junitdemo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JunitTestEx8 {
	
	@Test
	void test() {
		String input = null;

        assertThrows(NullPointerException.class, () -> {
            input.toUpperCase();
        });
	}

}
