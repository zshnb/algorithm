package leetcode;

import java.util.Arrays;

/**
 * 思路1：使用freq数组记录第一个字符串字符出现次数，然后遍历第二个字符串，把freq数组中相应字符出现次数--，最后判断freq是否全为0<br>
 * 思路2：使用map代替freq数组
 * */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[128];
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            freq[c]++;
        }
        char[] tChar = t.toCharArray();
        for (char c : tChar) {
            freq[c]--;
        }
        return Arrays.stream(freq).allMatch(it -> it == 0);
    }
}
