/**
 * 
 */
package com.datastructures.sorting;

/**
 * @author Srinivas Gudipati
 *
 */
/**
 * @author test
 *
 */
public interface Sort {
	
	
	public void sort(int[] sort);
	
	public default void swap(int sort[],int index1,int index2) {
		int temp=sort[index1];
		sort[index1]=sort[index2];
		sort[index2]=temp;
		
		
	}
	
	public default void display(int sort[]) {
		for(int i:sort) {
			System.out.print("\t"+i);
		}
		System.out.println();
	}
	

}
