package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 思路1：符合要求的数只可能是3, 5, 7这几个数相乘的结果，从0到k-1开始循环，把最小堆堆顶（初始为1）的数依次与3, 5, 7相乘，结果放入堆中，最后返回
 * 堆顶元素即可。由于过程中可能会有重复数，因此还需要set去重
 * */
public class GetKthMagicNumberLcci17_9 {
    public int getKthMagicNumber(int k) {
        PriorityQueue<Long> list = new PriorityQueue<>();
        list.add(1L);
        Set<Long> set = new HashSet<>();
        set.add(1L);
        int i1 = 3;
        int i2 = 5;
        int i3 = 7;
        for (int i = 1; i < k; i++) {
            long x = list.poll();
            if (!set.contains(x * i1)) {
                list.add(x * i1);
                set.add(x * i1);
            }
            if (!set.contains(x * i2)) {
                list.add(x * i2);
                set.add(x * i2);
            }
            if (!set.contains(x * i3)) {
                list.add(x * i3);
                set.add(x * i3);
            }
        }
        return Math.toIntExact(list.poll());
    }
}
