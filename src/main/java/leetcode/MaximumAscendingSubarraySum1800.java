package leetcode;

/**
 * 思路1：使用滑动窗口，控制窗口内为最大递增连续子数组，如果下一个元素不符合，重置窗口为下一个元素做起点
 * 思路2：动态规划，dpTable[i]表示nums[0..i]的最大递增子数组和，状态转移为，nums[i]是否比nums[i-1]大，如果大，更新dpTable[i]为dpTable[i-1]+nums[i]
 * 否则更新为nums[i];
 * */
public class MaximumAscendingSubarraySum1800 {
    public int maxAscendingSum(int[] nums) {
        int left = 0, right = 0;
        int maxSum = nums[0];
        int result = maxSum;
        while (right + 1 < nums.length) {
            if (nums[right] < nums[right + 1]) {
                maxSum += nums[right + 1];
                result = Math.max(result, maxSum);
                right += 1;
            } else {
                left = right + 1;
                right = left;
                result = Math.max(result, maxSum);
                maxSum = nums[left];
            }
        }

        return result;
    }

    public int maxAscendingSum2(int[] nums) {
        int[] dpTable = new int[nums.length];
        dpTable[0] = nums[0];
        int result = dpTable[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dpTable[i] = dpTable[i - 1] + nums[i];
            } else {
                dpTable[i] = nums[i];
            }
            result = Math.max(result, dpTable[i]);
        }
        return result;
    }
}
