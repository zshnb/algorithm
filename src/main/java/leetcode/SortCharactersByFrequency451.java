package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 思路1：使用map记录每个字符出现次数，然后对map按照value降序排序，最后遍历map，拼接字符<br>
 * 思路2：使用freq数组记录每个字符出现次数，然后用选择排序的思想，每次从freq数组中选出最多次数的字符，拼接字符串，拼完把相应记录置为0
 * */
public class SortCharactersByFrequency451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = map.entrySet().stream().sorted((o1, o2) -> {
            int valueCompareResult = o2.getValue().compareTo(o1.getValue());
            if (valueCompareResult == 0) {
                return o2.getKey().compareTo(o1.getKey());
            }
            return valueCompareResult;
        }).collect(Collectors.toList());

        StringBuilder stringBuilder = new StringBuilder("");
        list.forEach(it -> {
            int value = it.getValue();
            while (value > 0) {
                stringBuilder.append(it.getKey());
                value--;
            }
        });
        return stringBuilder.toString();
    }
}
