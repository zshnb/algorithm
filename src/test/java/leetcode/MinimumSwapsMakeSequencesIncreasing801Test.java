package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSwapsMakeSequencesIncreasing801Test {
    @Test
    public void successful() {
        MinimumSwapsMakeSequencesIncreasing801 obj = new MinimumSwapsMakeSequencesIncreasing801();
        Assertions.assertEquals(1, obj.minSwap(new int[]{3,3,8,9,10}, new int[]{1,7,4,6,8}));
        Assertions.assertEquals(1, obj.minSwap(new int[]{0,4,4,5,9}, new int[]{0,1,6,8,10}));
    }
}
