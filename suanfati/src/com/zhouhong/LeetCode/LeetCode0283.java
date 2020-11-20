package com.zhouhong.LeetCode;

public class LeetCode0283 {
    public void moveZeroes(int[] nums) {
        int L = 0;
        int R = 1;
        while (R <= nums.length - 1){
            if (nums[L] == 0){
                if (nums[R] == 0){
                    R++;
                }else {
                    int temp = nums[L];
                    nums[L] = nums[R];
                    nums[R] = temp;
                    R++;
                    L++;
                }
            }else {
                if (nums[R] == 0) {
                    R++;
                } else {
                    L++;
                    int temp = nums[L];
                    nums[L] = nums[R];
                    nums[R] = temp;
                    R++;
                }
            }
        }
    }
}
