package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortArray88Test {
    private MergeSortArray88 mergeSortArray88 = new MergeSortArray88();

    @Test
    public void test1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        mergeSortArray88.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

//    @Test
//    public void test2() {
//        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
//        colorSort75.sortColors2(nums);
//        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
//    }
}
