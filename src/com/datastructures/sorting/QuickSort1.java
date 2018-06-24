package com.datastructures.sorting;

public class QuickSort1 implements Sort {

	@Override
	public void sort(int[] numbers2) {
		// TODO Auto-generated method stub
		sort(numbers2,0,numbers2.length);

	}

	private void sort(int[] numbers2, int low, int high) {
		// TODO Auto-generated method stub
		 if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            int pi = partition(numbers2, low, high);
	 
	            // Recursively sort elements before
	            // partition and after partition
	            sort(numbers2, low, pi-1);
	            sort(numbers2, pi+1, high);
	        }
	        display(numbers2);
		
				
				
		
	}
	
	private int partition(int[] numbers2,int low,int high) {
		int pivot=numbers2[high];
		int j=low-1;
		for(int i=low;i<numbers2.length;i++) {
			if(numbers2[i]<=pivot) {
				j++;
				swap(numbers2,i,j);
				
			}
		}
			swap(numbers2,j+1,high);
		
		
		return j+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,9,8,7,5,4,2};
		int[] numbers2= {2,3,4,5,6,7,8};
		new QuickSort1().sort(numbers2);
	}

}
