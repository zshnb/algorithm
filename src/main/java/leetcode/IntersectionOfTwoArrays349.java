package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 思路1：使用set，第一个set存储第一个数组所有元素，遍历第二个数组，如果数组元素存在第一个set中，把元素加入结果set中，最后返回
 * */
public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] nums = new int[res.size()];
        int index = 0;
        for (Integer re : res) {
            nums[index++] = re;
        }
        return nums;
    }
}
