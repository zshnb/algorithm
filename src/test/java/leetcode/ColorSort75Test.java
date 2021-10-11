package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorSort75Test {
    private ColorSort75 colorSort75 = new ColorSort75();

    @Test
    public void test1() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        colorSort75.sortColors1(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        colorSort75.sortColors2(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }
}
