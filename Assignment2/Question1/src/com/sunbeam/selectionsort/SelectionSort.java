package com.sunbeam.selectionsort;

import java.util.Arrays;

public class SelectionSort {

	  
	public static void selectionSort(int arr[]) {
		int passes=0;
		int count=0;
		for(int i=0;i< arr.length-1 ;i++) {
			passes++;
			for(int j=i+1 ;j<arr.length;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					 arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(" Passes = "+passes);
		System.out.println("NO of Comparisions  = "+count);
		
	}
	
	public static void main(String[] args ) {
		//int arr[]= {45,37,86,65,54,11,39};
		int arr[]= {99,66,22,77,44,11,33,88,55};
		System.out.println("Array befor sort ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array After sort ");
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		
		
		
		
		
		}

}
