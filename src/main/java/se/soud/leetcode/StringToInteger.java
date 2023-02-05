package se.soud.leetcode;

public class StringToInteger {
    public int myAtoi(String s) {
        boolean signed = false;
        StringBuilder str = new StringBuilder();
        char c;
        char[] chars = s.trim()
            .toCharArray();

        for (int i = 0; i < chars.length; i++) {
            c = chars[i];

            if (!shouldReadChar(c)) {
                break;
            }

            if (isCharPlusOrMinus(c) && i > 0) {
                break;
            }

            if (isCharMinus(c)) {
                signed = true;
                continue;
            }

            if (isCharPlus(c) && i == 0) {
                continue;
            }

            if (str.length() == 0 && isCharZero(c)) {
                continue;
            }

            if (str.length() < 10) {
                str.append(c);
            } else {
                if (signed) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }

        if (str.length() == 0) {
            return 0;
        }

        try {
            int res = Integer.parseInt(str.toString());

            if (signed) {
                res = res * -1;
            }
    
            return res;
        } catch (NumberFormatException e) {
            if (signed) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    public boolean shouldReadChar(char c) {
        if (isCharDigit(c) || isCharPlusOrMinus(c)) {
            return true;
        }

        return false;
    }

    public boolean isCharDigit(char c) {
        return Character.isDigit(c);
    }

    public boolean isCharPlusOrMinus(char c) {
        return isCharPlus(c) || isCharMinus(c);
    }

    public boolean isCharPlus(char c) {
        return c == '+';
    }

    public boolean isCharMinus(char c) {
        return c == '-' ;
    }

    public boolean isCharZero(char c) {
        return c == '0' ;
    }
}
