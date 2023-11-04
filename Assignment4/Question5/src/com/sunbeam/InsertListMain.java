package com.sunbeam;

public class InsertListMain {

    public static void main(String[] args) {
        InsertList l1 = new InsertList();

        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        l1.addNode(5);

        System.out.println("Original List:");
        l1.display();

        System.out.println("---------------------");
        l1.insertAfter(9,4); // Insert 9 after the node with value 4
        System.out.println("After Given Node:");
        l1.display();

        System.out.println("----------------------");
        l1.insertBefore(6, 4); // Insert 6 before the node with value 4
        System.out.println("Before Given Node:");
        l1.display();
    }
}