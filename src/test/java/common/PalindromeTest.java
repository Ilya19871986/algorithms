package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ikiselev 13.11.2023
 */
public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void isPalindromeTest() {
        assertTrue(palindrome.isPalindrome1(121));
        assertFalse(palindrome.isPalindrome1(-121));
        assertFalse(palindrome.isPalindrome1(10));
    }

}
