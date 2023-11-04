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

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;

		else {
			Node trav=head;
			while(trav.next!=null)
				trav=trav.next;
			trav.next=newnode;		
		}
	}

	public void findMid()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		return;
		}
		
		else 
		{
			Node slow=head;
			Node fast=head;
			
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
			}
			System.out.println("Middle node value="+slow.data);
		}
	}
	
	
	
	public void displayList() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}


}
