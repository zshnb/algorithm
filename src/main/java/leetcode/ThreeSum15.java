package leetcode;

import java.util.*;

/**
 * 思路1：先让数组排序，然后在遍历的时候当遇到当前元素与前一个元素相等时跳过，这样能保证结果元祖不重复，
 * 常规解法是3重循环暴力，但是在我们排序的基础上可以去除一重循环，当有a + b + c = 0时，如果下一个b还符合，那么下一个c一定比之前的c小，
 * 于是可以把b和c的遍历放在一个循环里做，b正向循环，c逆向循环，直到相遇为止
 * */
public class ThreeSum15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		int i = 0, j = 0, k;
		Arrays.sort(nums);
		for (i = 0;i < nums.length;i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			k = nums.length - 1;
			for (j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				while (j < k && nums[j] + nums[k] > -nums[i]) {
					k -= 1;
				}
				if (j == k) {
					break;
				}
				if (nums[i] + nums[j] + nums[k] == 0) {
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
				}
			}
		}
		return result;
	}
}
