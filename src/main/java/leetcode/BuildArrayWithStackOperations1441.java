package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：定义指向target数组的下标，从1开始循环，判断当前数字是否等于target数组下标值，等于push，否则push，pop
 * */
public class BuildArrayWithStackOperations1441 {
    public List<String> buildArray(int[] target, int n) {
        int targetIndex = 0;
        int i = 1;
        List<String> result = new ArrayList<>();
        while (i <= n && targetIndex < target.length) {
            int num = target[targetIndex];
            result.add("Push");
            if (num != i) {
                result.add("Pop");
            } else {
                targetIndex += 1;
            }
            i += 1;
        }
        return result;
    }
}
