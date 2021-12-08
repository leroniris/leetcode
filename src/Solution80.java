/**
 * 删除排序数组中的重复项 II
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * 给定 nums = [1,1,1,2,2,3],
 * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,1,2,3,3],
 * 函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/25 22:35
 */
public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int count = 0;
        int frequency = 0;

        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                frequency++;
            } else {
                temp = nums[i];
                frequency = 1;
            }
            if (frequency <= 2) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution80().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}
