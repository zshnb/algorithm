package leetcode;


/**
 * 思路1：双指针遍历判断
 *
 * */
public class ValidPalindrome125 {
    public boolean isPalindrome1(String s) {
        if (s.isEmpty() || s.isBlank()) return true;
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            while (l < s.length() && (s.charAt(l) < 'A' || s.charAt(l) > 'Z') && (s.charAt(l) < 'a' || s.charAt(l) > 'z') && (s.charAt(l) < '0' || s.charAt(l) > '9')) {
                l++;
            }
            while (r >= 0 && (s.charAt(r) < 'A' || s.charAt(r) > 'Z') && (s.charAt(r) < 'a' || s.charAt(r) > 'z') && (s.charAt(r) < '0' || s.charAt(r) > '9')) {
                r--;
            }
            if (l < s.length() && r >= 0 && s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
