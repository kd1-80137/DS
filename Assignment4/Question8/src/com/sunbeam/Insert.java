package com.sunbeam;

public class Insert {
	private class Node {
        int data;
        Node next;

        Node(int value) {
            data = value; 
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public Insert() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void inertSorted(int value)
    {
    	Node newnode=new Node(value);
    	if(isEmpty() || head.data>=value)
    	{
    		newnode.next=head;
    		head=newnode;
    	}
    	else
    	{
    		Node trav=head;
    		while(trav.next!=null && trav.next.data<value)
    		{
    			trav=trav.next;
    		}
    		newnode.next=trav.next;
    		trav.next=newnode;
    	}
    }
    
    public void display() {
        Node trav = head;
        System.out.println("List:");
        while (trav != null) {
            System.out.print(" " + trav.data);
            trav = trav.next;
        }
        System.out.println("");
    }

}
