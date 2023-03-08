package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IsAnagramTest {
    IsAnagram solution;

    @Before
    public void before() throws Exception {
        solution = new IsAnagram();
    }

    @Test
    public void testIsAnagram() {
        assertEquals(true, solution.isAnagram("anagram", "nagaram"));
        assertEquals(false, solution.isAnagram("rat", "car"));
    }

    @Test
    public void testIsAnagram2() {
        assertEquals(true, solution.isAnagram2("anagram", "nagaram"));
        assertEquals(false, solution.isAnagram2("rat", "car"));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
