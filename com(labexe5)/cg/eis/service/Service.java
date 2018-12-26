package com.cg.eis.service;

public class Service implements EmployeeService
{
	private double salary;
	private String designation;
	private String insuranceScheme;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
//	public String getInsuranceScheme() {
//		return insuranceScheme;
//	}
//	public void setInsuranceScheme(String insuranceScheme) {
//		this.insuranceScheme = insuranceScheme;
//	}
//@Override
	public String toString() {
		return "salary=" + salary + ", designation=" + designation;
	}
	public void employeeInsurance()
	{
		if(salary>5000 && salary<20000)// && designation=="Trainee")
		{
			insuranceScheme="Scheme C";
		}
		else if ((salary>=20000 && salary<40000) && designation=="Programmer")
		{

			insuranceScheme="Scheme B";
		}
		else if(salary>=40000 && designation=="Manager")
		{

			insuranceScheme="Scheme A";
		}
		else
		{
			insuranceScheme="No Scheme";
		}
		System.out.println("Insurance Scheme is "+insuranceScheme);
	}
	
}
