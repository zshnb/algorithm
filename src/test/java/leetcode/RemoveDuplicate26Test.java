package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicate26Test {
    private RemoveDuplicate26 removeDuplicate26 = new RemoveDuplicate26();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 1, 2};
        int res = removeDuplicate26.removeDuplicates1(nums);
        Assertions.assertEquals(2, res);
        Assertions.assertArrayEquals(new int[]{1, 2, 0}, nums);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        res = removeDuplicate26.removeDuplicates1(nums);
        Assertions.assertEquals(5, res);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.stream(nums).limit(res).toArray());
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 2};
        int res = removeDuplicate26.removeDuplicates2(nums);
        Assertions.assertEquals(2, res);
        Assertions.assertArrayEquals(new int[]{1, 2, 2}, nums);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        res = removeDuplicate26.removeDuplicates2(nums);
        Assertions.assertEquals(5, res);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.stream(nums).limit(res).toArray());
    }
}
