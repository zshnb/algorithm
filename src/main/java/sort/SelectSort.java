package sort;

import util.SwapUtil;

public class SelectSort {
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            // 寻找[i, nums.length - 1]中最小值的下标
            for (int j = i + 1;j < nums.length;j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            // 如果最小的不是当前元素再交换
            if (i != min) {
                SwapUtil.swap(nums, i, min);
            }
        }
    }
}
