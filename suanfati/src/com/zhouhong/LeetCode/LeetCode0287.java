package com.zhouhong.LeetCode;

import java.util.Arrays;
//给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出
//这个重复的数。
//
// 示例 1:
//
// 输入: [1,3,4,2,2]
//输出: 2
//
//
// 示例 2:
//
// 输入: [3,1,3,4,2]
//输出: 3
//
//
// 说明：
//
//
// 不能更改原数组（假设数组是只读的）。
// 只能使用额外的 O(1) 的空间。
// 时间复杂度小于 O(n2) 。
// 数组中只有一个重复的数字，但它可能不止重复出现一次。
//
// Related Topics 数组 双指针 二分查找
// 👍 971 👎 0
public class LeetCode0287 {
    /**
     * 			执行耗时:3 ms,击败了58.50% 的Java用户
     * 			内存消耗:38.5 MB,击败了77.55% 的Java用户
     * @param nums
     * @return
     */
/*    public int findDuplicate1(int[] nums) {
        Arrays.sort(nums);
        int L = 0,R = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[L] != nums[R]){
                L++;
                R++;
            }else {
                return nums[L];
            }
        }
        return -1;
    }*/

    /**
     * 执行耗时:3 ms,击败了58.50% 的Java用户
     * 			内存消耗:38.2 MB,击败了92.10% 的Java用户
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if (count[nums[i]] >= 2){
                return nums[i];
            }
        }
        return -1;
    }
}
