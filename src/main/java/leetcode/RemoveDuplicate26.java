package leetcode;

/**
 * 思路1：定义额外数组，存放不重复的数字，额外数组首位跟原数组一致，额外数组和原数组下标从1开始，遍历原数组，如果当前
 * 值大于额外数组下标-1处的值（因为有序），把当前值设置进额外数组下标处<br>
 * 思路2：下标的使用与思路1一致，去掉额外数组，改为将当前下标处的值覆盖额外下标处的值
 * */
public class RemoveDuplicate26 {
    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] distinct = new int[nums.length];
        distinct[0] = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (distinct[index - 1] < nums[i])    {
                distinct[index] = nums[i];
                index++;
            }
        }
        System.arraycopy(distinct, 0, nums, 0, nums.length);
        return index;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0)
            return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i])    {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
