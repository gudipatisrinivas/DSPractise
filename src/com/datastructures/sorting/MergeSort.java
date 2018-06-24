package com.datastructures.sorting;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] sort) {
		// TODO Auto-generated method stub
		sort(sort,0,sort.length-1);

	}

	void sort(int[] sort, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {
			int middle = ((low+high) / 2);
			sort(sort, low, middle);
			sort(sort, middle + 1, high);
			merge(sort, low, middle, high);
		}

	}

	private void merge(int[] sort, int left, int middle, int max) {
		// TODO Auto-generated method stub
		int lenght1 = (middle - left + 1);
        int lenght2 = (max - middle);
        int l1=0,l2=0,l3=left;
        int[] array1=new int[lenght1];
        int[] array2=new int[lenght2];
        
        for(int i=0;i<lenght1;++i) {
        	array1[i]=sort[left+i];
        }
        for(int m=0;m<lenght2;++m) {
        	
        	array2[m]=sort[middle+1+m];
        }
        
        while(l1<lenght1 && l2<lenght2) {
        	if(array1[l1]<array2[l2]) {
        		sort[l3]=array1[l1];
        		l1++;
        	}else {
        		
        		sort[l3]=array2[l2];
        		l2++;
        	}
        	l3++;
        	
        }
        while(l1<lenght1) {
        	sort[l3]=array1[l1];
        	l1++;
        	l3++;
        }
        while(l2<lenght2) {
        	sort[l3]=array2[l2];
        	l2++;
        	l3++;
        }
 
        display(sort);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers2= {10,9,8,7,5,4,2};
		new MergeSort().display(numbers2);
		new MergeSort().sort(numbers2);

	}

}
