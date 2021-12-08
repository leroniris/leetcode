/**
 * 快乐数
 * <p>
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例: 
 * 输入: 19
 * 输出: true
 * 解释:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * <p>
 * 使用快慢指针思想
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/28 1:21
 */
public class Solution202 {

    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int b = n % 10;
            sum += b * b;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sum(slow);
            fast = sum(fast);
            fast = sum(fast);
        } while(slow != fast);
        return slow == 1;
    }
}
