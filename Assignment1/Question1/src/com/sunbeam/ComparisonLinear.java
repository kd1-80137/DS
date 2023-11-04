
package com.sunbeam;

import java.util.Scanner;

public class ComparisonLinear {
	
	public static int LinearSearch(int arr[],int size,int key,int[] comparison) {
		int count=0;
		
		
		for(int i=0;i<size;i++) {
			count++;
			if(arr[i]==key) {
				 comparison[0]=count;	
				return count;
			}		
		}
		return -1;
	}
	
	

	public static void main(String[] args)
	{
		int arr[]= {11,99,22,88,33,77,44,55,66};
		int[] comparison=new int[1];
		
		
		System.out.println("Enter key to be searched");
		int key=new Scanner(System.in).nextInt();
		
		int index=LinearSearch(arr,arr.length,key,comparison);
		if(index!=-1) {
			System.out.println("Key found at index:"+index);
			System.out.println("Count="+comparison[0]);
		}
		else {
			System.out.println("Key not found");
		}

	}

}
