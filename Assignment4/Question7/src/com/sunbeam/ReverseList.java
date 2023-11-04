package com.sunbeam;

public class ReverseList {
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

	    public ReverseList() {
	        head = null;
	        tail = null;
	    }

	    public boolean isEmpty() {
	        return head == null;
	    }

	    public void addNode(int value) {
	        Node newnode = new Node(value);
	        if (isEmpty()) {
	            head = newnode;
	            tail = newnode;
	        } else {
	            newnode.next = head;
	            head = newnode;
	        }
	    }
	    
	    public void reverseList() {
	        if (isEmpty() || head.next == null)
	        {
	            return; 
	        }
	        Node t1 = head;
	        Node t2 = head.next;
	        head.next = null;

	        while (t2 != null)
	        {
	            Node temp = t2.next;
	            t2.next = t1;
	            t1 = t2;
	            t2 = temp;
	        }

	        head = t1;
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