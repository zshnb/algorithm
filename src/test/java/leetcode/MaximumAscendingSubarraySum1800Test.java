package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAscendingSubarraySum1800Test {
    @Test
    public void successful() {
        MaximumAscendingSubarraySum1800 obj = new MaximumAscendingSubarraySum1800();
        Assertions.assertEquals(65, obj.maxAscendingSum(new int[]{10,20,30,5,10,50}));
    }

    @Test
    public void successful2() {
        MaximumAscendingSubarraySum1800 obj = new MaximumAscendingSubarraySum1800();
        Assertions.assertEquals(100, obj.maxAscendingSum2(new int[]{100,10,1}));
        Assertions.assertEquals(65, obj.maxAscendingSum2(new int[]{10,20,30,5,10,50}));
    }
}
