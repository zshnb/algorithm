package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 思路1：动态规划，dpTable[i]表示arr[i]处的最长等差子序列长度，状态转移方程为，如果arr[i] - difference不在数组中，dpTable[i] = 1，否则是dpTable最大值+1
 * 思路2：使用map记录数组当前值-difference对应的子序列长度，遍历数组当发现差值存在map中，更新map的value+1
 * */
public class LongestArithmeticSubsequenceDifference1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int[] dpTable = new int[arr.length];
        Arrays.fill(dpTable, 0);
        dpTable[0] = 1;

        int left = 0, right = 0;
        int max = -1;
        Map<Integer, Integer> intWithIndex = new HashMap<>();
        intWithIndex.put(arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            left = 0;
            if (!intWithIndex.containsKey(arr[i] - difference)) {
                dpTable[i] = 1;
            } else {
                right = intWithIndex.get(arr[i] - difference);
                while (left <= right) {
                    if (arr[i] - arr[left] == difference) {
                        max = Math.max(max, dpTable[left]);
                    } else if (arr[i] - arr[right] == difference) {
                        max = Math.max(max, dpTable[right]);
                    } else {
                        max = Math.max(max, 0);
                    }
                    left += 1;
                    right -= 1;
                }
                dpTable[i] = max + 1;
                max = -1;
            }
            intWithIndex.put(arr[i], i);
        }

        return Arrays.stream(dpTable).max().getAsInt();
    }

    public int longestSubsequence2(int[] arr, int difference) {
        Map<Integer, Integer> intWithCount = new HashMap<>();
        for (int i : arr) {
            if (intWithCount.containsKey(i - difference)) {
                intWithCount.put(i, intWithCount.get(i - difference) + 1);
            } else {
                intWithCount.put(i, 1);
            }
        }
        int max = -1;
        for (Entry<Integer, Integer> integerIntegerEntry : intWithCount.entrySet()) {
            max = Math.max(integerIntegerEntry.getValue(), max);
        }
        return max;
    }
}
