package com.datastructures.sorting;

public class QuickSort implements Sort {
	
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                swap(arr,i,j);
               
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr,i+1,high);
       
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
   private void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        display(arr);
    }
 

	@Override
	public void sort(int[] sort) {
		// TODO Auto-generated method stub
		sort(sort,0, sort.length-1);
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {10,9,8,7,5,4,2};
		int[] numbers2= {2,3,4,5,6,7,8};
		new QuickSort().sort(numbers2);
		

	}

}
