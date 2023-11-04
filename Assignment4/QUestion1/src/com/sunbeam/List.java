package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = head;

		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = head;
		} else {

			tail.next = newnode;
			tail = tail.next;

		}

	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			head = head.next;

		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is empty");

		} else {
			Node trav = head;
			while (trav.next != tail)
				trav = trav.next;
			tail = trav;
			tail.next = null;

		}

	}

	public void displayList() {
		Node trav = head;
		System.out.println("List:");
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}

}
