package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：滑动窗口，题意为维护一个最大的只含两种元素的连续子数组，通过map记录窗口中元素的个数，当右指针元素加入map后，发现map不满足要求，需要一直把左指针往前进
 * 直到map满足要求，然后右指针往前进
 * */
public class FruitIntoBaskets904 {
    public int totalFruit(int[] fruits) {
        int result = 0;
        int left = 0, right = 1;
        Map<Integer, Integer> intWithCount = new HashMap<>();
        intWithCount.put(fruits[0], 1);
        while (right < fruits.length) {
            int rightValue = fruits[right];
            intWithCount.put(rightValue, intWithCount.getOrDefault(rightValue, 0) + 1);
            while (intWithCount.size() > 2) {
                int leftValue = fruits[left];
                if (intWithCount.containsKey(leftValue)) {
                    intWithCount.put(leftValue, intWithCount.get(leftValue) - 1);
                }
                if (intWithCount.get(leftValue) == 0) {
                    intWithCount.remove(leftValue);
                }
                left += 1;
            }
            right += 1;
            result = Math.max(result, right - left);
        }

        return result == 0 ? (right - left) : result;
    }
}
