import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字0之外，这两个数都不会以0开头。
 * <p>
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/24 22:24
 */
public class Solution2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode root = new ListNode(0);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = root;

        boolean temp = false;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (temp) {
                sum += 1;
            }
            if (sum >= 10) {
                temp = true;
                sum -= 10;
            } else {
                temp = false;
            }

            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (temp) {
            ListNode node = new ListNode(1);
            cur.next = node;
            cur = cur.next;
        }
        return root.next;
    }
}
