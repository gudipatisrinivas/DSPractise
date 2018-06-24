package com.datastructures.sorting;

public class SelectionSort implements Sort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {10,9,8,7,5,4,2};
		new SelectionSort().sort(numbers);
		

	}

	@Override
	public void sort(int[] sort) {
		// TODO Auto-generated method stub

		for (int i = 0; i < sort.length; i++) {
			int temp = i;
			for (int j = i; j <sort.length; j++) {
				if (sort[temp] >sort[j]) {
					temp = j;
				}
			}
			swap(sort, i, temp);

		}
		display(sort);
	}

}
