package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindAllAnagramsInAString438Test {
    private FindAllAnagramsInAString438 findAllAnagramsInAString438 = new FindAllAnagramsInAString438();
    @Test
    public void test() {
        Integer[] nums = new Integer[] {0, 6};
        Assertions.assertArrayEquals(nums, findAllAnagramsInAString438.findAnagrams("cbaebabacd", "abc").toArray(new Integer[2]));
        nums = new Integer[] {};
        Assertions.assertArrayEquals(nums, findAllAnagramsInAString438.findAnagrams("af", "be").toArray(new Integer[0]));
        nums = new Integer[] {1};
        Assertions.assertArrayEquals(nums, findAllAnagramsInAString438.findAnagrams("baa", "aa").toArray(new Integer[1]));
    }
}
