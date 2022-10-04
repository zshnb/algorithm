package leetcode;

/**
 * 思路1：动态规划，dpTable的值表示含有对应数组下标值的最大子数组和状态转移方程为dpTable[i] = Math.max(nums[i], dpTable[i - 1] + nums[i])
 * 即如果加上当前元素使得最大和变小，那么选择放弃加上，使当前元素变成最大子数组和
 * */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] dpTable = new int[nums.length];
        dpTable[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dpTable[i] = Math.max(nums[i], dpTable[i - 1] + nums[i]);
        }

        int max = -100000;
        for (int i : dpTable) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
