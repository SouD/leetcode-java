package se.soud.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        int n = strs[0].length();
        String str = strs[0];

        if (str.length() == 0) {
            return "";
        }

        int i = 0;
        boolean stop = false;

        for (; i < n; i++) {
            char c = strs[0].charAt(i);

            for (String s : strs) {
                if (s.charAt(i) != c) {
                    stop = true;
                    break;
                }
            }

            if (stop) {
                break;
            }
        }

        return strs[0].substring(0, i);
    }
}
