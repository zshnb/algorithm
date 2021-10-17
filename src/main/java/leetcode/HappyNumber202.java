package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：出现死循环的标志是出现了重复数，因此只需要记录每次出现的数，如果超过1次就表示不是快乐数
 * */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (n != 1) {
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (map.getOrDefault(sum, 0) > 1) {
                return false;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            n = sum;
            sum = 0;
        }
        return true;
    }
}
