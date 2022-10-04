package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路1：回溯，循环判断当前字符串从0到下标处的子字符串是否在字典中，在的话回溯下标处到结尾的子字符串
 * */
public class WordBreakII140 {
    Set<String> set;

    public List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        backtrace(s, new ArrayList<>(), result);
        return result;
    }

    private void backtrace(String s, List<String> path, List<String> result) {
        if (s.isEmpty()) {
            String sentence = String.join(" ", path);
            result.add(sentence);
            if (!path.isEmpty()) {
                path.remove(path.size() - 1);
            }
            return;
        }
        int i = 1;
        while (i <= s.length()) {
            if (set.contains(s.substring(0, i))) {
                path.add(s.substring(0, i));
                backtrace(s.substring(i), path, result);
            }
            i += 1;
        }
        if (!path.isEmpty()) {
            path.remove(path.size() - 1);
        }
    }
}
