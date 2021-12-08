import java.util.PriorityQueue;

/**
 * 数组中的第K个最大元素
 * <p>
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 示例 1:
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * [3, 4, 1, 4, 5, 2]
 * 输出: 5
 * <p>
 * 示例 2:
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/25 23:48
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(length, (a, b) -> b - a);
        for (int i = 0; i < length; i++) {
            maxHeap.add(nums[i]);
        }

        for (int i = 0; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

}
