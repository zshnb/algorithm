package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicate80Test {
    private RemoveDuplicate80 removeDuplicate80 = new RemoveDuplicate80();

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 0, 0, 0, 0, 3, 3};
        int res = removeDuplicate80.removeDuplicates1(nums);
        Assertions.assertEquals(5, res);
        Assertions.assertArrayEquals(new int[]{-1, 0, 0, 3, 3}, Arrays.stream(nums).limit(res).toArray());

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        res = removeDuplicate80.removeDuplicates1(nums);
        Assertions.assertEquals(7, res);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, Arrays.stream(nums).limit(res).toArray());
    }

    @Test
    public void test2() {
        int[] nums = new int[]{-1, 0, 0, 0, 0, 3, 3};
        int res = removeDuplicate80.removeDuplicates2(nums);
        Assertions.assertEquals(5, res);
        Assertions.assertArrayEquals(new int[]{-1, 0, 0, 3, 3}, Arrays.stream(nums).limit(res).toArray());

        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        res = removeDuplicate80.removeDuplicates2(nums);
        Assertions.assertEquals(7, res);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, Arrays.stream(nums).limit(res).toArray());
    }
}
