package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentElements347Test {
    private TopKFrequentElements347 instance = new TopKFrequentElements347();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2};
        Assertions.assertArrayEquals(nums, instance.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 1};
        Assertions.assertArrayEquals(nums, instance.topKFrequent2(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
}
