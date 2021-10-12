package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：遍历数组，二分查找(target-当前值)的下标，如果下标!=当前下标，返回结果<br>
 * 思路2：创建map，key为数组值，value为下标，遍历数组，判断(target-当前值)在不在map中，如果在返回下标<br>
 * 思路3：双指针，定义左指针从0开始，右指针从数组末尾开始，当左指针<右指针，如果指针指向元素相加等于target，返回指针，如果相加小于target，
 * 左指针++，否则右指针--
 * */
public class TwoSum167 {
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int targetIndex = Arrays.binarySearch(numbers, target - numbers[i]);
            if (targetIndex >= 0&& targetIndex != i) {
                if (targetIndex > i) {
                    return new int[] {i + 1, targetIndex + 1};
                } else {
                    return new int[] {targetIndex + 1, i + 1};
                }
            }
        }
        return new int[] {0, 0};
    }

    public int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int targetIndex = map.get(target - numbers[i]);
                if (targetIndex > i) {
                    return new int[] {i + 1, targetIndex + 1};
                } else {
                    return new int[] {targetIndex + 1, i + 1};
                }
            }
            map.put(numbers[i], i);
        }
        return new int[] {0, 0};
    }

    public int[] twoSum3(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target)
                return new int[] {left + 1, right + 1};
            if (numbers[left] + numbers[right] > target)
                right--;
            if (numbers[left] + numbers[right] < target)
                left++;
        }
        return new int[] {0, 0};
    }
}
