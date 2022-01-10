package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路1：暴力循环，分数化简用最大公约数
 * */
public class SimplifiedFractions1447 {

    public List<String> simplifiedFractions(int n) {
        Set<String> strings = new HashSet<>();
        if (n < 2) {
            return new ArrayList<>();
        }
        for (int i = 2; i<= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j != 1 && i % j == 0) continue;
                int maxNum = maxNumber(i, j);
                String s = (j / maxNum) + "/" + (i / maxNum);
                strings.add(s);
            }
        }
        return new ArrayList<>(strings);
    }

    int maxNumber(int m, int n) {
        int temp;
        if (n > m) {
            temp = n;
            n = m;
            m = temp;
        }
        if (m % n == 0) {
            return n;
        }
        return maxNumber(m - n, n);
    }
}
