package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用map记录数组3和数组4每一位相加的和以及次数，这里不用set记录就是因为set会丢失重复和的次数，然后嵌套循环数组1和数组2，每次判断数组1+数组2的值
 * 的负数是否存在map中，存在的话结果加上map记录的次数。
 * */
public class FourSum454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i : nums3) {
            for (int i1 : nums4) {
                map.put(i + i1, map.getOrDefault(i + i1, 0) + 1);
            }
        }
        for (int i : nums1) {
            for (int i1 : nums2) {
                if (map.containsKey(-(i + i1))) {
                    result += map.get(-(i + i1));
                }
            }
        }
        return result;
    }
}
