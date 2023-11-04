package com.sunbeam;

import java.util.Scanner;

public class Rank {

	public static int Rank(int arr[], int size, int key) {

		int count = 0;

		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter key to be searched");
		int key = sc.nextInt();

		int index = Rank(arr, arr.length, key);
		if (index != -1) {
			System.out.println("Rank =" + index);
		} else {
			System.out.println("key not found");
		}
	}

}
