package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LengthOfLongestSubstringTest {
    LengthOfLongestSubstring solution;

    @Before
    public void before() throws Exception {
        solution = new LengthOfLongestSubstring();
    }

    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabc"));
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
