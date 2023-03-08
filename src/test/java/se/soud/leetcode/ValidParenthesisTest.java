package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisTest {
    ValidParenthesis solution;

    @Before
    public void before() throws Exception {
        solution = new ValidParenthesis();
    }

    @Test
    public void testIsValid() {
        assertEquals(true, solution.isValid("()"));
        assertEquals(true, solution.isValid("()[]{}"));
        assertEquals(false, solution.isValid("(]"));
        assertEquals(false, solution.isValid("("));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
