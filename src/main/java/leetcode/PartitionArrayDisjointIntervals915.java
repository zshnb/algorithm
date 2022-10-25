package leetcode;

/**
 * 思路1：维护index用来作为左右分隔点，在遍历过程中需要记录遇到的最大值，同时记录leftMax，初始为第一个值，当遇到数字小于leftMax，说明此处是属于左侧的，更新index以及leftMax为最大值
 * */
public class PartitionArrayDisjointIntervals915 {
    public int partitionDisjoint(int[] nums) {
        int index = 0, max = nums[0], leftMax = max;
        for (int i = 1; i < nums.length; i++) {
            if (leftMax > nums[i]) {
                index = i;
                leftMax = max;
            } else {
                max = Math.max(max, nums[i]);
            }
        }
        return index + 1;
    }

    public int partitionDisjoint2(int[] nums) {
        int index = 0, leftMax = nums[0], max = leftMax;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] <= leftMax) {
                index += 1;
            }
        }
        return index + 1;
    }
}
