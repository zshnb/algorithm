package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：暴力遍历所有子字符串，对每个子字符串计算唯一字符个数
 * */
public class CountUniqueCharacters828 {
	private Map<String, Integer> subStringWithCount = new HashMap<>();
	public int uniqueLetterString(String s) {
		int result = 0;
		int left = 0, right = 0;
		while (left < s.length()) {
			String subString = s.substring(left, right + 1);
			if (subStringWithCount.containsKey(subString)) {
				result += subStringWithCount.get(subString);
			} else {
				result += countUniqueChars(subString);
			}
			right += 1;
			if (right == s.length()) {
				left += 1;
				right = left;
			}
		}
		return result;
	}

	private int countUniqueChars(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int result = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result += 1;
			}
		}
		subStringWithCount.put(s, result);
		return result;
	}
}
