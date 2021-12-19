package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 按照题目给的规则构造出二维数组，然后遍历出结果
 * */
public class ZigZagConversion6 {
	public String convert(String s, int numRows) {
		if (numRows == 1) return s;
		List<List<Character>> matrix = new ArrayList<>();
		IntStream.range(0, numRows).forEach(it -> matrix.add(new ArrayList<>()));
		int i = 0, currentIndex = 0;
		char[] chars = s.toCharArray();
		while (i >= 0 && currentIndex < s.length()) {
			while (currentIndex < s.length() && i < numRows) {
				matrix.get(i).add(chars[currentIndex]);
				i += 1;
				currentIndex += 1;
			}
			i -= 2;
			while (currentIndex < s.length() && i > 0) {
				matrix.get(i).add(chars[currentIndex]);
				i -= 1;
				currentIndex += 1;
			}
		}
		StringBuilder sb = new StringBuilder("");
		matrix.forEach(it -> {
			it.forEach(sb::append);
		});
		return sb.toString();
	}
}
