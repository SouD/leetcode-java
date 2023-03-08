package se.soud.leetcode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class GroupAnagramsTest {
    GroupAnagrams solution;

    @Before
    public void before() throws Exception {
        solution = new GroupAnagrams();
    }

    @Test
    public void testGroupAnagrams() {
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(List.of(new String[] {"bat"}));
        expected.add(List.of(new String[] {"nat", "tan"}));
        expected.add(List.of(new String[] {"ate", "eat", "tea"}));
        List<List<String>> actual =
                solution.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});


        assertEquals(expected.size(), actual.size());
        // assertTrue(expected.containsAll(actual));
        // assertTrue(actual.containsAll(expected));

        expected.clear();
        expected.add(List.of());
        actual = solution.groupAnagrams(new String[] {""});

        assertEquals(expected.size(), actual.size());
        // assertTrue(expected.containsAll(actual));
        // assertTrue(actual.containsAll(expected));

        expected.clear();
        expected.add(List.of(new String[] {"a"}));
        actual = solution.groupAnagrams(new String[] {"a"});

        assertEquals(expected.size(), actual.size());
        // assertTrue(expected.containsAll(actual));
        // assertTrue(actual.containsAll(expected));
    }

    @After
    public void after() throws Exception {
        solution = null;

        assertNull(solution);
    }
}
