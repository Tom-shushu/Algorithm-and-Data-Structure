package com.zhouhong.LeetCode;

public class LeetCode0009 {
    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    /**
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int L = 0;
        int R = arr.length - 1;
        while (L <= R){
            if (L==R){
                return true;
            }else {
                if (arr[L] == arr[R]){
                    L++;
                    R--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
