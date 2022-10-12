package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> needCharWithCount = new HashMap<>();
        Map<Character, Integer> windowCharWithCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            needCharWithCount.put(c, needCharWithCount.getOrDefault(c, 0) + 1);
        }

        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        int targetCount = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        while (right < chars.length) {
            char ch = s.charAt(right);
            right += 1;
            if (needCharWithCount.containsKey(ch)) {
                windowCharWithCount.put(ch, windowCharWithCount.getOrDefault(ch, 0) + 1);
                if (needCharWithCount.get(ch).equals(windowCharWithCount.get(ch))) {
                    targetCount += 1;
                }
            }
            while (targetCount == needCharWithCount.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                ch = s.charAt(left);
                left += 1;
                if (needCharWithCount.containsKey(ch)) {
                    if (needCharWithCount.get(ch).equals(windowCharWithCount.get(ch))) {
                        targetCount -= 1;
                    }
                    windowCharWithCount.put(ch, windowCharWithCount.get(ch) - 1);
                }
            }
        }

        if (len == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + len);
    }
}
