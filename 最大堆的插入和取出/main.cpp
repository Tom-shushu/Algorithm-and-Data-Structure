﻿#include <iostream>
#include <algorithm>
#include <string>
#include <ctime>
#include <cmath>
#include <cassert>
using namespace std;
	template<typename Item>
	class MaxHeap{
	private:
		Item* data;
		int count;
		int  capacity;
		//入堆 
		void shiftUp(int k){
			while(k > 1 && data[k/2] < data[k] ){
				swap(data[k/2] , data[k]);
				k /= 2;
			}
		}
		//根节点出堆 
		void shiftDown(int k){
			//有左孩子 
			while( 2*k <= count){
				int j = 2*k;//data[k]与data[j]交换
				if(j +1 <= count && data[j+1] > data[j])
				j+=1;
				
				if(data[k] >= data[j])
				break;
				
				swap(data[k],data[j]);
				k=j; 
			}
		}	
	public:
		MaxHeap(int capacity){
			data = new Item[capacity + 1];
			count = 0;
			this->capacity = capacity;
		}
		
		~MaxHeap(){
			delete [] data;
		}
		int size(){
			return count;
		}
		bool isEmpty(){
			return count == 0;
		}
		void insert(Item item){
			assert(count+1 <= capacity);
			
			data[count+1] = item;
			count++;
			shiftUp(count);
		}
		
		
		Item extractMax(){
		assert(count > 0);
		Item ret = data[1];
		
		swap(data[1],data[count]);
		count--; 
		shiftDown(1);
		
		return ret;
	} 		
	};
int main() {
	MaxHeap<int> maxheap = MaxHeap<int>(100);
	cout<<maxheap.size()<<endl;
	
	srand(time(NULL));
	for(int i = 0;i<50;i++){
		maxheap.insert(rand()%100);
	}
	//取出堆中的元素 
	while( !maxheap.isEmpty()){
		cout<<maxheap.extractMax()<<" ";
	}
	return 0;
}

