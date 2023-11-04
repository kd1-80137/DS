package com.sunbeam;

import java.util.Arrays;

public class InsertionSortdesc {
	
	
	
	public static void insertionSort(int arr[]) {
		int temp;
		int passes=0;
		int comparisions =0;
		for(int i= 1;i<arr.length;i++) {
			
			
			passes++;
			 temp = arr[i];
			 int j=i-1;
			 comparisions++;
			 while(j>=0  && temp>arr[j] ) {
				 arr[j+1]=arr[j];
				 j--;
			 }
			 arr[j+1]= temp;
			
			
		}
		System.out.println("no of comparisions  = "+comparisions);
		System.out.println("no of passes ="+ passes);
		
		
		
	}

	public static void main(String[] args) {
		int arr[] = { 45, 37, 86, 65, 54, 11, 39 };
		//int arr[]= {33,22,99,55,44,77,11,66};
		System.out.println("Array befor sort ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array After sort ");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
