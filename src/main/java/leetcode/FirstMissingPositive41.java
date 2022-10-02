package leetcode;

/**
 * 思路1：使用计数数组，遍历原数组，把大于0的数在计数数组对应下标+1，然后遍历计数数组，返回第一个值为的下标
 * */
public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {
        int[] freq = new int[100000];
        for (int num : nums) {
            if (num > 0 && num < 100000) {
                freq[num] += 1;
            }
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
