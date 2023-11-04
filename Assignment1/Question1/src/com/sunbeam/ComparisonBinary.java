package com.sunbeam;

import java.util.Scanner;

public class ComparisonBinary {
	
	public static int BinarySearch(int arr[],int size,int key) {
		
		int left=0;
		int right=size-1;
		int mid;
		int count=0;
		
	    while(left<=right) {
	    	count++;
	    	mid=(left+right)/2;
	    	
	    	if(key==arr[mid]) {
	    		System.out.println("Index="+mid);
	    		return mid;
	    	}
	    	else if(key<arr[mid]) {
	    		return mid-1;
	    	}
	    	else {
	    		left=mid+1;
	    	} 
	    }	
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[]= {11,22,44,66,35,87,65,74};
		
		System.out.println("Enter key to be searched");
		int key=new Scanner(System.in).nextInt();
	
		int count=BinarySearch(arr,arr.length,key);
		if(count!=-1) {
			 System.out.println("Count"+count);	
		}
		else
		{
			System.out.println("Key not found");
		}
	    
	    
	   
	}

}
