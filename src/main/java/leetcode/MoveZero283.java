package leetcode;

/**
 * 思路1：利用额外数组顺序存放所有原数组中的非0元素，剩下位置补0，Javaint数组默认值都是0，因此可以省略补0操作
 * 思路2：通过一个额外标记，标记当前数组非0元素下标，在正常遍历数组时，如果遇到非0元素，将其复制到额外标记下标，且额外标记下标往前移动，最后把剩下元素补0，
 * 或者把复制改为交换操作，省去补0的操作
 * */
public class MoveZero283 {
    public void moveZeroes1(int[] nums) {
        int[] nonZeros = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeros[index++] = nums[i];
            }
        }
        System.arraycopy(nonZeros, 0, nums, 0, nums.length);
    }

    public void moveZeroes2(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }
    }
}
