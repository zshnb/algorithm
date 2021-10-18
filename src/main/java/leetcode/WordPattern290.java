package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * 思路1：使用2个有序map双向记录字符与字符串的关系，在遍历的时候，如果发现字符与字符串无关联，创建关联，否则获取各自关联对应的字符和字符串，如果任意
 * 一边关系不同，返回false
 * */
public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charWithString = new TreeMap<>();
        Map<String, Character> stringWithChar = new TreeMap<>();
        char[] patternChars = pattern.toCharArray();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        for (int i = 0; i < patternChars.length; i++) {
            if (!charWithString.containsKey(patternChars[i]) && !stringWithChar.containsKey(words[i])) {
                charWithString.put(patternChars[i], words[i]);
                stringWithChar.put(words[i], patternChars[i]);
            } else {
                String word = charWithString.getOrDefault(patternChars[i], "");
                char ch = stringWithChar.getOrDefault(words[i], ' ');
                if (!word.equals(words[i]) && ch != patternChars[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
