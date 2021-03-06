/**
 * 合并两个有序链表
 * <p>
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/11 22:03
 */
public class Solution21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergeNode = new ListNode(0);
        ListNode cur = mergeNode;
        while (l1 != null && l1 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur = l1;
        }
        if (l2 != null) {
            cur = l2;
        }

        return mergeNode;
    }
}
