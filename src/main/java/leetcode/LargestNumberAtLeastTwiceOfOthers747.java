package leetcode;

/**
 * 思路1：遍历数组，找出最大的数和第二大的数，判断最大数是否是第二大数的2倍，是就返回最大数的下标
 * */
public class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        if (nums.length < 2) return 0;
        int max = -1, secondMax = -1;
        int maxIndex = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        if (secondMax == 0) return maxIndex;
        return max / secondMax >= 2 ? maxIndex : -1;
    }
}
