package com.zhouhong.LeetCode;

public class LeetCode0042 {
    /**
     * 一、通过暴力方法解决
     * 对于每个柱子来说它上面能储存的最大的水：左边和右边最大的柱子高度中的较小者减去此柱子的高度
     * @param height
     * @return
     */
    public int trap(int[] height) {

        int result = 0;
        //遍历所有的柱子
        for (int i = 1; i < height.length - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            //找到左边最大的柱子
            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            //找到右边最大的柱子
            for (int j = i; j < height.length ; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            result = result + Math.min(maxLeft, maxRight) - height[i];
        }
        return result;
    }
}
