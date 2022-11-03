package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 思路1：把黑名单里的数与数组末尾交换，可以用map映射关系，映射的时候注意
 * 1. 黑名单中的数已经在末尾范围内的不能映射
 * 2. 末尾的数已经存在黑名单中，需要往前寻找非黑名单的数
 * */
public class RandomPickWithBlacklist710 {
    private Map<Integer, Integer> mapping = new HashMap<>();
    private int splitIndex;

    public RandomPickWithBlacklist710(int n, int[] blacklist) {
        splitIndex = n - blacklist.length;
        for (int i : blacklist) {
            mapping.put(i, 666);
        }
        int last = n - 1;
        for (int i : blacklist) {
            if (i >= splitIndex) {
                continue;
            }
            while (mapping.containsKey(last)) {
                last -= 1;
            }
            mapping.put(i, last);
            last -= 1;
        }
    }

    public int pick() {
        int index = new Random().nextInt(splitIndex);
        if (mapping.containsKey(index)) {
            return mapping.get(index);
        }
        return index;
    }
}
