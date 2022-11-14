package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 思路1：从数组右边开始找到第一个比后面元素小的元素，然后从右边开始找第一个比刚才找到的元素大的元素，交换这2个元素后，对左边元素索引开始后面数组翻转一下
 * */
public class NextPermutation31Test {
    @Test
    public void successful() {
        NextPermutation31 obj = new NextPermutation31();
        int[] params = new int[]{1,2,3};
        obj.nextPermutation(params);
        Assertions.assertArrayEquals(new int[]{1,3,2}, params);

        params = new int[]{1,5,1};
        obj.nextPermutation(params);
        Assertions.assertArrayEquals(new int[]{5,1,1}, params);

        params = new int[]{1,3,2};
        obj.nextPermutation(params);
        Assertions.assertArrayEquals(new int[]{2,1,3}, params);

        params = new int[]{1,3,2,4};
        obj.nextPermutation(params);
        Assertions.assertArrayEquals(new int[]{1,3,4,2}, params);

        params = new int[]{3,2,1};
        obj.nextPermutation(params);
        Assertions.assertArrayEquals(new int[]{1,2,3}, params);
    }
}
