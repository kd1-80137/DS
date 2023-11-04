package com.sunbeam;


public class BubbleSortSLList {
public class Node{
	private int data;
	private Node next;
	private Node prev;
	public Node(int value) {
		data=value;
		next=null;
	}
}
private Node head;
private Node tail;
public BubbleSortSLList() {
	head=null;
	tail=null;
}
public boolean isEmpty() {
	return head==null && tail==null;
}

public void addNode(int value) {
	Node nn=new Node(value);
	if(head==null) {
		head=nn;
		tail=nn;
	}
	else {
		tail.next=nn;
		tail=nn;
	}
	
}
public void BubbleSort() {
	Node trav=head ,index=null;
	

	
	if(head==null)
		return;
	else {
		while(trav!=null) {
			index=trav.next;
			
			while(index!=null) {
				
				
				if(trav.data>index.data) {
					
					int temp=trav.data;
					trav.data=index.data;
					index.data=temp;
					
				}
				index=index.next;
					
			}
			trav=trav.next;
		}
	}
	
}
public void display()
{
	Node trav=head;
	System.out.println("List:");
	while(trav!=null) {
		System.out.print(" "+trav.data);
		trav=trav.next;
		
	}
	System.out.println(" ");
}
}
