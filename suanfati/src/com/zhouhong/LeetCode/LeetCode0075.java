package com.zhouhong.LeetCode;
import java.util.Arrays;
//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
// 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
// 进阶：
// 你可以不使用代码库中的排序函数来解决这道题吗？
// 你能想出一个仅使用常数空间的一趟扫描算法吗？
// 示例 1：
//输入：nums = [2,0,2,1,1,0]
//输出：[0,0,1,1,2,2]
// 示例 2：
//输入：nums = [2,0,1]
//输出：[0,1,2]
// 示例 3：
//输入：nums = [0]
//输出：[0]
// 示例 4：
//输入：nums = [1]
//输出：[1]
// 提示：
// n == nums.length
// 1 <= n <= 300
// nums[i] 为 0、1 或 2
// Related Topics 排序 数组 双指针
public class LeetCode0075 {
    /**
	 * 一、统计频率的方法实现
     * 时间复杂度：O(n)   空间复杂度O(k)
     * @param nums
     */
    public void sortColors2(int[] nums) {
        int[] count = new int[3];//存放0,1,2数字的频率
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }

    //二，使用三路快排思想解决
    public void sortColors(int[] nums) {
        int L = -1;
        int R = nums.length;
        for(int i = 0 ; i < R ; ){
            if(nums[i] == 1){
                i ++;
            }
            else if (nums[i] == 2){
                R--;
                swap(nums, i, R);
            }
            else{
                L++;
                swap(nums, L, i);
                i++;
            }
        }
    }
    private void swap(int[]nums,int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
}
