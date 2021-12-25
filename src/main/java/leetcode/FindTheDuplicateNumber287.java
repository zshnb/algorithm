package leetcode;

/**
 * 思路1：使用频率数组记录每个数字出现频率，然后返回频率超过1的数字（使用了O(N)的空间，其实不符合题目要求）
 * */
public class FindTheDuplicateNumber287 {
	public int findDuplicate(int[] nums) {
		int[] freq = new int[nums.length];
		for (int num : nums) {
			freq[num] += 1;
		}
		int res = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1) {
				return i;
			}
		}
		return res;
	}
}
