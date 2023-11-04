package com.sunbeam;

public class ReverseListMain {

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
	    list.addNode(1);
	    list.addNode(2);
	    list.addNode(3);
	    list.addNode(4);

	    System.out.println("Original List:");
	    list.display();

	    list.reverseList();

	    System.out.println("Reversed List:");
	    list.display();

	}

}
