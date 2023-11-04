package com.sunbeam;

public class List 
{
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}		
	}
	private Node head;
	
	public List()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	void addFirst(int value)
	{
		Node newnode=new Node(value);
		
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;	
		}
	}
	
	public void addLast(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
			Node trav=head;
			while(trav.next!=null)
				trav=trav.next;
			trav.next=newnode;
		}
	}
	
	public void display()
	{
		Node trav=head;
		System.out.println("List=");
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	
	public void revList()
	{
		Node t1=head;
		Node t2=head.next;
		
		head.next=null;
		while(head!=null)
		{
			head=t2.next;
		t2.next=t1;
		t1=t2;
		t2=head;
		}
		head=t1;
	}

}
