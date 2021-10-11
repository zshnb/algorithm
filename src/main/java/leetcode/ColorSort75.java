package leetcode;

import util.SwapUtil;

/**
 * 思路1：使用各种普通排序算法<br>
 * 思路2：使用计数排序，遍历一次，分别统计数字的次数，然后按0，1，2的顺序往原数组里放入对应次数的数字
 * */
public class ColorSort75 {
    public void sortColors1(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
            if (num == 1) {
                oneCount++;
            }
        }
        for (int i = 0;i < zeroCount;i++) {
            nums[i] = 0;
        }
        for (int i = zeroCount;i < zeroCount + oneCount;i++) {
            nums[i] = 1;
        }
        for (int i = zeroCount + oneCount;i < nums.length;i++) {
            nums[i] = 2;
        }
    }
    public void sortColors2(int[] nums) {
        int zeroIndex = -1;
        int twoIndex = nums.length;
        for (int i = 0;i < twoIndex;) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                SwapUtil.swap(nums, i, zeroIndex + 1);
                zeroIndex++;
                i++;
            } else if (nums[i] == 2) {
                SwapUtil.swap(nums, i, twoIndex - 1);
                twoIndex--;
            }
        }
    }
}
