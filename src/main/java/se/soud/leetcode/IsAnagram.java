package se.soud.leetcode;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String sSorted = new String(sChars);
        String tSorted = new String(tChars);

        return sSorted.equals(tSorted);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];

        for (char c: s.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (char c: t.toCharArray()) {
            alphabet[c - 'a']--;

            if (alphabet[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
