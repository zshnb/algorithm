package leetcode;

/**
 * 题目可以分解为求子数组中所有值小于right的子数组个数减去子数组中所有值小于left的子数组个数
 * 求子数组个数的方法是通过判断数组当前元素是否小于给定值，如果是，当前指向下标+1，否则当前指向下标为0，然后总数加上当前
 * 指向下标。其实就是组合求数，3个数组成的数组可以有1+2+3中组成方式
 * */
public class NumberOfSubarraysWithBoundedMaximum795 {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    public int count(int[] A, int bound) {
        int ans = 0, cur = 0;
        for (int x : A) {
            cur = x <= bound ? cur + 1 : 0;
            ans += cur;
        }
        return ans;
    }
}
