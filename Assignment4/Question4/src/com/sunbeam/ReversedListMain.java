package com.sunbeam;

public class ReversedListMain {

	public static void main(String[] args) 
	{
		List l1=new List();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		
		l1.display();
		l1.revList();
		l1.display();
	}

}
