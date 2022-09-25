package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 思路1：题目要求2个数的平方和，因此2个数最大都不能超过c开根号，因此可以把[0..sqrt(c)]的平方存进set里，然后再从[0..sqrt(c)]开始循环，判断
 * c - 当前数平台的数是否在set里，跟解给定目标数，求两数之和是一个思路
 * 思路2：不需要set判断，只需要在每次循环中估算出b（sqrt(c - i^2)），然后判断 i^2 + b^2 是否等于c
 * */
public class SumOfSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        int limit = (int) Math.sqrt(c);
        for (int i = 0; i <= limit; i++) {
            int b = (int) Math.round(Math.sqrt(c - i * i));
            if (b * b + i * i == c) {
                return true;
            }
        }
        return false;
    }

    public boolean judgeSquareSum2(int c) {
        int limit = (int) Math.sqrt(c);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= limit; i++) {
            set.add(i * i);
        }
        for (int i = 0; i <= limit; i++) {
            if (set.contains(c - i * i)) {
                return true;
            }
        }
        return false;
    }
}
