#include <iostream>
#include <algorithm>
#include "SortTestHelper.h"
#include "SelectionSort.h"
using namespace std;

//一，没有优化的插入排序（交换法） 
/*
template<typename T>

void insertionSort(T arr[], int n){
//插入排序第一个元素不用考虑 
    for( int i = 1 ; i < n ; i ++ ) {
        // 寻找元素arr[i]合适的插入位置
        // 写法一： 
//        for( int j = i ; j > 0 ; j-- )
//            if( arr[j] < arr[j-1] )
//                swap( arr[j] , arr[j-1] );
//            else
//           break;
        // 写法二 ： 
          for( int j = i ; j > 0 && arr[j] < arr[j-1] ; j -- )
                 swap( arr[j] , arr[j-1] );
    }
    return;
}
*/
//二，优化后的插入排序 （复制法）
//51,6,85,6,8,5,4
//   6
//将6复制一份，然后比较6之前的元素51
//因为6<51，不适合放到当前位置，所以将51向后移动 ，考虑6是不是应该放到前一个位置 
//51,51,85,6,8,5,4
//6
//因为现在6已经是第0个位置了，所以就放到这个位置。。。。以此类推 
		//写法三 ： 
 
template<typename T>
void insertionSort(T arr[], int n){
   for( int i = 1 ; i < n ; i ++ ) {
        // 寻找元素arr[i]合适的插入位置
		T e = arr[i];
		int j;//保存元素e应该插入的位置 
        for( j = i ; j > 0 && arr[j-1] > e ; j -- ){
        	arr[j] = arr[j-1];
		}
    arr[j] = e;
    }
}
// 比较SelectionSort和InsertionSort两种排序算法的性能效率
// 此时， 插入排序比选择排序性能略低
int main() {
    int n = 20000;
    cout<<"Test for random array, size = "<<n<<", random range [0, "<<n<<"]"<<endl;
    int *arr1 = SortTestHelper::generateRandomArray(n,0,3);
    int *arr2 = SortTestHelper::copyIntArray(arr1, n);
    SortTestHelper::testSort("Insertion Sort", insertionSort,arr1,n);
    SortTestHelper::testSort("Selection Sort", selectionSort,arr2,n);
    delete[] arr1;
    delete[] arr2;
    cout<<endl;
    return 0;
}
