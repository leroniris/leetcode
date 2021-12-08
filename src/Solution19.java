/**
 * 删除链表的倒数第N个节点
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/12 2:11
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (n < 0) {
            throw new RuntimeException("n不合法");
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        ListNode q = dummyHead;
        while (n >= 0) {
            if (q != null) {
                q = q.next;
            } else {
                throw new RuntimeException("n的大小大于链表长度");
            }
            n--;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }

        ListNode removeNode = p.next;
        p.next = removeNode.next;

        return dummyHead.next;
    }
}
