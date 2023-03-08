package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringToIntegerTest {
    StringToInteger solution;

    @Before
    public void before() throws Exception {
        solution = new StringToInteger();
    }

    @Test
    public void testMyAtoi() {
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(0, solution.myAtoi("words and 987"));
        assertEquals(-1123, solution.myAtoi("-1123u3761867"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-91283472332"));
        assertEquals(3, solution.myAtoi("3.14159"));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("20000000000000000000"));
        assertEquals(0, solution.myAtoi("00000-42a1234"));
        assertEquals(12345678, solution.myAtoi("  0000000000012345678"));
        assertEquals(-1, solution.myAtoi("-000000000000000000000000000000000000000000000000001"));
        assertEquals(0, solution.myAtoi("+-12"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483648"));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
