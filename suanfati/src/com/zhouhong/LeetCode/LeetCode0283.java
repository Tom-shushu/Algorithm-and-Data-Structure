package com.zhouhong.LeetCode;

import java.util.ArrayList;
import java.util.List;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
// 示例:
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 说明:
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
// Related Topics 数组 双指针
// 👍 860 👎 0
public class LeetCode0283 {
    /**
     * 分为两种情况：
     * 1.第一位（即L指针指的地方为0）：R指针为0时，R右移，否则交换左右指针位置，左右指针同时右移；
     * 2，第一位不为0：同理R指针为0时，R右移，否则首先左指针右移，
     */
    public void moveZeroes1(int[] nums) {
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

    /**
     * 取出非零元素，加入数组，再赋值给原数组，后面的数字赋值为0.
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        List<Integer> tempArr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                tempArr.add(nums[i]);
            }
        }
        for (int i = 0; i < tempArr.size(); i++) {
            nums[i] = tempArr.get(i);
        }
        for (int i = tempArr.size() + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


    public void moveZeroes3(int[] nums) {
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            //如果当前元素不为目标元素：将nums[j] 赋给 nums[i] ,j++(后移)
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            //反则：i++.
        }
    }

}
