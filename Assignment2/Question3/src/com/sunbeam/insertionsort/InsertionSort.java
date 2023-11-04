package com.sunbeam.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	
	public static void insertionSort(int arr[]) {
		int temp;
		int passes=0;
		int comparisions =0;
		for(int i= 1;i<arr.length;i++) {
			
			
			passes++;
			 temp = arr[i];
			 int j=i-1;
			 comparisions++;
			 while(j>=0  && temp<arr[j] ) {
				 arr[j+1]=arr[j];
				 j--;
			 }
			 arr[j+1]= temp;
			
			
			
//			 temp = arr[i];
//			//3. find immediate left neighbour
//			int j = i - 1;
//			//4. compare backued element with all its left neighbour
//			while(j >= 0 && arr[j] > temp) {
//				//5. if left element is greater than backuped element then move it one position ahead
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			// i = 1
//			// temp = 44
//			// j = 0(55), -1
//			//6. insert backuped element at its appropriate position
//			arr[j + 1] = temp;
			
		}
		System.out.println("no of comparisions  = "+comparisions);
		System.out.println("no of passes ="+ passes);
		
		
		
	}

	public static void main(String[] args) {
		int arr[] = { 45, 37, 86, 65, 54, 11, 39 };
		System.out.println("Array befor sort ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array After sort ");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
