package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArrays350Test {
    private IntersectionOfTwoArrays350 instance = new IntersectionOfTwoArrays350();

    @Test
    public void test1() {
        int[] nums = new int[]{2, 2};
        Assertions.assertArrayEquals(nums, instance.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        nums = new int[]{1};
        Assertions.assertArrayEquals(nums, instance.intersection(new int[]{2,1}, new int[]{1,1}));
        nums = new int[]{1};
        Assertions.assertArrayEquals(nums, instance.intersection(new int[]{1}, new int[]{1,1}));
        nums = new int[]{9,4};
        Assertions.assertArrayEquals(nums, instance.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}
