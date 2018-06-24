package com.datastructures.sorting;

public class InsertionSort implements Sort {

	@Override
	public void sort(int[] sort) {
		// TODO Auto-generated method stub
		for(int i=0;i<sort.length;i++) {
			int temp=0;
			for(int j=i+1;j<sort.length;j++) {
				if(sort[j-1]>sort[j]) {
					temp=j;
				}
				swap(sort,temp,i);
			}
		}
		display(sort);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,9,8,7,5,4,2};
		new InsertionSort().sort(numbers);
		

	}

}
