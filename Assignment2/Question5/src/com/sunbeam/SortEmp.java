package com.sunbeam;

public class SortEmp {
	
	public static void sort(Employee arr[])
	{int flag;
		for(int i=0;i<arr.length-1 ;i++)
		{	flag=0;
		
			for(int j=0;j<arr.length-i-1;j++) {
				  if(arr[j].getSalary()>arr[j+1].getSalary())
				  {
					  double temp=arr[j].getSalary();
					  arr[j].setSalary(arr[j+1].getSalary());
					  arr[j+1].setSalary(temp);
					  flag=1;
				  }
			}
			if(flag==0) {
				break;
			}
		}
	}
	
	public static void main(String[] args ) {
		
		 Employee arr[]= new Employee[5];
		 arr[0]= new Employee(1,"anand",8000.0);
		 arr[1]= new Employee(2,"raj",9000.0);
		 arr[2]= new Employee(3,"rakesh",10000.0);
		 arr[3]= new Employee(4,"parth", 7000.0);
		 arr[4]= new Employee(5, "zayn", 13000.0);
		 
		 //
		System.out.println("Employees Before Sort");
		 for(Employee e : arr)
			 System.out.println(e);
		 
		 //bubble sort employee
		 System.out.println("Employees after sort");
		 sort(arr);
		 for(Employee e: arr)
			 System.out.println(e);
		
	}

}
