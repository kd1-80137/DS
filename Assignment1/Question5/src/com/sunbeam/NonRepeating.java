package com.sunbeam;

import java.util.Scanner;

public class NonRepeating {

	public static int LinearSearch(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i != j && arr[i] == arr[j])
					break;
				if (j == arr.length - 1)

					return arr[i];
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		Scanner sc = new Scanner(System.in);

		int index = LinearSearch(arr, arr.length);

		if (index != -1) {
			System.out.println("Non-repeating element is" + index);
		}
	}

}
