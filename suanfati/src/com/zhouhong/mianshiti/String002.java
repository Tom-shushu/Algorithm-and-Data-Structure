package com.zhouhong.mianshiti;

import java.util.Scanner;

public class String002 {

    //写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str.toUpperCase();
        char s = in.next().toUpperCase().toCharArray()[0];
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s){
                count++;
            }
        }
        System.out.println(count);
    }
}
