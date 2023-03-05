package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix solution;

    @Before
    public void before() throws Exception {
        solution = new LongestCommonPrefix();
    }

    @Test
    public void testLongestCommonPrefix() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "car", "plane"}));
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
