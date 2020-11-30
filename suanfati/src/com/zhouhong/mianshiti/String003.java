package com.zhouhong.mianshiti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 */
public class String003 {
    public static void main(String[] args) {

    }
    //1.用list.stream.distinct去重统计
    private void method1(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] strArr = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i]);
        }
        System.out.println(list.stream().distinct().count());
    }

}
