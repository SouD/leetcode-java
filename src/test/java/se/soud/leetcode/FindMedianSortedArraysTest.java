package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindMedianSortedArraysTest {
    FindMedianSortedArrays solution;

    @Before
    public void before() throws Exception {
        solution = new FindMedianSortedArrays();
    }

    @Test
    public void testFindMedianSortedArrays() {
        assertEquals(
            2.0, 
            solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3}),
            0.001
        );

        assertEquals(
            3.0, 
            solution.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5}),
            0.001
        );

        assertEquals(
            2.5, 
            solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}),
            0.001
        );
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
