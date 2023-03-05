package se.soud.leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int n: nums) {
            if (map.containsKey(n)) {
                return true;
            }

            map.put(n, true);
        }

        return false;
    }
}
