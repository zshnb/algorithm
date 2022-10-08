package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 思路1：使用set记录A链表的节点，然后在遍历B链表时判断节点是否存在
 * 思路2：双指针同时遍历，任何一条到末尾时，切换到另一条遍历的指针，直到2个指针对应的节点是同一个，或者没有相交都到了末尾
 * */
public class IntersectionTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> listNodes = new HashSet<>();
        ListNode tempA = headA;
        while (tempA != null) {
            listNodes.add(tempA);
            tempA = tempA.next;
        }

        while (headB != null) {
            if (listNodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        // p1 指向 A 链表头结点，p2 指向 B 链表头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // p1 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p1 == null) p1 = headB;
            else            p1 = p1.next;
            // p2 走一步，如果走到 B 链表末尾，转到 A 链表
            if (p2 == null) p2 = headA;
            else            p2 = p2.next;
        }
        return p1;
    }
}
