package leetcode;

import java.util.Arrays;

/**
 * 思路1：排序，最大3个数的乘积只会在最大的3个正数或者最小的2个负数*最大的正数中出现
 * 思路2：根据思路1，只要得到最大的3个数以及最小的2个数就能得出结果，因此在一次遍历中得到5个数即可
 * */
public class MaximumProductOfThreeNumbers628 {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }
    public int maximumProduct2(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // 最大的数
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                // 第二大的数
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                // 第三大的数
                max3 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
