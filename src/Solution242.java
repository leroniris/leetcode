/**
 * 有效的字母异位词
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/28 1:09
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] bocket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bocket[s.charAt(i) - 'a']++;
            bocket[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (bocket[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
