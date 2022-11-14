package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 思路1：把2个字符串分割后的单词存入hash中，返回hash中只出现1次的单词
 * */
public class UncommonWordsTwoSentences884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");
        Map<String, Integer> strWithCount = new HashMap<>();
        for (String s : s1Array) {
            strWithCount.put(s, strWithCount.getOrDefault(s, 0) + 1);
        }
        for (String s : s2Array) {
            strWithCount.put(s, strWithCount.getOrDefault(s, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        strWithCount.forEach((s, count) -> {
            if (count < 2) {
                result.add(s);
            }
        });

        return result.toArray(new String[0]);
    }
}
