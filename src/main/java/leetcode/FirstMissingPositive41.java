package leetcode;

import java.util.Arrays;

public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > 0) {
                if (num < firstMin) {
                    secondMin = firstMin;
                    firstMin = num;
                } else if (num < secondMin) {
                    secondMin = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }
        if (firstMin > 1) {
            return 1;
        }
        if (max - firstMin == nums.length - 1) {
            return max + 1;
        }
        if (secondMin - firstMin == 1) {
            return secondMin + 1;
        } else {
            return firstMin + 1;
        }
    }

    public int firstMissingPositive2(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] <= 0) {
                return 1;
            }
            return nums[0] > 1 ? 1 : nums[0] + 1;
        }
        Arrays.sort(nums);
        if (nums[nums.length - 1] <= 0) {
            return 1;
        }
        int positiveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveIndex = i;
                break;
            }
        }
        for (int i = positiveIndex;i < nums.length;i++) {
            if (nums[i] > 1) {
                return 1;
            }
            if (i + 1 < nums.length && nums[i + 1] - nums[i] > 1) {
                return nums[i] + 1;
            }
        }
        return 1;
    }
}
