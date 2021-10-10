package leetcode;

/**
 * 思路1：使用额外数组储存原数组中所有该留下的元素，同时记录额外数组长度作为返回值，最后用额外数组覆盖原数组<br>
 * 思路2：定义额外标记位，在扫描原数组的时候，如果遇到待删除的数字，将其与标记位处数字交换，然后标记位处向前移动，
 * 这里有个优化的点是在交换时判断索引，不相等时才交换，防止原地交换
 * */
public class RemoveElement27 {
    public int removeElement1(int[] nums, int val) {
        int[] remains = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                remains[index++] = nums[i];
            }
        }
        System.arraycopy(remains, 0, nums, 0, remains.length);
        return index;
    }

    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                // 优化原地交换的情况
                if (i != index) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    index++;
                } else {
                    index++;
                }
            }
        }
        System.arraycopy(nums, index, nums, 0, nums.length - index);
        return nums.length - index;
    }
}
