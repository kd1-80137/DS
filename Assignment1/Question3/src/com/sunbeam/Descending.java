package com.sunbeam;

import java.util.Scanner;

public class Descending {
	
	public static int BinarySearch(int arr[],int size,int key) {
		int left=0;
		int right=size-1;
		int mid;

	while(left<=right) {
		mid=(left+right)/2;
		if(key==arr[mid]) {
			return mid;
		}
		else if(key<arr[mid]) {
			left=mid+1;
		}
		else if(key>arr[mid]){
			right=mid-1;
		}
		}
		
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {77,66,55,44,33,22,11};
		
		System.out.println("Enter element to be searched");
		int key=new Scanner(System.in).nextInt();
		
		int index=BinarySearch(arr,arr.length,key);
		if(index!=-1) {
			System.out.println("Element to be searched"+index);
		}
		else {
			System.out.println("Element not found");
		}
	}

}
