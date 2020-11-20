package com.zhouhong.LeetCode;

import java.util.Arrays;

public class LeetCode136 {
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
