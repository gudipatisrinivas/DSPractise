package com.datastructures.searching;

import com.datastructures.sorting.QuickSort;

public class BinarySearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers2= {2,3,4,5,6,7,8};
		int number=new BinarySearch().search(numbers2,0,numbers2.length,7);
		if(number>-1) {
			System.out.println("Found"+number);
		}else {
			System.out.println("Not Found");
					
		}
		
	}
	

	private int search(int[] numbers2, int low, int high, int target) {
		// TODO Auto-generated method stub
		if (high > 0) {
			int mid = low + (high- 1) / 2;
			if (target == numbers2[mid]) {
				return mid;
			}
			
				
			 else if ( numbers2[mid]>target) {
				
				search(numbers2, low, mid-1, target);
	        
			} else if (numbers2[mid] < target) {
				search(numbers2, mid+1,high, target);
		}
		
		}
	
		return -1;
	}

}