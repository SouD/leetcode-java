package se.soud.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);

        return x < 0 ? false : (new StringBuilder(s1))
            .reverse()
            .toString()
            .equals(s1);
    }
}
