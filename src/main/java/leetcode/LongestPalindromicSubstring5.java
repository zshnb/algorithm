package leetcode;

/**
 * 思路1：暴力遍历，判断子字符串是否为回文，是的话判断是否最长
 * */
public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {
        if (s.isEmpty()) return s;
        if (s.length() == 1) return s;
        int max = -1;
        int maxLeft = 0, maxRight = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isValid(s.substring(i, j))) {
                    if (s.substring(i, j).length() > max) {
                        max = s.substring(i, j).length();
                        maxLeft = i;
                        maxRight = j;
                    }
                }
            }
        }
        return s.substring(maxLeft, maxRight);
    }

    private boolean isValid(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[s.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
