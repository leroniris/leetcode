import java.util.Stack;

/**
 * 856. 括号的分数
 * <p>
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 *  
 * <p>
 * 示例 1：
 * 输入： "()"
 * 输出： 1
 * <p>
 * 示例 2：
 * 输入： "(())"
 * 输出： 2
 * <p>
 * 示例 3：
 * 输入： "()()"
 * 输出： 2
 * <p>
 * 示例 4：
 * 输入： "(()(()))"
 * 输出： 6
 * <p>
 * 提示：
 * S是平衡括号字符串，且只含有 ( 和 ) 。
 * 2 <= S.length <= 50
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/4/24 16:54
 */
public class Solution856 {
    public int scoreOfParentheses(String S) {
        Stack<Character> characters = new Stack<>();
        Stack<Integer> values = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                characters.push(S.charAt(i));
            } else {
                if(values.size() == 0) {
                    values.push(1);
                }
            }
        }
        return 0;
    }
}
