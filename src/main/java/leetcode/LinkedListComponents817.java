package leetcode;

/**
 * 思路1：遍历链表时如果当前值在数组里，标记状态为查找中，如果不在，当标记状态为查找中，结果+1，重置标记状态，查找值在不在数组可以用set或者频率数组
 * */
public class LinkedListComponents817 {
    public int numComponents(ListNode head, int[] nums) {
        ListNode dummy = new ListNode(-1, head);
        int[] freq = new int[10000];
        for (int num : nums) {
            freq[num] += 1;
        }

        boolean find = false;
        int result = 0;
        while (dummy != null) {
            dummy = dummy.next;
            if (dummy == null) {
                if (find) {
                    result += 1;
                }
                break;
            }
            if (freq[dummy.val] != 0) {
                find = true;
            } else {
                if (find) {
                    result += 1;
                    find = false;
                }
            }
        }
        return result;
    }
}
