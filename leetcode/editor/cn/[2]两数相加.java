package editor.cn;//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 
// 👍 7146 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class _2两数相加_Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    /**
     * 递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recur(l1, l2, 0);
    }

    private ListNode recur(ListNode l1, ListNode l2, int add) {
        if (l1 == null && l2 == null && add == 0) {
            return null;
        }

        int curVal = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
        ListNode res = new ListNode(curVal % 10);
        ListNode next = recur(l1 == null ? l1 : l1.next, l2 == null ? l2 : l2.next, curVal / 10);
        res.next = next;
        return res;
    }

    /**
     * 非递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;

            result.next = new ListNode((val1 + val2 + carry) % 10);
            result = result.next;
            carry = (val1 + val2 + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            result.next = new ListNode((l1.val + carry) % 10);
            result = result.next;
            carry = (l1.val + carry) / 10;
            l1 = l1.next;
        }

        while (l2 != null) {
            result.next = new ListNode((l2.val + carry) % 10);
            result = result.next;
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
        }

        if (carry > 0) {
            result.next = new ListNode(carry);
        }

        return cur.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
