package com.zhouhong.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SQL转Java {
    public static void main(String[] args) throws IOException {
        System.err.println("请输入SQL：");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add("StringBuilder sql = new StringBuilder();");
        String next = bf.readLine();
        while (true) {

            if (next.length() == 0) {
                break;
            }
            list.add("sql.append(\" " + next + " \");");
            next = bf.readLine();
        }
        for (String sql : list) {
            System.out.println(sql);
        }
    }

}
