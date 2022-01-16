package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 思路1：把链表转换成列表，使用随机下标<br>
 * 思路2：记录链表长度，随机下标
 * */
public class LinkedListRandomNode382 {
    private ListNode head;
    private List<Integer> list = new ArrayList<>();
    int length = 0;
    public LinkedListRandomNode382(ListNode head) {
        this.head = head;
        while (head != null) {
            length += 1;
            head = head.next;
        }
    }

    public int getRandom2() {
        int res = 0, i = 0;
        int index = new Random().nextInt(length);
        ListNode p = head;
        while (p != null) {
            if (i < index) {
                p = p.next;
                i += 1;
            } else {
                res = p.val;
                break;
            }
        }
        return res;
    }

    public int getRandom() {
        Random random = new Random();
        int i = random.nextInt(list.size());
        return list.get(i);
    }
}
