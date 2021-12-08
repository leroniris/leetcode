package editor.cn;//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[4,5,1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：head = [0,1,2], k = 4
//输出：[2,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 500] 内 
// -100 <= Node.val <= 100 
// 0 <= k <= 2 * 109 
// 
// Related Topics 链表 双指针 
// 👍 670 👎 0


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
class _61旋转链表_Solution {

    private class ListNode {
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


    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curNode = head;

        int length = 1;

        // 获取链表的长度
        while (curNode.next != null) {
            curNode = curNode.next;
            length++;
        }




        // 求的旋转k个位置后的最后一个节点
        int lastIndex = length - k % length;
        if (lastIndex == length) {
            return head;
        }

        // 将链表形成一个环形
        curNode.next = head;

        while (lastIndex > 0) {
            curNode = curNode.next;
            lastIndex--;
        }


        ListNode rotateNode = curNode.next;
        curNode.next = null;

        return rotateNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
