package com.sunbeam;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		List l1=new List();
		

		l1.addFirst('n');
		l1.addFirst('u');
		l1.addFirst('s');
		l1.addLast('b');
		l1.addLast('e');
		l1.addLast('a');
		l1.addLast('m');
		
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.addLast('z');
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.addPosition('@', 3);
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deleteFirst();
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deleteLast();
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deletePosition(4);
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
	}

}
