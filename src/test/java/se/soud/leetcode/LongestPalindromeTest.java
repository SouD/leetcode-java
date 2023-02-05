package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeTest {
    LongestPalindrome solution;

    @Before
    public void before() throws Exception {
        solution = new LongestPalindrome();
    }

    @Test
    public void testLongestPalindrome() {
        for (Object[] o : provideStringAndExpectedLength()) {
            assertEquals((String) o[1], solution.longestPalindrome((String) o[0]));
        }
    }
    
    public static Object[][] provideStringAndExpectedLength() {
        return new Object[][] {
            { "bb", "bb" },
            { "a", "a" },
            { "eertree", "eertree" },
            { "efabcbatgaba", "abcba" }
        };
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
