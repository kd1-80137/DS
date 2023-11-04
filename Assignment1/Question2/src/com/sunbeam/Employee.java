package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee
{
	private int empid;
	private String name;
	private double salary;
	
	Employee()
	{
		
	}
	
	public Employee(int empid, String name, double salary) {
	
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void accept() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter empid");
		empid=sc.nextInt();
		System.out.println("Enter name=");
		name=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextDouble();	
	}
	

}
