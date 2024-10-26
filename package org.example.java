package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringProcessingTest {

    @Test
    void testStrong() {
        assertTrue(StringProcessing.strong("Password1!"), "Expected strong password to pass");
        assertFalse(StringProcessing.strong("pass"), "Expected weak password (too short) to fail");
        assertFalse(StringProcessing.strong("password"), "Expected weak password (no uppercase, no digit, no special) to fail");
        assertFalse(StringProcessing.strong("Password"), "Expected weak password (no digit, no special character) to fail");
    }

    @Test
    void testCalculateDigit() {
        assertEquals(2, StringProcessing.calculateDigit("I have 2 apples and 3 oranges."), "Expected 2 digits in sentence");
        assertEquals(0, StringProcessing.calculateDigit("Hello world!"), "Expected 0 digits in sentence without digits");
    }

    @Test
    void testCalculateWords() {
        assertEquals(5, StringProcessing.calculateWords("This is a test sentence."), "Expected 5 words in sentence");
        assertEquals(1, StringProcessing.calculateWords("Hello"), "Expected 1 word in single word sentence");
        assertEquals(0, StringProcessing.calculateWords(""), "Expected 0 words in empty string");
    }
}
