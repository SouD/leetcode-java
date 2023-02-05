package se.soud.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Shouldve really been called "LengthOfLongestNonRepeatingSubstring"
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        StringBuilder substr = new StringBuilder("");
        ArrayList<String> substrs = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            substr.append(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                if (substr.indexOf(Character.toString(s.charAt(j))) == -1) {
                    substr.append(s.charAt(j));
                } else {
                    break;
                }
            }

            substrs.add(substr.toString());
            substr.setLength(0);
        }

        if (substrs.size() == 1) {
            return substrs.get(0).length();
        }

        Collections.sort(substrs, (a, b)->Integer.compare(b.length(), a.length()));

        return substrs.get(0).length();
    }
}
