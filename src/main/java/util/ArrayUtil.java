package util;

import java.util.Random;

public class ArrayUtil {
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (random.nextInt(max) % (max - min + 1)) + min;
        }
        return nums;
    }
}
