package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZero283Test {
    private MoveZero283 moveZero283 = new MoveZero283();

    @Test
    public void test1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZero283.moveZeroes2(nums);
        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZero283.moveZeroes1(nums);
        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }
}
