package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 思路1：暴力，对于每一个nums2[i]，从nums1中找到一个比它大的最小数，如果找不到，就拿nums1中最小的数[超时]
 * 思路2：田忌赛马，对nums1排序，创建nums2下标ids，按照nums2中的数大小进行排序，设置left和right指向ids的头和尾（nums2最小和最大）
 * 遍历nums1，比较nums1的数是否大于nums2最小的数，是的话把nums1的数放在nums2最小数的下标位置上，否则把nums1的数放在nums2最大数的下标位置上
 * */
public class AdvantageShuffle870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int swapIndex = 0;
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        boolean hasPositiveDiff = false;
        while (i < nums1.length) {
            swapIndex = i;
            for (j = i;j < nums1.length;j++) {
                int tempDiff = nums1[j] - nums2[i];
                if (tempDiff > 0 && tempDiff < diff) {
                    swapIndex = j;
                    diff = tempDiff;
                    hasPositiveDiff = true;
                } else {
                    if (nums1[j] < min) {
                        minIndex = j;
                        min = nums1[j];
                    }
                }
            }
            if(!hasPositiveDiff) {
                int temp = nums1[i];
                nums1[i] = nums1[minIndex];
                nums1[minIndex] = temp;
            } else if (swapIndex != i) {
                int temp = nums1[i];
                nums1[i] = nums1[swapIndex];
                nums1[swapIndex] = temp;
            }
            i += 1;
            hasPositiveDiff = false;
            min = Integer.MAX_VALUE;
            diff = Integer.MAX_VALUE;
        }
        return nums1;
    }

    public int[] advantageCount2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Integer[] ids = new Integer[nums2.length];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
        Arrays.sort(ids, Comparator.comparingInt(o -> nums2[o]));
        int left = 0, right = ids.length - 1;
        int[] result = new int[ids.length];
        for (int x : nums1) {
            if (x > nums2[ids[left]]) {
                result[ids[left]] = x;
                left += 1;
            } else {
                result[ids[right]] = x;
                right -= 1;
            }
        }
        return result;
    }
}
