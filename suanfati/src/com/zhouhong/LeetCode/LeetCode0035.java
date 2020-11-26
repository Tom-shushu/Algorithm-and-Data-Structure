package com.zhouhong.LeetCode;

public class LeetCode0035 {

    /**
     * 二分查找实现
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        while (l <= r){
            int mid = (l + r)>>1;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                l = mid + 1;
            }else if(nums[mid] > target){
                r = mid -1;
            }
        }
        return l;
    }

    /**
     * 直接遍历实现
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }


}
