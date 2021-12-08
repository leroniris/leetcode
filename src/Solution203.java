/**
 * 移除链表元素
 * <p>
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/11 21:31
 */
public class Solution203 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        ListNode dumpNode = new ListNode(0);
        dumpNode.next = head;
        ListNode cur = dumpNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return dumpNode.next;
    }
}
