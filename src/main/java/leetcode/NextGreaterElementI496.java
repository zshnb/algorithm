package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 思路1：首先构造nums2每个元素对应的下一个最大元素（使用单调栈），然后遍历nums1，从对应关系中找
 * */
public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> numWithNextGreater = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!deque.isEmpty() && deque.getFirst() <= nums2[i]) {
                deque.removeFirst();
            }
            int nextGreater = deque.isEmpty() ? -1 : deque.getFirst();
            numWithNextGreater.put(nums2[i], nextGreater);
            deque.addFirst(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = numWithNextGreater.get(nums1[i]);
        }
        return result;
    }
}
