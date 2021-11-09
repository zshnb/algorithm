package leetcode;

import java.util.Arrays;

/**
 * 思路1：排序后返回头元素<br>
 * 思路2：如果数组中间元素小于最右边元素，说明最小值不在右边，将中间设为最右边，如果中间元素大于最右边，说明最小值不在左边，将中间设为左边
 * */
public class FindMinimumInRotatedSortedArray153 {
    public int findMin1(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }

    public int findMin2(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public int findMin3(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[0] < nums[right]) return nums[0];
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
