package se.soud.leetcode;

import static java.util.Map.entry;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if (s.length() < 2 || s.length() % 2 != 0) {
            return false;
        }

        Map<String, String> complement =
                Map.ofEntries(entry(")", "("), entry("}", "{"), entry("]", "["));
        Stack<String> stack = new Stack<String>();

        for (char c : s.toCharArray()) {
            String sc = String.valueOf(c);

            if (complement.containsValue(sc)) {
                stack.push(sc);
            }

            if (complement.containsKey(sc) && !stack.pop().equals(complement.get(sc))) {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
