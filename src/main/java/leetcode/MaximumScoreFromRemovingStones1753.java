package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 思路1：尽量消耗数量大的两个堆，通过最大堆维护3个数的大小关系，每次取出最大的2个数，减1后加入堆，然后判断堆中是否有2个数为0
 * */
public class MaximumScoreFromRemovingStones1753 {
    int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        maxQueue.add(a);
        maxQueue.add(b);
        maxQueue.add(c);

        int result = 0;
        while (true) {
            int first = maxQueue.poll();
            int second = maxQueue.poll();
            int third = maxQueue.poll();
            if (first + second + third <= first) {
                break;
            }
            maxQueue.add(first - 1);
            maxQueue.add(second - 1);
            maxQueue.add(third);
            result += 1;
        }
        return result;
    }
}
