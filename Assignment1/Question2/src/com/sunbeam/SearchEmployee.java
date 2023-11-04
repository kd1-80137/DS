package com.sunbeam;

import java.util.Scanner;

public class SearchEmployee {

	public static int SearchByEmpID(Employee[] arr, int size, int empid) {
		  
		for(int i=0;i<size;i++)

			if (empid == arr[i].getEmpid()) {
				System.out.println("Iterations=" + empid);
				return i;
			} 
		return -1;
	}
	
	public static int SearchByName(Employee[] arr, int size, String name) {
		
		for (int i = 0; i < size; i++) {
			
		if (name == arr[i].getName()) {
			System.out.println("Iteration=" + name);
			return i;
		} 
	}
      return -1;
	}
		
  public static int SearchBySalary(Employee[] arr, int size, Double salary) {
	  
	  for(int i=0;i<size;i++) {
		  if (salary == arr[i].getSalary()) {
				System.out.println("Iteration=" + salary);
				return i;  
	  }
  }
	  return -1;
	  
  }
	  
  
	
	
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		
		arr[0] = new Employee(1, "e1", 1000);
		arr[1] = new Employee(2, "e2", 2000);
		arr[2] = new Employee(3, "e3", 3000);
		arr[3] = new Employee(4, "e4", 4000);
		arr[4] = new Employee(5, "e5", 5000);
		
		
		int choice;
		do {
			System.out.println("1.Search by empid");
			System.out.println("2.Search by name");
			System.out.println("3.Search by salary");
			System.out.println("Enter choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
		switch(choice) {
		
		case 1:System.out.println("Enter id to be searched");
		int empid = new Scanner(System.in).nextInt();
		
		int index = SearchByEmpID(arr, arr.length, empid);
		if (index != -1) {
			System.out.println("Employee details" + arr[index]);
		} else {
			System.out.println("Employee not found");
		}
			
		
		break;
				
		case 2:
			
			System.out.println("Enter name to be searched");
			String name = new Scanner(System.in).next();
			
			int index2=SearchByName(arr, arr.length, name);
			if (index2 != -1) {
				System.out.println("Employee details" + arr[index2]);
			} else {
				System.out.println("Employee not found");
			}
			break;
			
		case 3:
			
			System.out.println("Enter salary to be searched");
			Double salary = new Scanner(System.in).nextDouble();
			
			int index3=SearchBySalary(arr,arr.length,salary);
			if(index3!=-1) {
				System.out.println("Employee details="+arr[index3]);
			}
			else {
				System.out.println("Employee not found");
			}
			break;

		} 

		}while (choice != 0);
	}
}

