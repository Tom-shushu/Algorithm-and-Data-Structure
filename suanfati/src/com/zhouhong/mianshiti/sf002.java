package com.zhouhong.mianshiti;

import java.util.Arrays;

public class sf002 {

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
     * @param array
     * @return
     */
    /**
     * 排序后，次数大于一半，则中间那个数一定是要找到的数
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length ==0){
            return 0;
        }
        Arrays.sort(array);
        int result = array[array.length>>1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result){
                count++;
            }
        }
        if (count > array.length>>1){
            return result;
        }else {
            return 0;
        }
    }

    /**
     *
     * @param array
     * @return
     */

    public int MoreThanHalfNum_Solution2(int [] array) {
        //times:标识符
        int times = 1;
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            //当times == 0 时，将下一个数字赋给临时数字，将次数恢复为1，继续比较。
            if (times == 0){
                temp = array[1];
                times = 1;
            }if (array[i] == temp){
                times++;
            }else{
                times--;
            }
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == temp){
                times++;
            }
        }
        if (times > array.length>>1){
            return temp;
        }
        return 0;
    }

}

