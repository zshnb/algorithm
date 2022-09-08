package leetcode;

/**
 * 思路1：使用状态值记录当前状态（波峰还是波谷），初始值不设置，在遍历数组时判断当前元素与前一个元素的差值是否与当前状态相符合（状态波峰，差值波谷）
 * 符合时长度+1，更新状态
 * */
public class WiggleSubsequence376 {
	public int wiggleMaxLength(int[] nums) {
		int i = 0;
		int res = 2;
		int mode = 0; // 0: 初始值，-1：波谷，1：波峰
		for (i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i-1]) break;
		}
		if (i == nums.length) {
			return 1;
		}


		for (i = 1;i < nums.length;i++) {
			if (nums[i] - nums[i - 1] > 0) {
				// 当前状态波谷，当前元素差值波峰
				if (mode == -1) {
					res += 1;
				}
				mode = 1; // 波峰
			} else if (nums[i] - nums[i - 1] < 0) {
				if (mode == 1) {
					res += 1;
				}
				mode = -1; // 波谷
			}
		}
		return res;
	}
}
