package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 思路1：先对nums数组排序，题目表达的意思是数组长度为给定数组的长度+2,挖掉的2个数即为答案。且数组元素是单调递增，因此可以把nums填充进完整数组中，
 * 然后在填充的过程中找出2个不存在nums里的数，此方法的时间空间复杂度不符合题目要求
 * 思路2：不排序，先对待复原数组求和，然后把和减去nums数组的数，剩下的sum就是最后的2数之和，把nums数组元素放进set里，然后从1开始遍历到预期数组末尾，
 * 判断sum减去当前元素的值是否在set里，在的话返回答案
 * */
public class MissingTwoLcci17_19 {
    public int[] missingTwo(int[] nums) {
        Arrays.sort(nums);
        int[] full = new int[nums.length + 2];
        int[] result = new int[2];
        int index = 0;
        int j = 0;
        for (int i = 0; i < full.length; i++) {
            if (j < nums.length && nums[j] == i + 1) {
                full[i] = nums[j];
                j += 1;
            } else {
                if (i > 0) {
                    full[i] = full[i - 1] + 1;
                } else {
                    full[i] = 1;
                }
                result[index] = full[i];
                index += 1;
                if (index >= 2) {
                    break;
                }
            }
        }
        return result;
    }

    public int[] missingTwo2(int[] nums) {
        int max = Math.max(nums[nums.length - 1], nums.length + 2);
        Set<Integer> inputSet = new HashSet<>();
        long sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        for (int num : nums) {
            inputSet.add(num);
            sum -= num;
        }

        for (int i = 1; i <= max; i++) {
            if (!inputSet.contains(i)) {
                return new int[]{i, (int)sum - i};
            }
        }
        return new int[]{0, 0};
    }
}
