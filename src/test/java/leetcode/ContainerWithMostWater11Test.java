package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWater11Test {
    private ContainerWithMostWater11 containerWithMostWater11 = new ContainerWithMostWater11();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 4, 3};
        int res = containerWithMostWater11.maxArea(nums);
        Assertions.assertEquals(4, res);
    }
}
