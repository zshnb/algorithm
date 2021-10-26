package leetcode;

import java.util.ArrayDeque;

/**
 * 思路1：把原链表节点拆散放入栈中，接着依次出栈拼成反抓链表<br>
 * 思路2：定义反转链表头，初始化为null，遍历原链表，先记录下一个节点，然后把当前节点的next指向反转链表头，然后把当前节点赋值给反转链表（前面2步是串链表的关键），
 * 最后当前节点往后移动
 * */
public class ReverseLinkedList206 {
    public ListNode reverseList1(ListNode head) {
        ArrayDeque<ListNode> queue = new ArrayDeque<>();
        while (head != null) {
            queue.addFirst(head);
            head = head.next;
        }
        if (queue.isEmpty()) return null;
        ListNode reverseHead = queue.getFirst();
        ListNode node = new ListNode();
        while (!queue.isEmpty()) {
            ListNode tempNode = queue.pollFirst();
            tempNode.next = null;
            node.next = tempNode;
            node = tempNode;
        }
        return reverseHead;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode current = head;
        ListNode reverseHead = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = next;
        }
        return reverseHead;
    }
}
