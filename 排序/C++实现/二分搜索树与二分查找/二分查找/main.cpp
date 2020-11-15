#include <iostream>
using namespace std;
//二分查找法查找有序数组arr中的target元素
//如果找到target元素，返回相应的索引index
template<typename T>
int binarySearch(T arr[],int n ,T target){
	//arr[l......r]
	int l = 0 ,r = n-1;
	while( l <= r ){
		//int mid = (l+r)/2;
		int mid = l+(r-l)/2;
		if (arr[mid] == target)
			return mid;			
			if(target < arr[mid])
			r = mid - 1;
			else 
			l = mid +1;
			}
			return -1;	
} 

// 用递归的方式写二分查找法
template<typename T>
int __binarySearch2(T arr[], int l, int r, T target){

    if( l > r )
        return -1;

    //int mid = (l+r)/2;
    // 防止极端情况下的整形溢出，使用下面的逻辑求出mid
    int mid = l + (r-l)/2;

    if( arr[mid] == target )
        return mid;
    else if( arr[mid] > target )
        return __binarySearch2(arr, l, mid-1, target);
    else
        return __binarySearch2(arr, mid+1, r, target);
}
template<typename T>
int binarySearch2(T arr[], int n, T target){

    return __binarySearch2( arr , 0 , n-1, target);
}