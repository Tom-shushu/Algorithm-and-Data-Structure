package com.zhouhong.LeetCode;

import java.util.List;

public class LeetCode0120 {

    /**
     * 递归实现
     * @param triangle
     * @return
     */
    public int minimumTotal1(List<List<Integer>> triangle) {
        return dfs(triangle,0 ,0);
    }
    public int dfs(List<List<Integer>> triangle, int i, int j) {
        if (triangle.size() == 0){
            return 0;
        }
        return Math.min(dfs(triangle, i + 1, j), dfs(triangle, i + 1, j + 1)) + triangle.get(i).get(j);
    }

    /**
     * 动态规划实现、使用二维数组
     * @param triangle
     * @return
     */
    public int minimumTotal2(List<List<Integer>> triangle) {

        int [][] dp = new int [triangle.size() + 1][triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i+1][j] , dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return  dp[0][0];
    }

    /**
     * 动态规划实现、使用一维数组
     * @param triangle
     * @return
     */
    public int minimumTotal3(List<List<Integer>> triangle) {

        int [] dp = new int [triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j] , dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return  dp[0];
    }
}
