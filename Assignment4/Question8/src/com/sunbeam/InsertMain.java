package com.sunbeam;

public class InsertMain {

	public static void main(String[] args) {
		Insert insert=new Insert();
		insert.inertSorted(80);
		insert.inertSorted(70);
		insert.inertSorted(60);
		insert.inertSorted(50);
		insert.inertSorted(10);
		insert.inertSorted(30);
		insert.inertSorted(20);
		insert.inertSorted(40);
		
		System.out.println("Inserted list :");
		insert.display();

	}

}