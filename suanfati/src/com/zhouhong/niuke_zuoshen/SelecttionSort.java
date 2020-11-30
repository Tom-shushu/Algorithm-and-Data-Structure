package com.zhouhong.niuke_zuoshen;

public class SelecttionSort {
    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // i ~ N-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //i ~ N-1
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
