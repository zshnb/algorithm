package leetcode;

import java.util.*;

/**
 * 思路1：使用map记录字符串与所有和该字符串符合异位词要求的字符串列表，重点就在于如何判断2个字符串是否为异位词，可以将字符串按字母排序后再进行比较，
 * 如果是map中不存在的字符串，将排序后的字符串放入map，否则将其加入对应字符串的列表中
 * */
public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            List<String> value;
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(String.valueOf(chars))) {
                value = map.get(String.valueOf(chars));
            } else {
                value = new ArrayList<>();
            }
            value.add(str);
            map.put(String.valueOf(chars), value);
        }
        return new ArrayList<>(map.values());
    }
}
