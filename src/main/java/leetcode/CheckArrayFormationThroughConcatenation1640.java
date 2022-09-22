package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：pieces的每一个数组不允许排序，因此可以把pieces数组的头元素和数组放进map中，然后循环arr，通过arr当前元素去map中寻找数组，找不到返回false,
 * 找到了判断长度，为1时继续，大于1时再循环比较arr和找到的数组
 * */
public class CheckArrayFormationThroughConcatenation1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> firstWithArray = new HashMap<>();
        for (int[] piece : pieces) {
            firstWithArray.put(piece[0], piece);
        }

        int i = 0;
        while (i < arr.length) {
            int[] piecesItem = firstWithArray.get(arr[i]);
            if (piecesItem == null) {
                return false;
            }
            if (piecesItem.length == 1) {
                i += 1;
            } else {
                for (int k : piecesItem) {
                    if (arr[i] != k) {
                        return false;
                    }
                    i += 1;
                }
            }
        }
        return true;
    }
}
