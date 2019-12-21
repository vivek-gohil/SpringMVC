package com.mindgate.model;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Object Created !!");
	}

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		System.out.println("getEmployeeId");
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("set EmployeeId :: " + employeeId);
		this.employeeId = employeeId;
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
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
