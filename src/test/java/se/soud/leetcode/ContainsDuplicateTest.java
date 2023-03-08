package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {
    ContainsDuplicate solution;

    @Before
    public void before() throws Exception {
        solution = new ContainsDuplicate();
    }

    @Test
    public void testContainsDuplicate() {
        assertEquals(true, solution.containsDuplicate(new int[] {1, 2, 3, 1}));
        assertEquals(false, solution.containsDuplicate(new int[] {1, 2, 3, 4}));
        assertEquals(true, solution.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
