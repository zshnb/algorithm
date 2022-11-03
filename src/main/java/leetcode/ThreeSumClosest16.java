package leetcode;

import java.util.Arrays;

/**
 * 思路1：数组排序，在遍历数组时，使用双指针指向当前元素后面区间两端，对3个下标元素处求和，取和与target最小的，然后判断和如果大于target, 末尾指针前移，否则开头指针前移
 * */
public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        int i = 0, j = 0, k;
        int best = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (i = 0;i < nums.length;i++) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(target - sum) < Math.abs(target - best)) {
                    best = sum;
                }
                if (sum > target) {
                    k -= 1;
                } else if (sum < target) {
                    j += 1;
                }
            }
        }
        return best;
    }
}
