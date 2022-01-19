package leetcode;

/**
 * 思路1：遍历一次，记下2个位置
 * */
public class FindFirstAndLastPositionOfElementInSortedArray34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int[] position = new int[]{-1, -1};
        int left = -1, right = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (left == -1) {
                    left = i;
                    right = i;
                } else {
                    right = i;
                }
            }
        }
        position[0] = left;
        position[1] = right;
        return position;
    }

    // todo
    public int[] searchRange2(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int[] position = new int[]{-1, -1};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {

            }
        }
        position[0] = left;
        position[1] = right;
        return position;
    }
}
