package se.soud.leetcode;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int step = (numRows << 1) - 2;
        int length = s.length();

        StringBuilder str = new StringBuilder();

        for (int row = 0; row < numRows; row++) {
            for (int i = row; i < length; i += step) {
                str.append(s.charAt(i));

                if (row != 0 && row != numRows - 1 && i + step - (row << 1) < length) {
                    str.append(s.charAt(i + step - (row << 1)));
                }
            }
        }

        return str.toString();
    }
}
