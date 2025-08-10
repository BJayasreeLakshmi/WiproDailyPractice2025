package com.wipro.junitdemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class JunitTestEx9 {
	private boolean isLowerCase(String str) {
        return str.equals(str.toLowerCase());
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "java", "test"})
    void LowerCase(String input) {
        assertTrue(isLowerCase(input), "String not lowercase: " + input);
    }

}
