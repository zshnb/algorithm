package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 思路1：将数组倒序排序后，遍历判断
 * */
public class KLargestElement215 {
    public int findKthLargest1(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> list = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return list.get(k - 1);
    }
}
