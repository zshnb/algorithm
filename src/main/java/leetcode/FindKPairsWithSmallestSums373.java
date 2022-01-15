package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return Integer.compare(o2.get(0) + o2.get(1), o1.get(0) + o1.get(1));
            }
        });
        int index = 0;
        int limit = Math.min(nums1.length, k);
        while (index < limit) {
            for (int i = 0;i < nums2.length;i++) {
                int finalI = i;
                int finalIndex = index;
                List<Integer> list = new ArrayList<>(){{
                    add(nums1[finalIndex]);
                    add(nums2[finalI]);
                }};
                List<Integer> max = queue.peek();
                if (max != null && max.get(0) + max.get(1) >  list.get(0) + list.get(1) && queue.size() >= k) {
                    queue.poll();
                    queue.add(list);
                } else if (max == null || queue.size() < k) {
                    queue.add(list);
                }
            }
            index += 1;
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty() && k > 0) {
            res.add(queue.poll());
            k -= 1;
        }

        res.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return Integer.compare(o1.get(0) + o1.get(1), o2.get(0) + o2.get(1));
            }
        });
        return res;
    }
}
