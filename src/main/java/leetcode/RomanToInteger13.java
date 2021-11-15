package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：向右看一位，如果右边字符表示的比当前表示的大，结果需要减去当前值，否则加上当前值
 * */
public class RomanToInteger13 {
    public int romanToInt(String s) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.toCharArray().length;++i) {
            if (i < s.toCharArray().length - 1 && map.get(chars[i] + "") < map.get(chars[i + 1] + "")) {
                res -= map.get(chars[i] + "");
            } else {
                res += map.get(chars[i] + "");
            }
        }
        return res;
    }
}
