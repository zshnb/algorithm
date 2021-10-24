package leetcode;

import java.util.Arrays;

/**
 * 思路1：使用二分查找，如果存在直接返回索引，否则返回二分查找返回值-1
 * */
public class SearchInsertPosition35 {
    public int searchInsert1(int[] nums, int target) {
        int targetIndex = Arrays.binarySearch(nums, target);
        return targetIndex >= 0 ? targetIndex : -targetIndex - 1;
    }
}
