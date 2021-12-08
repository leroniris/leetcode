/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * <p>
 * 注意：本题相对原题稍作改动
 * <p>
 * 示例：
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * <p>
 * 说明：
 * 给定的 k 保证是有效的。
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/25 14:28
 */
public class _面试题_返回倒数第k个节点 {
    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            q = q.next;
        }
        while (q != null) {
            p = p.next;
            q = q.next;
        }
        return p.val;
    }
}
