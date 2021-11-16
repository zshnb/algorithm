package sort;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class SortTest {
    private long mills = 0;
    private int[] nums;
    private int[] copied;
    private int size;
    @BeforeEach
    public void before() {
        size = 100000;
        mills = System.currentTimeMillis();
        nums = ArrayUtil.generateRandomArray(size, 0, 200000);
        copied = new int[nums.length];
    }

    @AfterEach
    public void after() {
        System.out.println(System.currentTimeMillis() - mills + "ms");
        Arrays.sort(nums);
        Assertions.assertArrayEquals(nums, copied);
    }

    @Test
    public void selectSort() {
        System.arraycopy(nums, 0, copied, 0, nums.length);
        SelectSort selectSort = new SelectSort();
        selectSort.sort(copied);
    }

    @Test
    public void insertionSort() {
        System.arraycopy(nums, 0, copied, 0, nums.length);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(copied);
    }

    @Test
    public void mergeSort() {
        System.arraycopy(nums, 0, copied, 0, nums.length);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(copied);
    }
}
