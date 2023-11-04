package com.sunbeam;

public class FindMinMaxMain {

	public static void main(String[] args) {
		FindMinMax find=new FindMinMax();
		
		find.addNode(80);
		find.addNode(70);
		find.addNode(60);
		find.addNode(50);
		find.addNode(40);
		find.addNode(30);
		find.addNode(20);
		find.addNode(10);
		

		find.display();
		System.out.println("---------Maximum Value------------");
		
		int maxValue=find.findMax();
		System.out.println("Maximum Value :"+maxValue);
		
		System.out.println("---------Minimum Value------------");
		int minValue=find.findMin();
		System.out.println("Minmum Value :"+minValue);

	}

}
