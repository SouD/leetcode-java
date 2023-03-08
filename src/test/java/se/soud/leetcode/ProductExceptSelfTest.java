package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class ProductExceptSelfTest {
    ProductExceptSelf solution;

    @Before
    public void before() throws Exception {
        solution = new ProductExceptSelf();
    }

    @Test
    public void testTopKFrequent() {
        assertArrayEquals(new int[] {24, 12, 8, 6},
                solution.productExceptSelf(new int[] {1, 2, 3, 4}));
        assertArrayEquals(new int[] {0, 0, 9, 0, 0},
                solution.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
    }

    @Test
    public void testTopKFrequent2() {
        assertArrayEquals(new int[] {24, 12, 8, 6},
                solution.productExceptSelf2(new int[] {1, 2, 3, 4}));
        assertArrayEquals(new int[] {0, 0, 9, 0, 0},
                solution.productExceptSelf2(new int[] {-1, 1, 0, -3, 3}));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
