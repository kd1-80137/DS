package com.sunbeam;

import java.util.Scanner;

public class NthOccurence {
	
	public static int linearSearch(int arr[],int size,int key,int n) {
	   int count=0;
	   
		for(int i=0;i<size;i++) {
			
			if(arr[i]==key) {
				count++;
				if(count==n) {
					return i;
				}
				
			}
		}		
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[]= {12,24,36,48,60,72,84,96,72,96};
		System.out.println("Enter key to be searched");
		int key=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Occurence to be searched");
		int n=new Scanner(System.in).nextInt();
		
		int index=linearSearch(arr,arr.length,key,n);
		if(index!=-1) {
			System.out.println("Occurence="+index);
		}
		else
		{
			System.out.println("Occurence not found");
		}

	}

}
