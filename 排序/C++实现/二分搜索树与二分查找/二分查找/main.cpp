#include <iostream>
using namespace std;
//���ֲ��ҷ�������������arr�е�targetԪ��
//����ҵ�targetԪ�أ�������Ӧ������index
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

// �õݹ�ķ�ʽд���ֲ��ҷ�
template<typename T>
int __binarySearch2(T arr[], int l, int r, T target){

    if( l > r )
        return -1;

    //int mid = (l+r)/2;
    // ��ֹ��������µ����������ʹ��������߼����mid
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