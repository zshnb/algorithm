package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArrays349Test {
    private IntersectionOfTwoArrays349 instance = new IntersectionOfTwoArrays349();

    @Test
    public void test1() {
        int[] nums = new int[]{2};
        Assertions.assertArrayEquals(nums, instance.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}
