package leetcode;

/**
 * 滑动窗口，定义l和r，初始情况下窗口长度为0，在循环过程中判断窗口内元素和是否>target，如果大于，让当前和减去nums[l]，然后l++，否则
 * r++，当前和加上nums[r]，如果当前和>target，判断一下当前窗口长度是否最小，是的话记录一下，直到l移动到末尾循环结束
 * */
public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = -1;
        int sum = 0;
        int res = nums.length + 1;
        while (i < nums.length) {
            if (j + 1 < nums.length && sum < target) {
                j++;
                sum += nums[j];
            } else {
                sum -= nums[i];
                i++;
            }
            if (sum >= target) {
                res = Math.min(res, j - i + 1);
            }
        }
        if (sum < target && res == nums.length + 1) {
            return 0;
        }
        return res;
    }
}
