package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 思路1：遍历数组，用map记录元素与频率，排序后返回前k个<br>
 * 思路2：使用最小堆，遍历数组，用map记录元素与频率，遍历map，当遍历到节点的频率比堆头元素频率大时，取代堆头节点
 * */
public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (k <= 0) return nums;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
        int[] result = new int[k];
        for (int i = 0;i < k;i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        if (k <= 0) return nums;
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(Map.Entry.comparingByValue());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (priorityQueue.isEmpty()) {
                priorityQueue.add(integerIntegerEntry);
            } else {
                if (priorityQueue.size() >= k && priorityQueue.peek().getValue() < integerIntegerEntry.getValue()) {
                    priorityQueue.poll();
                    priorityQueue.add(integerIntegerEntry);
                } else if (priorityQueue.size() < k){
                    priorityQueue.add(integerIntegerEntry);
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll().getKey();
        }
        return result;
    }
}
