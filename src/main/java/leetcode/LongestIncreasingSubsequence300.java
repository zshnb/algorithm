package leetcode;

import java.util.Arrays;

/**
 * 思路1：dp解法，对于nums中每一个数，要想让它能组成最大子序列，必须找到它前面比它小的数，因此定义dpTable，含义是当前数的最大子序列长度，初始值为1
 * 然后循环nums数组，对于每一个数，找到它前面的比它小的数，然后对应dpTable的值=max(当前dpTable，比它小的数dpTable的值+1)
 * */
public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        int[] dpTable = new int[nums.length];
        Arrays.fill(dpTable, 1);
        dpTable[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dpTable[i] = Math.max(dpTable[i], dpTable[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i : dpTable) {
            max = Math.max(max, i);
        }
        return max;
    }
}
