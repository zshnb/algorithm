package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySum209Test {
    private MinimumSizeSubarraySum209 minimumSizeSubarraySum209 = new MinimumSizeSubarraySum209();

    @Test
    public void test1() {
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int res = minimumSizeSubarraySum209.minSubArrayLen(7, nums);
        Assertions.assertEquals(2, res);
    }
}
