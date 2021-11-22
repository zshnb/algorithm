package leetcode;

import java.util.*;

/**
 * 思路1：维护一个s1长度的窗口，用map判断窗口内的字符串是否等于s1
 * */
public class PermutationInString567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0;i < s2.length();i++) {
            int j = i + s1.length();
            if (j <= s2.length() && toMap(s2.substring(i, j)).equals(map)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusion2(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Set<Character> set = new HashSet<>();
        int[] freq = new int[128];
        int count = s1.length();
        for (char c : s1.toCharArray()) {
            freq[c] += 1;
            set.add(c);
        }
        int left = 0;
        int right = 0;
        while (right < s1.length()) {
            if (freq[s2.charAt(right)] > 0) {
                count -= 1;
            }
            freq[s2.charAt(right)] -= 1;
            right += 1;
        }
        right -= 1;
        if (count == 0) return true;
        while (right < s2.length()) {
            right += 1;
            if (right < s2.length() && freq[s2.charAt(right)] > 0) {
                count -= 1;
                freq[s2.charAt(right)] -= 1;
            }
            if (set.contains(s2.charAt(left))) {
                freq[s2.charAt(left)] += 1;
                if (freq[s2.charAt(left)] > 0) {
                    count += 1;
                }
            }
            if (count == 0) return true;
            left += 1;
        }
        return false;
    }

    private Map<Character, Integer> toMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
