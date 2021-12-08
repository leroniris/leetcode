import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/26 23:39
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = -1;
        Map<Character, Integer> map = new HashMap<>(256);

        int res = 0;
        while (l < s.length()) {
            if ((r + 1) < s.length() && map.get(s.charAt(r + 1)) == null) {
                map.put(s.charAt(++r), 1);
            } else {
                map.put(s.charAt(l++), null);
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
