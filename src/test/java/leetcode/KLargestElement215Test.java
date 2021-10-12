package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KLargestElement215Test {
    private KLargestElement215 kLargestElement215 = new KLargestElement215();

    @Test
    public void test1() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int res = kLargestElement215.findKthLargest1(nums, 2);
        Assertions.assertEquals(5, res);
        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        res = kLargestElement215.findKthLargest1(nums, 4);
        Assertions.assertEquals(4, res);
    }
}
