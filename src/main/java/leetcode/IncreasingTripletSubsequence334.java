package leetcode;

/**
 * 思路1：a为数组中最小的数，b为仅大于a的数，在遍历过程中，始终保持这种关系
 * 直到遇到一个比b大的数，说明找到了符合要求的子序列
 * */
public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
