package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {
    PalindromeNumber solution;

    @Before
    public void before() throws Exception {
        solution = new PalindromeNumber();
    }

    @Test
    public void testMyAtoi() {
        assertEquals(true, solution.isPalindrome(121));
        assertEquals(false, solution.isPalindrome(-121));
        assertEquals(false, solution.isPalindrome(123));
        assertEquals(true, solution.isPalindrome(0));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
