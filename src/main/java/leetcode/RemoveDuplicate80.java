package leetcode;

import java.util.Arrays;

/**
 * 思路1：定义额外数组，存放不重复的数字，同时定义计数器，用来判断当前值的个数是否>2，遍历原数组，如果当前值大于前一个值，重置计数器
 * 同时如果当前值大于等于额外数组下标处值，如果计数器<=2，将当前下标处值覆盖额外数组下标处值大于额外数组下标-1的值（因为有序），把当前值设置进原数组下标处<br>
 * 思路2：定义额外下标记录，保证[0, index]处元素符合条件，遍历原数组，如果当前值大于前一个值，重置计数器，同时当前值大于额外下标处值，
 * 且计数器<=2，将当前下标处的值覆盖额外数组下标处值
 */
public class RemoveDuplicate80 {
    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] distinct = new int[nums.length];
        Arrays.fill(distinct, -Integer.MAX_VALUE);
        int index = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                count = 1;
            }
            if (distinct[index] <= nums[i]) {
                if (count <= 2) {
                    distinct[index] = nums[i];
                    count++;
                    index++;
                }
            }
        }
        System.arraycopy(distinct, 0, nums, 0, nums.length);
        return index;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                count = 1;
            }
            if (nums[index] <= nums[i] && count <= 2) {
                nums[index++] = nums[i];
                count++;
            }
        }
        return index;
    }
}
