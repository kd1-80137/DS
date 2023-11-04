package com.sunbeam.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		int passes=0;
		int count=0;
		int flag;
        for(int i=0;i<arr.length-1;i++) {
        	passes++;
        	flag=0;
           for(int j=0;j<arr.length-i-1;j++) {
        	   count++;
        	   if(arr[j]>arr[j+1]) {
        		   int temp=arr[j];
        		   arr[j]=arr[j+1];
        		   arr[j+1]=temp;
        		   flag=1;
        	   }
           }
           if(flag==0) {
        	   System.out.println("Already sorted");
        	   break;
           }
        }
        System.out.println("No of passes = "+passes);
        System.out.println("No of compariisions  = "+ count);
	}

	public static void main(String[] args) {
		//int arr[] = { 45, 37, 86, 65, 54, 11, 39 };
		//int arr[]= {11,22,33,44,55,66,77,88};
		int arr[]= {99,66,22,77,44,11,33,88,55};
		System.out.println("Array befor sort ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array After sort ");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
