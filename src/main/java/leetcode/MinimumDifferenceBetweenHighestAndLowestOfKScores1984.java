package leetcode;

import java.util.Arrays;

/**
 * 思路1：排序，然后遍历数组，每次计算相隔k个距离的插值，返回最小
 * */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984 {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + k - 1;
            if (j < nums.length) {
                min = Math.min(min, Math.abs(nums[i] - nums[j]));
            }
        }
        return min;
    }
}
