package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class TopKFrequentTest {
    TopKFrequent solution;

    @Before
    public void before() throws Exception {
        solution = new TopKFrequent();
    }

    @Test
    public void testTopKFrequent() {
        assertArrayEquals(new int[] {1, 2}, solution.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[] {1}, solution.topKFrequent(new int[] {1}, 1));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
