package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveElement27Test {
    private RemoveElement27 removeElement27 = new RemoveElement27();

    @Test
    public void test1() {
        int[] nums = new int[]{3, 2, 2, 3};
        int res = removeElement27.removeElement1(nums, 3);
        Assertions.assertEquals(2, res);
        Assertions.assertArrayEquals(new int[]{2, 2, 0, 0}, nums);

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        res = removeElement27.removeElement1(nums, 2);
        Assertions.assertEquals(5, res);
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 0, 4, 0, 0, 0}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 2, 3};
        int res = removeElement27.removeElement2(nums, 3);
        Assertions.assertEquals(2, res);
        Assertions.assertArrayEquals(new int[]{2, 2}, Arrays.stream(nums).limit(res).toArray());

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        res = removeElement27.removeElement2(nums, 2);
        Assertions.assertEquals(5, res);
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        Arrays.stream(nums).limit(res).forEach(it -> {
            Assertions.assertTrue(set.contains(it));
        });
    }
}
