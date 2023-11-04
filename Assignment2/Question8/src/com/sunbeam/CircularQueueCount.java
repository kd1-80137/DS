package com.sunbeam;

public class CircularQueueCount {
	private final int SIZE;
	private int arr[];
	private int counter, front,rear;

	CircularQueueCount(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		counter = -1;
		rear=-1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Queue is full");

		} 
		else {
			counter++;
			rear++;
			arr[rear% SIZE] = data;
		}
	}

	public int pop() {
		if(!isEmpty()) {
			counter--;
			front++;
			return arr[front%SIZE];
		}
		else
			System.out.println("Queue is empty");
		return 0;
		
	}
	public int peek() {
		if(!isEmpty()) {
			front=(front+1)%SIZE;
			return arr[front];
		}
		else 
			System.out.println("Queue is Empty");
		return 0;
			
	}

	public boolean isEmpty() {
		
		return counter < SIZE && counter == -1;
	}

	public boolean isFull() {
		return counter == SIZE - 1;
	}

}
