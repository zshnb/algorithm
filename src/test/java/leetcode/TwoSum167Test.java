package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum167Test {
    private TwoSum167 twoSum167 = new TwoSum167();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 9, 56, 90};
        int[] res = twoSum167.twoSum1(nums, 8);
        Assertions.assertArrayEquals(new int[]{4, 5}, res);
        nums = new int[]{2, 3, 4};
        res = twoSum167.twoSum1(nums, 6);
        Assertions.assertArrayEquals(new int[]{1, 3}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 9, 56, 90};
        int[] res = twoSum167.twoSum2(nums, 8);
        Assertions.assertArrayEquals(new int[]{4, 5}, res);
        nums = new int[]{2, 3, 4};
        res = twoSum167.twoSum2(nums, 6);
        Assertions.assertArrayEquals(new int[]{1, 3}, res);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3, 4, 4, 9, 56, 90};
        int[] res = twoSum167.twoSum3(nums, 8);
        Assertions.assertArrayEquals(new int[]{4, 5}, res);
        nums = new int[]{2, 3, 4};
        res = twoSum167.twoSum3(nums, 6);
        Assertions.assertArrayEquals(new int[]{1, 3}, res);
    }
}
