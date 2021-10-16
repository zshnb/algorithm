package leetcode;

import java.util.*;

/**
 * 思路1：遍历字符串，同时记录当前不重复的最长子串，每次向后看一个字符，并把字符加入子串，如果后一个字符存在子串，把子串从重复字符后一处开始截取，
 * 每次循环都需要计算最长长度<br>
 * 思路2：双指针l，r，使用map记录当前双指针范围内每个字符出现的次数，每次循环检查r+1处字符是否存在map中，不存在的话r++，然后把新字符加入map，否则
 * 从map中把l处字符数减一，然后l++，循环直到l到字符串末尾
 * */
public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring1(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1 || s.chars().boxed().distinct().count() == 1) return 1;
        char[] array = s.toCharArray();
        StringBuilder longest = new StringBuilder();
        int r = -1;
        int max = 0;
        while (r < array.length) {
            if (r + 1 < array.length && longest.toString().indexOf(array[r + 1]) != -1) {
                longest = new StringBuilder(longest.substring(longest.toString().indexOf(array[r + 1]) + 1));
            }
            if (r + 1 < array.length) {
                longest.append(array[r + 1]);
            }
            max = Math.max(max, longest.length());
            r++;
        }
        if (longest.toString().equals(s)) return s.length();
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1 || s.chars().boxed().distinct().count() == 1) return 1;
        int l = 0;
        int r = -1;
        int max = 0;
        Map<Character, Integer> freq = new HashMap<>();
        while (l < s.length()) {
            if (r + 1 < s.length() && (!freq.containsKey(s.charAt(r + 1)) || freq.get(s.charAt(r + 1)) == 0)) {
                if (!freq.containsKey(s.charAt(r + 1))) {
                    freq.put(s.charAt(r + 1), 1);
                } else {
                    freq.put(s.charAt(r + 1), freq.get(s.charAt(r + 1)) + 1);
                }
                r++;
            } else {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
