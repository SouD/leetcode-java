package se.soud.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class ZigZagConversionTest {
    ZigZagConversion solution;

    @Before
    public void before() throws Exception {
        solution = new ZigZagConversion();
    }

    @Test
    public void testConvert() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("PYAIHRNAPLSIIG", solution.convert("PAYPALISHIRING", 2));
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        assertEquals("A", solution.convert("A",1));
    }

    @After
    public void after() throws Exception {
        solution = null;
        
        assertNull(solution);
    }
}
