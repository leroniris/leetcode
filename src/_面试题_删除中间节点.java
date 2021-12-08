/**
 * 面试题 02.03. 删除中间节点
 * <p>
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 * <p>
 * 示例：
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/25 14:06
 */
public class _面试题_删除中间节点 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;

    }
}
