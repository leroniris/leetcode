/**
 * 面试题24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 *
 * 限制：
 * 0 <= 节点个数 <= 5000
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/25 14:37
 */
public class _面试题_反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newNode = null;
        ListNode cur = head;
        while (cur !=null) {
            ListNode next = cur.next;
            cur.next = newNode;
            newNode = cur;
            cur = next;
        }
        return newNode;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newNode = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }
}
