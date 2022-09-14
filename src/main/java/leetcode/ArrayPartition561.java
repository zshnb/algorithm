package leetcode;

import java.util.Arrays;

/**
 * 思路1：先排序，然后跳着取数，求和
 * 思路2：使用桶排序，把给定的数组放入桶中，然后遍历桶，标记遇到的第一个元素，加上值
 * */
public class ArrayPartition561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public int arrayPairSum2(int[] nums) {
        int sum = 0;
        int maxValue = 10000;
        int[] bucket = new int[maxValue * 2 + 1];
        for (int num : nums) {
            bucket[num + maxValue]++;
        }

        boolean first = true;
        for (int i = -maxValue;i <= maxValue;) {
            if (bucket[i + maxValue] == 0) {
                i += 1;
                continue;
            }
            if (first) {
                sum += i;
                first = false;
            } else {
                first = true;
            }
            bucket[i + maxValue] -= 1;
        }
        return sum;
    }
}
