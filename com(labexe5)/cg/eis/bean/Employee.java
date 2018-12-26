package com.cg.eis.bean;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private char insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(char insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
}
