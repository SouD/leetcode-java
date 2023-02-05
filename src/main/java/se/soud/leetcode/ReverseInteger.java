package se.soud.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        boolean lessThanZero = x < 0;
        String str = 
            new StringBuilder(
                Integer.toString(Math.abs(x))
            )
                .reverse()
                .insert(0, lessThanZero ? "-" : "")
                .toString();

        try {
            int answer = Integer.parseInt(str);
            
            return answer;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
