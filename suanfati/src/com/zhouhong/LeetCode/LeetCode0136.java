package com.zhouhong.LeetCode;
import java.util.Arrays;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
// 说明
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
// 示例 1:
// 输入: [2,2,1]
//输出: 1
// 示例 2:
// 输入: [4,1,2,1,2]
//输出: 4
// Related Topics 位运算 哈希表

public class LeetCode0136 {
	/**
	 * 先排序，再使用双指针移动解决
	 */
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int L = 0;
        int R = 1;
        while (R <= nums.length - 1){
            if (nums[L] == nums[R]){
                L+=2;
                R+=2;
            }else {
                R++;
                if (nums[L] != nums[R]){
                    return nums[L];
                }
            }
        }
        return -1;
    }
}
