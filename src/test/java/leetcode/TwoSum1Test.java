package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum1Test {
    private TwoSum1 instance = new TwoSum1();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 0};
        Assertions.assertArrayEquals(nums, instance.twoSum1(new int[]{2, 7, 11, 15}, 9));
        nums = new int[]{1, 0};
        Assertions.assertArrayEquals(nums, instance.twoSum1(new int[]{3, 3}, 6));
        nums = new int[]{2, 1};
        Assertions.assertArrayEquals(nums, instance.twoSum1(new int[]{3, 2, 4}, 6));
    }
}
