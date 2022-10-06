package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：暴力枚举，外层从0到数组末尾，内存从外层起点到数组末尾，计算内层循环时数组的和是否匹配
 * 思路2：前缀和+hash，在遍历数组时累加当前遍历元素的和，把和放进hash表，然后判断当前和减去k的和是否在hash表里，在的话加上hash里存的计数
 * */
public class SubarraySumEqualsK560 {

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    result += 1;
                }
            }
            sum = 0;
        }
        return result;
    }

    public int subarraySum2(int[] nums, int k) {
        Map<Integer, Integer> partialSumWithCount = new HashMap<>();
        partialSumWithCount.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int i : nums) {
            sum += i;
            int remainSum = sum - k;
            if (partialSumWithCount.containsKey(remainSum)) {
                result += partialSumWithCount.get(remainSum);
            }
            partialSumWithCount.put(sum, partialSumWithCount.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
