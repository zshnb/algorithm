package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：根据例子，好数的意思就是数字至少有一位在[2, 5, 6, 9]中，且没有[3, 4, 7],可以在初始化的时候创建1000以内的好数列表，然后遍历满足条件的
 * 思路1：使用思路1的好数算法，不打表直接算
 * 思路3：在打表的基础上使用前缀和的方式，计算当前数之前有多少个好数
 * */
public class RotatedDigits788 {
    private List<Integer> xNums;

    public RotatedDigits788() {
        xNums = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            if (isXNumber(i)) {
                xNums.add(i);
            }
        }
    }

    public int rotatedDigits(int n) {
        int count = 0;
        for (Integer xNum : xNums) {
            if (xNum <= n) {
                count += 1;
            }
        }
        return count;
    }

    // 只有2, 5, 6, 9为X数
    private boolean isXNumber(int num) {
        boolean flag = false;
        while (num != 0) {
            int digital = num % 10;
            if ((digital == 2 || digital == 5 || digital == 6 || digital == 9)) {
                flag = true;
            }
            if (digital == 7 || digital == 4 || digital == 3) {
                return false;
            }
            num /= 10;
        }
        return flag;
    }
}
