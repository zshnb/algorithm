package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubarraysWithBoundedMaximum795Test {

    private NumberOfSubarraysWithBoundedMaximum795 instance = new NumberOfSubarraysWithBoundedMaximum795();

    @Test
    public void test() {
        Assertions.assertEquals(22,
            instance.numSubarrayBoundedMax(new int[]{73, 55, 36, 5, 55, 14, 9, 7, 72, 52}, 32, 69));
        Assertions.assertEquals(7, instance.numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));
        Assertions.assertEquals(3, instance.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }
}
