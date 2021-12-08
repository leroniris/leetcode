/**
 * 面试题18. 删除链表的节点
 * <p>
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * 注意：此题对比原题有改动
 * <p>
 * 示例 1:
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * <p>
 * 示例 2:
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 * <p>
 * 说明：
 * 题目保证链表中节点的值互不相同
 * 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/25 15:06
 */
public class _面试题_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if(head.val == val) {
            return head.next;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val ) {
                ListNode next = cur.next.next;
                if(next!= null) {
                    cur.val = next.val;
                    cur.next = next.next;
                } else {
                    cur.next = null;
                }
                break;
            }
            cur = cur.next;
        }

        return head;
    }
}
