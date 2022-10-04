package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarray53Test {

    @Test
    public void successful() {
        MaximumSubarray53 obj = new MaximumSubarray53();
        Assertions.assertEquals(6, obj.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assertions.assertEquals(23, obj.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
