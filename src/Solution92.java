/**
 * 反转链表 II
 * <p>
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * 示例:
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/11 20:46
 */
public class Solution92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    // 方法一：通过迭代解决
    public ListNode reverseBetween2(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        ListNode cur = dummyNode.next;
        while (m > 1) {
            pre = pre.next;
            cur = cur.next;
            m--;
            n--;
        }

        while (n > 1) {
            ListNode removeNode = cur.next;
            cur.next = cur.next.next;
            removeNode.next = pre.next;
            pre.next = removeNode;
            n--;
        }

        return dummyNode.next;
    }
}
