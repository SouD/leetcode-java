package se.soud.leetcode;

import java.util.ArrayList;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        if (s.chars().distinct().count() == 1) {
            return s;
        }

        ArrayList<String> strs = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            middleOut(s, i, i, strs);
            middleOut(s, i, i + 1, strs);
        }

        strs.sort((s1, s2) -> s1.length() - s2.length());

        return strs.get(strs.size() - 1);
    }

    public void middleOut(String s, int low, int high, ArrayList<String> strs) {
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            strs.add(s.substring(low, high + 1));
            low--;
            high++;
        }
    }
}
