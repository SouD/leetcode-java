package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {
    ReverseInteger solution;

    @Before
    public void before() throws Exception {
        solution = new ReverseInteger();
    }

    @Test
    public void testReverse() {
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(1534236469));
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
