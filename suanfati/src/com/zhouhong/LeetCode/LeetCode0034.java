package com.zhouhong.LeetCode;

import java.util.ArrayList;
/**
 *给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *如果数组中不存在目标值 target，返回 [-1, -1]。
 */
 
public class LeetCode0034 {
    /**
     * 第一种方法：用一层for 循环解决
     * @param nums
     * @param target
     * @return
     */
    /*public int[] searchRange(int[] nums, int target) {
        int chushi = 0,jiesu = 0,count = 0;
        int[] arrayList = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                jiesu = i;
                count++;
            }
        }
        if (count == 0){
            arrayList[0] = -1;
            arrayList[1] = -1;
        }else {
            arrayList[0] = jiesu-count + 1;
            arrayList[1] = jiesu;
        }
        return arrayList;
    }*/

    /**
     * 第二种方法：使用指针解决
     * @param nums
     * @param target
     * @return
     */
    /*public int[] searchRange(int[] nums, int target) {
        int[] arrayList = new int[2];
        int L = -1,R = 0;
        while (R < nums.length){
            if (nums[R] == target){
                L++;
                arrayList[0] = L;
                R++;
            }
        }
        return arrayList;
    }*/

}
