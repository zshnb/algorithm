package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 思路1：使用list和set存放单词，不带.的查找从set中找，带.的查找通过正则匹配，长度一样且匹配上的返回true
 * 思路2：同时遍历待搜索单词和单词列表的每一个单词，如果字符相等或者待搜索单词当前字符为.继续，否则判定为false，查找下一个，一旦找到某个单词匹配返回true
 * */
public class DesignAddAndSearchWordsDataStructure211 {
    private List<String> strings;
    private Set<String> set;
    public DesignAddAndSearchWordsDataStructure211() {
        strings = new ArrayList<>();
        set = new HashSet<>();
    }

    public void addWord(String word) {
        strings.add(word);
        set.add(word);
    }

    public boolean search(String word) {
        if (word.contains(".")) {
            Pattern pattern = Pattern.compile(word);
            for (String string : strings) {
                if (word.length() == string.length() && pattern.matcher(string).find()) {
                    return true;
                }
            }
            return false;
        } else {
            return set.contains(word);
        }
    }

    public boolean search2(String word) {
        if (word.contains(".")) {
            boolean find = false;
            for (String string : strings) {
                if (string.length() == word.length()) {
                    char[] chars1 = string.toCharArray();
                    char[] chars2 = word.toCharArray();
                    for (int i = 0; i < chars1.length; i++) {
                        if (chars1[i] == chars2[i] || chars2[i] == '.') {
                            find = true;
                        } else {
                            find = false;
                            break;
                        }
                    }
                }
                if (find) {
                    return true;
                }
            }
            return find;
        } else {
            return set.contains(word);
        }
    }
}
