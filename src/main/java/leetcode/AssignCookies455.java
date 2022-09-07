package leetcode;

import java.util.Arrays;

/**
 * 思路1：排序2个数组，从小孩数组的末尾开始向前扫描，饼干数组的索引也设置末尾（最大值处），如果遇到饼干能满足小孩，2个索引前进一格，否则说明当前饼干
 * 无法满足小孩，小孩索引前进一格
 * */
public class AssignCookies455 {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int gIndex = g.length - 1;
		int sIndex = s.length - 1;

		int count = 0;
		while (gIndex >= 0 && sIndex >= 0) {
			if (g[gIndex] <= s[sIndex]) {
				count += 1;
				gIndex -= 1;
				sIndex -= 1;
			} else {
				gIndex -= 1;
			}
		}
		return count;
	}
}
