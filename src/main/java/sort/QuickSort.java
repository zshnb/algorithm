package sort;

import util.SwapUtil;

public class QuickSort {
    public void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int l, int r) {
        if (l >= r) return;
        int p = partition(nums, l, r);
        sort(nums, l, p - 1);
        sort(nums, p + 1, r);
    }

    /**
     * 对nums[l...r]部分进行partition，返回partition后正确的下标，在下标前的元素都小于下标处元素，下标后的元素都大于下标处元素
     * */
    private int partition(int[] nums, int l, int r) {
        int cursor = nums[l];
        int i = l + 1, j = l;
        while (i <= r) {
            if (nums[i] < cursor) {
                SwapUtil.swap(nums, i, j + 1);
                j += 1;
            }
            i += 1;
        }
        SwapUtil.swap(nums, l, j);
        return j;
    }
}
