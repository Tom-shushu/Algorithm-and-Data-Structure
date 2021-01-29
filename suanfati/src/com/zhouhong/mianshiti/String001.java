package com.zhouhong.mianshiti;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Stack;
/**
 *写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
public class String001 {

    //1.循环实现
     static void method1(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    //2.栈实现
    private void method2(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    //3.用java自带的方法实现
    private void method3(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = new StringBuffer(str).reverse().toString();
        System.out.print(result);
    }
    //4.用首尾指针的方法交换位置
    private void method4(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        int L = 0;
        int R = arr.length - 1;
        while (L < R){
            Character temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //5.用流的方式读取
    private void method5() throws IOException {
        InputStream in  = System.in;
        int len;
        byte[] b = new byte[1024];
        while((len = in.read(b)) > 0){
            String str = new String(b,0,len-1);
            char [] chars = str.toCharArray();
            char [] charsFb = new char[chars.length];
            for(int i = 0;i<chars.length;i++){
                charsFb[i] = chars[chars.length -1 -i];
            }
            System.out.println(new String(charsFb));
        }
    }
}
