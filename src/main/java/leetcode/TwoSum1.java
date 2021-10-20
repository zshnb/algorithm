package leetcode;

import java.util.*;

/**
 * 思路1：使用map记录数组元素与下标的关系(num -> i)，在遍历数组的时候，先从map中查询target-nums[i]存在与否，存在则返回下标，不存在往map中
 * 插入一条对应关系，在判断后才插入的原因是因为map不允许key重复，为了防止后面的key覆盖前面的key
 * */
public class TwoSum1 {
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetIndex = map.getOrDefault(target - nums[i], -1);
            if (targetIndex != -1 && targetIndex != i) {
                result[0] = i;
                result[1] = targetIndex;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
