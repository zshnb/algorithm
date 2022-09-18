package leetcode;

/**
 * 思路1：for循环相加
 * 思路2：两路同时相加，前面后面往中间遍历
 * 思路3：使用前缀和，定义prefixSums数组，数组下标处的值表示从0到i处的元素和，初始化的时候构造好，然后求区间和时只需要right处的前缀和减去left处
 * 的前缀和（left != 0 时）即可
 * */
public class RangeSumQueryImmutable303 {
    private int[] nums;
    private int[] prefixSums;
    public RangeSumQueryImmutable303(int[] nums) {
        this.nums = nums;
        prefixSums = new int[nums.length + 1];
        prefixSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += nums[i];
        }
        return result;
    }

    public int sumRange2(int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int result = 0;
        int i = left, j = right;
        while (i <= j) {
            result = result + nums[i] + nums[j];
            i += 1;
            j -= 1;
            if (i == j && nums[i] != 0) {
                result -= nums[i];
            }
        }
        return result;
    }

    public int sumRange3(int left, int right) {
        if (left <= 0) {
            return prefixSums[right];
        }
        return prefixSums[right] - prefixSums[left - 1];
    }
}
