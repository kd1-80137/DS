package com.sunbeam;


public class InsertList {
    private class Node {
        int data; 
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;  

    public InsertList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            head = newnode;
            
        } else {
        	Node trav=head;
        	while(trav.next!=null)
        	{
        		trav=trav.next;
        	}
        	trav.next=newnode;
        }
    }
    
    
    public void insertAfter(int valueToInsert,int valueToFind)
    {
    	Node newnode=new Node(valueToInsert);
    	
    	if(isEmpty()) {
    		head=newnode;
    	}
    	else 
    	{
    		Node trav=head;
    		while(trav!=null)
    		{
    			if(trav.data==valueToFind)
    			{
    				newnode.next=newnode.next;
    				trav.next=newnode;
    				break;
    			}
    			trav=trav.next;
    		}
    	}
    		
    }
   
    public void insertBefore(int valueToInsert, int valueToFind)
    {
        Node newNode = new Node(valueToInsert);
        if (isEmpty() || head.data == valueToFind) 
        {
            newNode.next = head;
            head = newNode;
        } 
        else 
        {
            Node current = head;
            while (current.next != null) 
            {
                if (current.next.data == valueToFind) 
                {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
    }
    public void display()
    {
    	Node trav=head;
    	System.out.print("List :");
    	while(trav!=null)
    	{
    		System.out.print(trav.data+" ");
    		trav=trav.next;
    	}
    	System.out.println();
    }
}